
package compilador.semantico;

import compilador.Estruturas.Niveis;
import compilador.Erros.ErroSintatico;
import compilador.Erros.ErroSemantico;
import compilador.Estruturas.MapaNaoTerminais;
import compilador.Estruturas.Token;
import compilador.Estruturas.MapaTokens;
import compilador.Estruturas.Procedures;
import compilador.Estruturas.TabelaParsing;
import compilador.Estruturas.TipoIdentificador;
import java.util.Stack;
import javax.swing.JOptionPane;


public class Sintatico {

    Stack<Token> a;
    Stack<Integer> x;
    TabelaParsing tabelaparsing;

    Stack<TipoIdentificador> pilhaIdentificador = new Stack<>(); 
    Stack<String> pilhaNome = new Stack<>();

    MapaNaoTerminais mapaNaoTerminais = new MapaNaoTerminais();
    MapaTokens mapatokens = new MapaTokens();
    int begins = 0;
    Niveis niveis = new Niveis();
    Procedures proced = new Procedures();

    public Sintatico(Stack<Token> pilhatokens) {
        this.a = pilhatokens;
        this.x = new Stack<>();
        this.tabelaparsing = new TabelaParsing();
        x.push(mapaNaoTerminais.getCodigo("PROGRAMA"));
    }

    public void AnaliseSintatica() throws ErroSintatico, ErroSemantico {
        Integer simbolo;
        Token token;

        String categoria = "";
        int nivel = -1;
        String tipo = "";
        String nome = "";
        String procedure = "";
        boolean declaracao = true;

        while (!a.empty()) {

            simbolo = x.peek();
            token = a.peek();

            if (simbolo < 52) {

                if (simbolo == token.getCodigo()) {
                    
                    nivel = alteraNivel(token, nivel);
                    
                    System.out.println("nivel:"+nivel);
                    System.out.println("token:"+token);

                    if (token.getCodigo().toString().matches("[1-5]")) {
                        categoria = token.getPalavra();
                        System.out.println("categoria :"+categoria);
                        declaracao = true;

                        
                    } else if (token.getPalavra().equals("Call")) {
                        categoria = token.getPalavra();

                    } else if (categoria.equals("Call") && token.getCodigo() == 25) {
                        categoria = "";
                    } else if (token.getPalavra().equals("(") && categoria.equals("procedure")) {

                        categoria = "Parametro";
                    } else if (token.getCodigo() == 25 && categoria.equals("Parametro")) {
                        proced.iniciaProcedure(procedure);
                        proced.insereProcedure(procedure, token.getPalavra(), "Integer");

                    } else if (token.getPalavra().equals(")") && categoria.equals("Parametro")) {
                        categoria = "Procedure";
                    } else if (token.getCodigo() == 25 && declaracao) {
                        if (categoria.equals("Procedure")) {
                            procedure = token.getPalavra();
                        }
                        if (categoria.equals("Program") || categoria.equals("Procedure")) {
                            niveis.InsereNivel(nivel, token.getPalavra(), token.getLinha());
                            TipoIdentificador ident = new TipoIdentificador(token.getPalavra(), categoria, "", nivel);
                            if (!pilhaIdentificador.contains(ident)) {
                                pilhaIdentificador.push(ident);
                            } else {
                                throw new ErroSemantico("Variável já existe! \n " + " " + token.getPalavra() + " " + " \n Linha" + token.getLinha());
                            }

                        } else if (categoria.equals("Var")) {
                            declaracao = true;
                            niveis.InsereNivel(nivel, token.getPalavra(), token.getLinha());
                            pilhaNome.push(token.getPalavra());
                        } else if (categoria.equals("Label")) {
                            declaracao = true;
                            niveis.InsereNivel(nivel, token.getPalavra(), token.getLinha());
                            TipoIdentificador ident = new TipoIdentificador(token.getPalavra(), categoria, "Literal", nivel);
                            if (!pilhaIdentificador.contains(ident)) {
                                pilhaIdentificador.push(ident);
                            }
                        } else if (categoria.equals("Const")) {
                            declaracao = true;
                            niveis.InsereNivel(nivel, token.getPalavra(), token.getLinha());
                            TipoIdentificador ident = new TipoIdentificador(token.getPalavra(), categoria, "Integer", nivel);
                            if (!pilhaIdentificador.contains(ident)) {
                                pilhaIdentificador.push(ident);
                            }
                        }

                    } else if (token.getCodigo() == 25 && !declaracao) {
                        boolean existe = false;
                        for (int i = 0; i < pilhaIdentificador.size(); i++) {

                            if (pilhaIdentificador.elementAt(i).nome.matches(token.getPalavra())) {
                                existe = true;
                                break;
                            }
                        }
                        if (!existe) {
                            throw new ErroSemantico("Variavel não declarada\n" + token.getPalavra() + " " + " \n Linha:" + token.getLinha());
                        }
                        
                    } else if (token.getCodigo().toString().matches("6")) {
                        declaracao = false;
                        begins++;
                    } else if (token.getCodigo().toString().matches("8") || token.getCodigo().toString().matches("48")) {
                        tipo = token.getPalavra();
                        while (!pilhaNome.empty()) {
                            TipoIdentificador identificador = new TipoIdentificador(pilhaNome.pop(), categoria, tipo, nivel);
                            if (!pilhaIdentificador.contains(identificador)) {
                                pilhaIdentificador.push(identificador);
                            } else {
                               
                            }

                        }

                    }
                    //fim da parte semantica lurian!
                    x.pop();
                    a.pop();
                } else {
                    throw new ErroSintatico("Erro sintatico:\n " + token.getPalavra() + " \n Na linha:" + token.getLinha());

                }

            } else {
                String derivado = tabelaparsing.getDerivacao(simbolo, token);
                if ("NULL".equals(derivado)) {
                    x.pop();
                } else if (derivado == null) {
                    throw new ErroSintatico("Derivação nula! \n" + token.getPalavra() + "\n Na linha:" + token.getLinha());
                } else {
                    Derivacao(x.pop(), derivado);
                }

            }

        }
        if (x.empty()) {
            JOptionPane.showMessageDialog(null, "Sucesso!");
            System.out.println("Sucesso!");
        } else {
            throw new ErroSintatico("Erro de pilha!");
        }
        
    }

    public int alteraNivel(Token palavra, int nivel) {
        if (palavra.getCodigo().toString().matches("1|5|13|16|18")) {
            System.out.println("altera nivel \n "+palavra);
            nivel++;
            System.out.println("altera nivel ,nivel: \n "+nivel);
                    
            niveis.setNivel(nivel);
            System.out.println(nivel);

        } else if (palavra.getPalavra().equals("End") && begins == 1) {
            niveis.limpaNivel(nivel);
            nivel--;
            System.out.println(palavra);
            System.out.println(nivel);
        } else if (palavra.getPalavra().equals("End") && begins > 1) {
            begins--;

        }
        return nivel;
    }

    public void Derivacao(Integer simbolo, String derivado) throws ErroSintatico {

        String[] producao = derivado.split("\\|");

        for (int i = producao.length - 1; i >= 0; i--) {
            if (mapaNaoTerminais.existeSimbolo(producao[i])) {
                x.push(mapaNaoTerminais.getCodigo(producao[i]));

            } else if (mapatokens.existeToken(producao[i])) {
                x.push(mapatokens.getCodigo(producao[i]));
            } else {
                throw new ErroSintatico("" + a.peek().getPalavra() + a.peek().getLinha());
            }

        }

    }

}

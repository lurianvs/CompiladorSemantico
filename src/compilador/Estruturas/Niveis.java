
package compilador.Estruturas;

import compilador.Erros.ErroSemantico;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Niveis {

    private Map<Integer, Set<String>> niveis = new HashMap<>();
    
    public void setNivel(int nivel){
        niveis.put(nivel, new HashSet<>());
    }

    public void InsereNivel(int nivel, String variavel, int linha) throws ErroSemantico {

        if (niveis.get(nivel).contains(variavel)) {
            throw new ErroSemantico("Variavel já Existe!!\n" +variavel+ "\n Linha:" + linha);
        } else {
            niveis.get(nivel).add(variavel);
        }
    }

    public void limpaNivel(int nivel){
        niveis.get(nivel).clear();
        System.out.println(niveis.get(nivel));
    }

    public void ConfereNivel(int nivel, String variavel, int linha) throws ErroSemantico {

        if (!niveis.get(nivel).contains(variavel)) {
            throw new ErroSemantico("Variavel não foi declarada! \n :" + variavel + " \n Linha:" + linha);
        } else {
            niveis.get(nivel).add(variavel);
        }
    }

}

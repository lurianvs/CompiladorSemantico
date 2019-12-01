
package compilador.Estruturas;


public class TabelaParsing {
    
    
        private final String[][] tabelaparsing;

    public TabelaParsing() {
        this.tabelaparsing = new String[200][100];
        
        tabelaparsing[52][1] = "Program|Identificador|;|BLOCO|.";
        tabelaparsing[53][2] = "DCLROT|DCLCONST|DCLVAR|DCLPROC|CORPO";
        tabelaparsing[53][3] = "DCLROT|DCLCONST|DCLVAR|DCLPROC|CORPO";
        tabelaparsing[53][4] = "DCLROT|DCLCONST|DCLVAR|DCLPROC|CORPO";
        tabelaparsing[53][5] = "DCLROT|DCLCONST|DCLVAR|DCLPROC|CORPO";
        tabelaparsing[53][6] = "DCLROT|DCLCONST|DCLVAR|DCLPROC|CORPO";
        tabelaparsing[54][2] = "Label|LID|;";
        tabelaparsing[54][3] = "NULL";
        tabelaparsing[54][4] = "NULL";
        tabelaparsing[54][5] = "NULL";
        tabelaparsing[54][6] = "NULL";
        tabelaparsing[55][25] = "Identificador|REPIDENT";
        tabelaparsing[56][39] = "NULL";
        tabelaparsing[56][46] = ",|Identificador|REPIDENT";
        tabelaparsing[56][47] = "NULL";
        tabelaparsing[57][3] = "Const|Identificador|=|Inteiro|;|LDCONST";
        tabelaparsing[57][4] = "NULL";
        tabelaparsing[57][5] = "NULL";
        tabelaparsing[57][6] = "NULL";
        tabelaparsing[58][4] = "NULL";
        tabelaparsing[58][5] = "NULL";
        tabelaparsing[58][6] = "NULL";
        tabelaparsing[58][25] = "Identificador|=|Inteiro|;|LDCONST";
        tabelaparsing[59][4] = "Var|LID|:|TIPO|;|LDVAR";
        tabelaparsing[59][5] = "NULL";
        tabelaparsing[59][6] = "NULL";
        tabelaparsing[60][5] = "NULL";
        tabelaparsing[60][6] = "NULL";
        tabelaparsing[60][25] = "LID|:|TIPO|;|LDVAR";
        tabelaparsing[61][8] = "Integer";
        tabelaparsing[61][9] = "Array|[|Inteiro|..|Inteiro|]|Of|Integer";
        tabelaparsing[62][5] = "Procedure|Identificador|DEFPAR|;|BLOCO|;|DCLPROC";
        tabelaparsing[62][6] = "NULL";
        tabelaparsing[63][36] = "(|LID|:|Integer|)";
        tabelaparsing[63][39] = "NULL";
        tabelaparsing[63][47] = "NULL";
        tabelaparsing[64][6] = "Begin|COMANDO|REPCOMANDO|End";
        tabelaparsing[65][7] = "NULL";
        tabelaparsing[65][47] = ";|COMANDO|REPCOMANDO";
        tabelaparsing[66][6] = "CORPO";
        tabelaparsing[66][7] = "NULL";
        tabelaparsing[66][11] = "Call|Identificador|PARAMETROS";
        tabelaparsing[66][12] = "Goto|Identificador";
        tabelaparsing[66][13] = "If|EXPRESSAO|Then|COMANDO|ELSEPARTE";
        tabelaparsing[66][15] = "NULL";
        tabelaparsing[66][16] = "While|EXPRESSAO|Do|COMANDO";
        tabelaparsing[66][18] = "Repeat|COMANDO|Until|EXPRESSAO";
        tabelaparsing[66][19] = "NULL";
        tabelaparsing[66][20] = "Readln|(|VARIAVEL|REPVARIAVEL|)";
        tabelaparsing[66][21] = "Writeln|(|ITEMSAIDA|REPITEM|)";
        tabelaparsing[66][25] = "Identificador|RCOMID";
        tabelaparsing[66][27] = "For|Identificador|:=|EXPRESSAO|To|EXPRESSAO|Do|COMANDO";
        tabelaparsing[66][29] = "Case|EXPRESSAO|Of|CONDCASE|End";
        tabelaparsing[66][47] = "NULL";
        tabelaparsing[67][34] = "RVAR|:=|EXPRESSAO";
        tabelaparsing[67][38] = "RVAR|:=|EXPRESSAO";
        tabelaparsing[67][39] = ":|COMANDO";
        tabelaparsing[68][34] = "[|EXPRESSAO|]";
        tabelaparsing[68][38] = "NULL";
        tabelaparsing[69][7] = "NULL";
        tabelaparsing[69][15] = "NULL";
        tabelaparsing[69][19] = "NULL";
        tabelaparsing[69][36] = "(|EXPRESSAO|REPPAR|)";
        tabelaparsing[69][47] = "NULL";
        tabelaparsing[70][37] = "NULL";
        tabelaparsing[70][46] = ",|EXPRESSAO|REPPAR";
        tabelaparsing[71][7] = "NULL";
        tabelaparsing[71][15] = "Else|COMANDO";
        tabelaparsing[71][19] = "NULL";
        tabelaparsing[71][47] = "NULL";
        tabelaparsing[72][25] = "Identificador|VARIAVEL1";
        tabelaparsing[73][7] = "NULL";
        tabelaparsing[73][10] = "NULL";
        tabelaparsing[73][14] = "NULL";
        tabelaparsing[73][15] = "NULL";
        tabelaparsing[73][17] = "NULL";
        tabelaparsing[73][19] = "NULL";
        tabelaparsing[73][22] = "NULL";
        tabelaparsing[73][23] = "NULL";
        tabelaparsing[73][28] = "NULL";
        tabelaparsing[73][30] = "NULL";
        tabelaparsing[73][31] = "NULL";
        tabelaparsing[73][32] = "NULL";
        tabelaparsing[73][33] = "NULL";
        tabelaparsing[73][34] = "[|EXPRESSAO|]";
        tabelaparsing[73][35] = "NULL";
        tabelaparsing[73][37] = "NULL";
        tabelaparsing[73][40] = "NULL";
        tabelaparsing[73][41] = "NULL";
        tabelaparsing[73][42] = "NULL";
        tabelaparsing[73][43] = "NULL";
        tabelaparsing[73][44] = "NULL";
        tabelaparsing[73][45] = "NULL";
        tabelaparsing[73][46] = "NULL";
        tabelaparsing[73][47] = "NULL";
        tabelaparsing[74][37] = "NULL";
        tabelaparsing[74][46] = ",|VARIAVEL|REPVARIAVEL";
        tabelaparsing[75][24] = "EXPRESSAO";
        tabelaparsing[75][25] = "EXPRESSAO";
        tabelaparsing[75][26] = "EXPRESSAO";
        tabelaparsing[75][30] = "EXPRESSAO";
        tabelaparsing[75][31] = "EXPRESSAO";
        tabelaparsing[75][36] = "EXPRESSAO";
        tabelaparsing[75][48] = "Literal";
        tabelaparsing[76][37] = "NULL";
        tabelaparsing[76][46] = ",|ITEMSAIDA|REPITEM";
        tabelaparsing[77][24] = "EXPSIMP|REPEXPSIMP";
        tabelaparsing[77][25] = "EXPSIMP|REPEXPSIMP";
        tabelaparsing[77][26] = "EXPSIMP|REPEXPSIMP";
        tabelaparsing[77][30] = "EXPSIMP|REPEXPSIMP";
        tabelaparsing[77][31] = "EXPSIMP|REPEXPSIMP";
        tabelaparsing[77][36] = "EXPSIMP|REPEXPSIMP";
        tabelaparsing[78][7] = "NULL";
        tabelaparsing[78][10] = "NULL";
        tabelaparsing[78][14] = "NULL";
        tabelaparsing[78][15] = "NULL";
        tabelaparsing[78][17] = "NULL";
        tabelaparsing[78][19] = "NULL";
        tabelaparsing[78][28] = "NULL";
        tabelaparsing[78][35] = "NULL";
        tabelaparsing[78][37] = "NULL";
        tabelaparsing[78][40] = "=|EXPSIMP";
        tabelaparsing[78][41] = ">|EXPSIMP";
        tabelaparsing[78][42] = ">=|EXPSIMP";
        tabelaparsing[78][43] = "<|EXPSIMP";
        tabelaparsing[78][44] = "<=|EXPSIMP";
        tabelaparsing[78][45] = "<>|EXPSIMP";
        tabelaparsing[78][46] = "NULL";
        tabelaparsing[78][47] = "NULL";
        tabelaparsing[79][24] = "TERMO|REPEXP";
        tabelaparsing[79][25] = "TERMO|REPEXP";
        tabelaparsing[79][26] = "TERMO|REPEXP";
        tabelaparsing[79][30] = "+|TERMO|REPEXP";
        tabelaparsing[79][31] = "-|TERMO|REPEXP";
        tabelaparsing[79][36] = "TERMO|REPEXP";
        tabelaparsing[80][7] = "NULL";
        tabelaparsing[80][10] = "NULL";
        tabelaparsing[80][14] = "NULL";
        tabelaparsing[80][15] = "NULL";
        tabelaparsing[80][17] = "NULL";
        tabelaparsing[80][19] = "NULL";
        tabelaparsing[80][22] = "Or|TERMO|REPEXP";
        tabelaparsing[80][28] = "NULL";
        tabelaparsing[80][30] = "+|TERMO|REPEXP";
        tabelaparsing[80][31] = "-|TERMO|REPEXP";
        tabelaparsing[80][35] = "NULL";
        tabelaparsing[80][37] = "NULL";
        tabelaparsing[80][40] = "NULL";
        tabelaparsing[80][41] = "NULL";
        tabelaparsing[80][42] = "NULL";
        tabelaparsing[80][43] = "NULL";
        tabelaparsing[80][44] = "NULL";
        tabelaparsing[80][45] = "NULL";
        tabelaparsing[80][46] = "NULL";
        tabelaparsing[80][47] = "NULL";
        tabelaparsing[81][24] = "FATOR|REPTERMO";
        tabelaparsing[81][25] = "FATOR|REPTERMO";
        tabelaparsing[81][26] = "FATOR|REPTERMO";
        tabelaparsing[81][36] = "FATOR|REPTERMO";
        tabelaparsing[82][7] = "NULL";
        tabelaparsing[82][10] = "NULL";
        tabelaparsing[82][14] = "NULL";
        tabelaparsing[82][15] = "NULL";
        tabelaparsing[82][17] = "NULL";
        tabelaparsing[82][19] = "NULL";
        tabelaparsing[82][22] = "NULL";
        tabelaparsing[82][23] = "And|FATOR|REPTERMO";
        tabelaparsing[82][28] = "NULL";
        tabelaparsing[82][30] = "NULL";
        tabelaparsing[82][31] = "NULL";
        tabelaparsing[82][32] = "*|FATOR|REPTERMO";
        tabelaparsing[82][33] = "/|FATOR|REPTERMO";
        tabelaparsing[82][35] = "NULL";
        tabelaparsing[82][37] = "NULL";
        tabelaparsing[82][40] = "NULL";
        tabelaparsing[82][41] = "NULL";
        tabelaparsing[82][42] = "NULL";
        tabelaparsing[82][43] = "NULL";
        tabelaparsing[82][44] = "NULL";
        tabelaparsing[82][45] = "NULL";
        tabelaparsing[82][46] = "NULL";
        tabelaparsing[82][47] = "NULL";
        tabelaparsing[83][24] = "Not|FATOR";
        tabelaparsing[83][25] = "VARIAVEL";
        tabelaparsing[83][26] = "Inteiro";
        tabelaparsing[83][36] = "(|EXPRESSAO|)";
        tabelaparsing[84][26] = "Inteiro|RPINTEIRO|:|COMANDO|CONTCASE";
        tabelaparsing[85][7] = "NULL";
        tabelaparsing[85][47] = ";|CONDCASE";
        tabelaparsing[86][39] = "NULL";
        tabelaparsing[86][46] = ",|Inteiro|RPINTEIRO";
    }
    

    public String getDerivacao(Integer terminal, Token token){
        return tabelaparsing[terminal][token.getCodigo()];
}
    
    
}

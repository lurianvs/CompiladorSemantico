package compilador.Erros;

import javax.swing.JOptionPane;


public class ErroSemantico extends Exception{
        public ErroSemantico(String message) {
        super("Erro semantico: " + message);
        JOptionPane.showMessageDialog(null, "Erro semantico: " + "\n  "+ message);
    }
}

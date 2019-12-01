
package compilador.Erros;

import javax.swing.JOptionPane;

public class ErroLexico extends Exception{
    
    public ErroLexico(String message,int linha) {
        
        super("Erro lexico: "+message+"\n Na linha: "+linha);
        JOptionPane.showMessageDialog(null,"Erro lexico: "+message+"\n Na linha: "+linha);
        
    }  
}


package compilador.Estruturas;

import java.util.HashMap;

public class Procedures {

    public HashMap<String, HashMap<String, String>> proceduremap = new HashMap<>();

    public void iniciaProcedure(String procedure){
        proceduremap.put(procedure,new HashMap<>());
    }
    public void insereProcedure(String procedure,String parametro,String tipo){
        proceduremap.get(procedure).put(parametro, tipo);
    }
}

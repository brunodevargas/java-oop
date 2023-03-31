
package pooexmetespeciais;


public class POOExMetEspeciais {
    public static void main(String[] args) {
        
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(111);
        p1.setDono("Mike Jordan");
        p1.abrirConta("CC");
        p1.depositar(100);
        
        
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(777);
        p2.setDono("Cria");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(100);
        
        
        
        p1.estadoAtual();
        p2.estadoAtual();
        
    }
    
}

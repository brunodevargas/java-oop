package poo9herançasobreposição;

public class POO9HerançaSobreposição {

    public static void main(String[] args) {
       Aluno a1 = new Aluno();
       a1.setNome("Pedro");
       a1.pagarMensalidade();
       
        System.out.println("--------------");
        
       Bolsista b1 = new Bolsista();
       b1.setNome("João");
       b1.setMatricula(1211);
       b1.setBolsa(12.5f);
       b1.setSexo("M");
       b1.pagarMensalidade();
       
    }
    
}

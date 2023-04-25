package poo9herançasobreposição;
public class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa() {
        System.out.println("Renovando bolsa de "+ this.getNome());
    }
    
    @Override   //método sobreposto. Pagamento de bolsista é diferente do aluno em geral
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista! Pagamento confirmado.");
        
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
    
    
}

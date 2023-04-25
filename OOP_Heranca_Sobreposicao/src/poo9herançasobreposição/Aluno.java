package poo9herançasobreposição;
public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
    
    /* se por exemplo eu botasse public final void, daria erro no pagarMens() do bolsista pq
    um método final não pode ser sobrescrito.
    */
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade de aluno "+ this.getNome());  
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    
}

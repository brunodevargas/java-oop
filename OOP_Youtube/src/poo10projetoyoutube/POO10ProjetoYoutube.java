/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo10projetoyoutube;

/**
 *
 * @author bruno
 */
public class POO10ProjetoYoutube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        
        
        Aluno a[] = new Aluno[2];
        a[0] = new Aluno("Fulano", 22, "M", "fulan");
        a[1] = new Aluno("Pedrinho", 18, "M", "pedrin");
        
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(a[0], v[2]); //Fulano assiste HTML
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(a[0], v[1]);
        vis[1].avaliar(87.0f);
        System.out.println(vis[1].toString());
        
        
        
        /*System.out.println("VÍDEOS\n=========================");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
  
        System.out.println("ALUNOS\n=========================");
        System.out.println(a[0].toString());
        System.out.println(a[1].toString()); */
        
        
        
        

    }
    
}


package cadastraraluno;


public class Aluno {
    //Atributos - Características
     String nome, curso;
    int ra; 
     private  int semestre;
    
   public void setSemestre(int semestre){
       if (semestre>0 && semestre<=8){
           this.semestre= semestre;
           System.out.println("Atríbuido com sucesso!");
       } else System.out.println("Semestre inválido!!");
    }
   
   public int getSemestre(){
   return this.semestre;
   }
   
}

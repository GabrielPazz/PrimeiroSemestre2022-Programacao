package MédiaAlunos;


public class ClasseAlunos {
    float a1;
    float a2;
    float a3;
    
    public void imprimir(){
        System.out.println("A1: "+a1);
        System.out.println("A2: "+a2);
        System.out.println("A3: "+a3);
    }
    public float calcularMedia(){
    float media;
    media= (a1+a2+a3)/3;
    return media;
    }
    public boolean status(){
    float media= calcularMedia();
    if(media >=6){
    return true;
    }
    else {
    return false;
    }
    }
}

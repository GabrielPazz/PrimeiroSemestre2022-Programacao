package time;


public class AppTime {
     int hora;
     int minutos;
     int segundos;
     
     
    
   public void imprimir(int hora, int minutos, int segundos){
    this.hora=hora;
    this.minutos=minutos;
    this.segundos=segundos;
    if(hora<24 && minutos<=60 && segundos<=60){
    System.out.println("Horário: ");
    System.out.println (hora+":"+minutos+":"+segundos);
    }else {
        System.out.println("Valores não correspondem, tente novamente. ");
    }
     
    }
    public void imprmir(int hora, int minutos, int segundos){
    if(hora<12 && minutos<=60 && segundos<=60){
        System.out.println(hora +":"+minutos+":"+segundos+" PM ");
    }else{
        System.out.println("Valores não correspondem, tente novamente.");
    }
    
    
    }
}

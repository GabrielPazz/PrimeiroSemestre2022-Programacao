
package elevador;


public class Elevador {
    private String marca;
    private int passageiros;
    private double carga;
    private int maxPassageiros;
    private double maxCarga;
   
    public Elevador(){}
    
    //É o construtor
    public Elevador(String marca, double maxCarga, int maxPassageiros){
    this.marca=marca;
    this.maxCarga=maxCarga;
    this.maxPassageiros=maxPassageiros;
    
    
    }
    
    public void SetMarca (String marca){
    this.marca=marca;
    }
    public String getMarca(){
    return this.marca;
    }
    public void setPassageiros(int passageiros){
    if(passageiros>=0 && passageiros<=this.maxPassageiros) {
        this.passageiros=passageiros;
    }else{
        System.err.println("Valor inválido!");
    }
    }
            
    public int getPassageiros(){
    return this.passageiros;
    }  
    
    public void setCarga(double carga){
        if(carga>=0 && carga<=this.maxCarga){
    this.carga=carga;
        }else {
            System.err.println("Valor inválido!");
        }
        
    }
    
    public double getCarga(){
    return this.carga;
    }
    public double getmaxCarga(){
    return this.maxCarga;
    }
    public int maxPassageiros(){
    return this.maxPassageiros;
    }
}

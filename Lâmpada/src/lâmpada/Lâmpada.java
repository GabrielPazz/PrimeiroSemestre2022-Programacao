package lâmpada;


public class Lâmpada {

    
    public static void main(String[] args) {
       ClasseLâmpada l = new ClasseLâmpada();
       l.cor = "Amarela";
       l.marca= "Dell";
       l.potencia= 90;
       l.tamanho= 'M';
       l.tensao= 220;
       
       l.imprimir();
       l.on();
       l.off();
       l.on();
       l.off();
       l.pifar();
    }
    
}
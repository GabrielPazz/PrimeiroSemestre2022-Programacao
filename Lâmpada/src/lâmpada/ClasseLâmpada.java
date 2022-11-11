package lâmpada;


public class ClasseLâmpada {
    String cor;
    int potencia;
    String marca;
    char tamanho;
    int tensao;
    public void imprimir(){
        System.out.println("COR: "+cor);
        System.out.println("POTÊNCIA: "+potencia);
        System.out.println("MARCA: "+marca);
        System.out.println("TAMANHO: "+tamanho);
        System.out.println("TENSÃO: "+tensao);
    }
    public void on(){
        System.out.println("Iluminando o ambiente na cor "+cor);
    }
    public void off(){
        System.out.println("Agora é breu total!!");
    }
    public void pifar(){
        System.out.println("Agora a lâmpada foi pro brejo :0");
    }
}
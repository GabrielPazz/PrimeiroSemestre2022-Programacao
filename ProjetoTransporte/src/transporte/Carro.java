package transporte;

public class Carro {

    private String marca;
    private int ano;
    private int capacidadePassageiro;
    private int passageiro;
    private double capacidadeCarga;
    private double carga;

    public Carro(String marca, int ano, int capacidadePassageiro,
            double capacidadeCarga) {
        this.marca = marca;
        this.ano = ano;
        this.capacidadePassageiro = capacidadePassageiro;
        this.capacidadeCarga = capacidadeCarga;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void transportar(double carga) {
        if (carga >= 0 && carga <= this.capacidadeCarga) {
            this.carga = carga;
            System.out.println("Transportando...");
        } else {
            System.err.println("Carga inválida!");
        }
    }

    /**
     *
     * @param passageiro
     */
    public void transportar(int passageiro) {
        if (passageiro >= 0 && passageiro <= this.capacidadePassageiro) {
            this.passageiro = passageiro;
            System.out.println("Transportando...");
        } else {
            System.err.println("Valor inválido");
        }
    }

}

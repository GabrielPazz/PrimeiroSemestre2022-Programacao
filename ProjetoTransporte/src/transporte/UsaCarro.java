
package transporte;
/*
  Elabore um projeto Java que defina uma classe Carro: marca (String),
 ano(int), capacidadeCarga(double), carga (double), 
 capacidadePassageiros (int), passageiros (int). Escreva os métodos
 get/set, exceto para capacidadePassageiros, capacidadeCarga.
 Escreva um método para transportar carga e outro para transportar 
 passageiros.
*/
public class UsaCarro {
 
    public static void main(String[] args) {
      Carro carro=new Carro("VW", 2014, 4, 2000);
      carro.transportar(2.5);
    } 
}





package exercicio.pkg1;


import java.util.Scanner;

 public class Exercicio1 {
                   
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		float salario;
		int tempoEmpresa;
		float valorBonus;
		
		System.out.println("Quanto você ganha?");
		salario = entrada.nextFloat();
		System.out.println("Quanto tempo você trabalha aqui?");
		tempoEmpresa = entrada.nextInt();
		
		if(tempoEmpresa>=5){
		    valorBonus = salario * 0.2f;
		}
		else{
		    valorBonus = salario * 0.1f;
		}
		
		System.out.println("O valor do seu bonus é: "+valorBonus);
		System.out.println("O seu salário será de: "+(salario+valorBonus));
	}
}
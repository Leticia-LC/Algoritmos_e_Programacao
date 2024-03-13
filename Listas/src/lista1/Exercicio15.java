package lista1;

import java.util.Scanner;
public class Exercicio15 {
	public static void main(String[] args) {
		Float conta, felipe, valorSemCentavos, valor;
		
		Scanner leitura = new Scanner (System.in);
		
		System.out.println("Informe o valor da conta: ");
		conta = leitura.nextFloat();
		
		valor = conta / 3;
		
		felipe = conta - (valor * 2);
		
		valorSemCentavos = (float) Math.floor(valor);
		
		System.out.println("Carlos deve pagar: " + valorSemCentavos);
		System.out.println("Andre deve pagar: " + valorSemCentavos);
		System.out.println("Felipe deve pagar: " + felipe);
		
	
	}
}

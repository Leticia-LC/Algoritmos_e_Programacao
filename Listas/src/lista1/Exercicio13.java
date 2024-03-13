package lista1;

import java.util.Scanner;
public class Exercicio13 {
	public static void main(String[] args) {
		Integer numero, centena, dezena, unidade;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe um numero de tres digitos: ");
		numero = leitura.nextInt();
		
		if(numero >= 100 && numero <= 999) {
			centena = numero / 100;
			dezena = numero = (numero % 100) / 10;
			unidade = numero % 10;
			
			System.out.println("Centena: " + centena);
			System.out.println("Dezena: " + dezena);
			System.out.println("Unidade: " + unidade);
			
		}else {
			System.out.println("Numero invalido!");
		}
	}
}

package lista1;

import java.util.Scanner;
public class Exercicio17 {
	public static void main(String[] args) {
		Float graus, fahrenheit;
		
		Scanner leitura = new Scanner (System.in);
		
		System.out.println("Informe a temperatura em graus celsius: ");
		graus = leitura.nextFloat();
		
		fahrenheit = (graus * 9/5) + 32;
		
		System.out.println("A temperatura em Fahrenheit é igual a: " + fahrenheit);
	}
}


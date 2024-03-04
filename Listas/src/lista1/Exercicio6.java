package lista1;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Float peso, valor;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Insira o peso do prato: ");
		peso = leitura.nextFloat();
		
		valor = peso * 12;
		
		System.out.println("O valor do prato é de: " + valor);
		
	}

}

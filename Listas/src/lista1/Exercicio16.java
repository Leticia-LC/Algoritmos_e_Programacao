package lista1;

import java.util.Scanner;
public class Exercicio16 {
	public static void main(String[] args) {
		Integer sanduiches, queijoPresunto, hamburguer;
		
		Scanner leitura = new Scanner (System.in);
		
		System.out.println("Informe a quantidade de sanduiches a serem feitos:");
		sanduiches = leitura.nextInt();
		
		queijoPresunto = (int) (sanduiches * 50);
		
		hamburguer = (int) (sanduiches * 100);
		
		System.out.println("A quantidade de presunto necessaria é de: " + queijoPresunto + " gramas");
		System.out.println("A quantidade de queijo necessaria é de: " + queijoPresunto + " gramas");
		System.out.println("A quantidade de hamburguer necessaria é de: " + hamburguer + " gramas");
	}
}

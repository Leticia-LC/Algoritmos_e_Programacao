package lista1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Integer paes, broas;
		
		Float resultado, poupanca;
		
		Scanner leitura = new Scanner(System.in);	
		
		System.out.println("Insira a quatidade de paes vendidos no dia: ");
		paes = leitura.nextInt();
		System.out.println("Insira a quatidade de broas vendidos no dia: ");
		broas = leitura.nextInt();
		
		resultado = (float) ((paes * 0.12) + (broas * 1.50));
		
		System.out.println("O valor das vendas no final do dia é de: " + resultado);
		
		poupanca = (float) (resultado * 0.10);
		
		System.out.println("O valor a ser guardado na poupança e de: " + poupanca);

	}

}
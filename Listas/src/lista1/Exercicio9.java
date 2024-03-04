package lista1;


import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Integer pequeno, medio, grande, valor;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Insira a quatidade de camisas pequenas vendidas: ");
		pequeno = leitura.nextInt();
		
		System.out.println("Insira a quantidade de camisas medias vendidas: ");
		medio = leitura.nextInt();
		
		System.out.println("Insira a quantidade de camisas grandes vendidas: ");
		grande = leitura.nextInt();
		
		valor = (pequeno * 10) + (medio * 12) + (grande * 15);
		
		System.out.println("O valor arrecadado é de: " + valor);
		
		

	}

}

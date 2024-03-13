package lista1;

import java.util.Scanner;
public class Exercicio20 {
	public static void main(String[] args) {
		Integer blusas, novelos, quantidade;
		
		Scanner leitura = new Scanner (System.in);
		
		System.out.println("Informe a quantidade de novelos necessarios para fazer uma blusa: ");
		novelos = leitura.nextInt();
		
		System.out.println("Informe a quantidade de blusas a serem feitas: ");
		blusas = leitura.nextInt();
		
		quantidade = blusas * novelos;
		
		System.out.println("Para produzir " + blusas + " blusas, são necessários " + quantidade + " novelos");
		
	}
}

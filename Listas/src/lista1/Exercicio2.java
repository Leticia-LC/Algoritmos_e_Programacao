package lista1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Integer cavalos, resultado;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe quantos cavalos foram comprados pelo haras: ");
		cavalos = leitura.nextInt();
		
		resultado = cavalos * 4;
		
		System.out.println("A quantidade de ferraduras necessarias é de: " + resultado);

	}

}
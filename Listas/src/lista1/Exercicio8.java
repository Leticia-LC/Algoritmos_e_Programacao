package lista1;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Float nota1, nota2, nota3, media;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("insira a primeira nota: ");
		nota1 = leitura.nextFloat();
		
		System.out.println("Insira a segunda nota: ");
		nota2 = leitura.nextFloat();
		
		System.out.println("Insira a terceira nota: "); 
		nota3 = leitura.nextFloat();
		
		media = ((nota1 * 1) + (nota2 * 2) + (nota3 * 3))/6;
		
		System.out.println("A média ponderada é igual a: " + media);
		

	}

}
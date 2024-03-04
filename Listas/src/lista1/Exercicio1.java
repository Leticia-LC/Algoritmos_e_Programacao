package lista1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Float ladoA;
		Float ladoB;
		Float area;
		
		Scanner leitura = new Scanner(System.in);
		System.out.println("Insira o valor de uma das dimensões do terreno: " );
		
		ladoA = leitura.nextFloat();
		ladoB = leitura.nextFloat();
		
		area = ladoA * ladoB;
		
		System.out.println("A área do terreno é igual a: " + area);
		
	
		

	}

}

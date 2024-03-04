package lista1;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Integer x, y, x1, y1;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Insira os valores do primeiro ponto: ");
		x = leitura.nextInt();
		y = leitura.nextInt();
		
		System.out.println("insira os valores do segundo ponto: ");
		x1 = leitura.nextInt();
		y1 = leitura.nextInt();
		
		double distancia = Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2));
		
		System.out.println("A distância entre os dois pontos é: " + distancia);

	}

}
package lista1;

import java.util.Scanner;
public class Exercicio14 {
	public static void main(String[] args) {
		Double area, raio;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe o raio da pizza: ");
		raio = leitura.nextDouble();
		
		area = calcularArea(raio);
		
		System.out.println("A area da pizza é igual a: " + area);
	}
	
	public static double calcularArea(double raio) {
		
		double area = Math.PI * Math.pow(raio, 2);
		
		return area;
		
	}
}

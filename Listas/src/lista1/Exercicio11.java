package lista1;

import java.util.Scanner;
public class Exercicio11 {
	public static void main(String[] args) {
		
		Integer dias, meses, anos;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de dias sem acidentes: ");
		dias = leitura.nextInt();
		
		meses = dias/30;
		
		anos = meses/30;
		
		System.out.println("A quantidade de anos é igual a: " + anos);
		
		System.out.println("A quantidade de meses é igual a: " + meses);
		
		System.out.println("A quantidade de dias é igual a: " + dias);
	}
}

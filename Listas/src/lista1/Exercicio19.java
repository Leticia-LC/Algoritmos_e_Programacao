package lista1;

import java.util.Scanner;
public class Exercicio19 {
	public static void main(String[] args) {
		Integer frangos;
		Float valor;
		
		Scanner leitura = new Scanner (System.in);
		
		System.out.println("Informe a quantidade de frangos a serem marcados: ");
		frangos = leitura.nextInt();
		
		valor = (float) ((frangos * 4) + (frangos * 3.50));
		
		System.out.println("A quantia a ser gasta para marcar todos os frangos é igual a: " + valor);
	}
}


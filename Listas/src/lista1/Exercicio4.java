package lista1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		String nome;
		Integer idade, dias;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Insira o nome: ");
		nome = leitura.next();
		
		System.out.println("Insira idade:");
		idade = leitura.nextInt();
		
		dias = idade * 365;
		
		System.out.println("A pessoa " + nome + " já viveu " + dias + " dias!");
		

	}

}

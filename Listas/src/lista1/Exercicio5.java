package lista1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Float preco, valor, litros;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Insira o preço da gasolina: ");
		preco = leitura.nextFloat();
		
		System.out.println("Insira o valor do pagamento: ");
		valor = leitura.nextFloat();
		
		litros = valor/preco;
		
		System.out.println("A quantidade de litros que o motorista pode comprar é de: " + litros);
		

	}

}
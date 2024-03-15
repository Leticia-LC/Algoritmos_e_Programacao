
package lista1;
import java.util.Scanner;
public class Exercicio29 {
	public static void main(String[] args) {
		Double preco, desconto;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Insira o preço do produto: ");
		preco = leitura.nextDouble();
		
		desconto = preco - (preco * 0.10);
		
		System.out.println("O preço do produto com desconto é igual a: " + desconto);
	}
}


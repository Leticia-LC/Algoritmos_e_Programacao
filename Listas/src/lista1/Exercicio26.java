package lista1;
import java.util.Scanner;
public class Exercicio26 {
	public static void main(String[] args) {
		Integer num1, num2, num3, soma;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número: ");
		num1 = leitura.nextInt();
		
		System.out.println("Insira o segundo número: ");
		num2 = leitura.nextInt();
		
		System.out.println("Insira o terceiro número: ");
		num3 = leitura.nextInt();
		
		soma = num1 * num2 * num3;
		
		System.out.println("A multiplicação dos tres numeros é igual a: " + soma);
		
	}
}

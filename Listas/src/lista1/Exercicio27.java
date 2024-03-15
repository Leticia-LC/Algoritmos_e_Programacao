package lista1;
import java.util.Scanner;
public class Exercicio27 {
	public static void main(String[] args) {
		Integer num1, num2, divisao;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Insira o primeiro numero: ");
		num1 = leitura.nextInt();
				
		System.out.println("Insira o segundo numero: ");
		num2 = leitura.nextInt();
		
		divisao = num1 / num2;
		
		System.out.println("A divisão do primeiro número pelo segundo é igual a: " + divisao);
		
	}
}



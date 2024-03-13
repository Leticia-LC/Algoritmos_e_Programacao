package lista1;

import java.util.Scanner;
public class Exercicio12 {
	public static void main(String[] args) {
		Float salario, aumento, desconto;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe o salario do funcionario: ");
		salario = leitura.nextFloat();
		
		aumento = (float) ((salario * 0.15) + salario);
		
		desconto = (float) (aumento - (aumento * 0.08));
		
		System.out.println("O salário inicial é igual a: " + salario);
		System.out.println("O salário com 15% de aumento é igual a: " + aumento);
		System.out.println("O salário com 8% de desconto de impostos é igual a: " + desconto);
		
	}
}


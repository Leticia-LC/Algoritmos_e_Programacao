package lista1;
import java.util.Scanner;
public class Exercicio30 {
	
	public static void main(String[] args) {
		Double salario, vendas, salarioFinal;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe o salário do funcionario: ");
		salario = leitura.nextDouble();
		
		System.out.println("Informe o valor das vendas: ");
		vendas = leitura.nextDouble();
		
		salarioFinal = salario + (vendas * 0.04);
		
		System.out.println("O salario final com a comissao é igual a: " + salarioFinal);
	}
}

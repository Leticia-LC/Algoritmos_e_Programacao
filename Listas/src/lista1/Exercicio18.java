package lista1;

import java.util.Scanner;
public class Exercicio18 {
	public static void main(String[] args) {
		Integer horaNormal, horaExtra, salarioLiquido, salarioBruto;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de horas normais trabalhadas: ");
		horaNormal = leitura.nextInt();
		
		System.out.println("Informe a quantidade de horas  extras trabalhadas: ");
		horaExtra = leitura.nextInt();
		
		salarioBruto = (horaNormal * 10) + (horaExtra * 15);
		
		System.out.println("O salario bruto é igual a: " + salarioBruto);
		
		salarioLiquido = (int) (salarioBruto - (salarioBruto * 0.10));
		
		System.out.println("O salario liquido é igual a: " + salarioLiquido);
		
	}
}

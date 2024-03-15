package lista1;
import java.util.Scanner;
public class Exercicio22 {
	public static void main(String[] args) {
		Double valor, umReal, cinquenta, vinteCinco, dez, cinco, um;;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de moedas de 1 centavo do cofrinho: ");
		um = leitura.nextDouble();
		
		System.out.println("Informe a quantidade de moedas de 5 centavos do cofrinho: ");
		cinco = leitura.nextDouble();
		
		System.out.println("Informe a quantidade de moedas de 10 centavos do cofrinho: ");
		dez = leitura.nextDouble();
		
		System.out.println("Informe a quantidade de moedas de 25 centavos do cofrinho: ");
		vinteCinco = leitura.nextDouble();
		
		System.out.println("Informe a quantidade de moedas de 50 centavos do cofrinho: ");
		cinquenta = leitura.nextDouble();
		
		System.out.println("Informe a quantidade de moedas de 1 real do cofrinho: ");
		umReal = leitura.nextDouble();
		
		valor = (um * 0.01) + (cinco + 0.05) + (dez * 0.10) + (vinteCinco * 0.25) + (cinquenta * 0.50) + (umReal * 1);
		
		System.out.println("A quantidade de dinheiro contida no cofrinho é de: " + valor + "R$");
		
	
	}
}


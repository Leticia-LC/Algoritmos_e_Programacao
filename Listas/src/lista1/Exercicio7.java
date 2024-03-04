package lista1;


import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Integer dia, mes, dias;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe o dia: ");
		dia = leitura.nextInt();
		
		System.out.println("Informe o número equivalente ao mês: ");
		mes = leitura.nextInt();
		
		if(dia < 1 || dia > 30 || mes > 12 || mes < 1) {
			System.out.println("Informação incorreta!");
			
		}else {
			
		dias = (30 * (mes - 1)) + dia;
		
		System.out.println("Passaram-se " + dias + " dias desde o início do ano");
		
		}


	}
}

package lista1;
import java.util.Scanner;
public class Exercicio25 {
	public static void main(String[] args) {
		Double areaB, altura, volume;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe a area da base da caixa d'agua: ");
		areaB = leitura.nextDouble();
		
		System.out.println("Informe a altura da caixa d'agua: ");
		altura = leitura.nextDouble();
		volume = areaB * altura;
		
		System.out.println("O volume da caixa d'agua é igual a: " + volume);
		
	}
}



package lista1;
import java.util.Scanner;
public class Exercicio28 {
	public static void main(String[] args) {
		Double nota1, nota2, media;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota: ");
		nota1 = leitura.nextDouble();
		
		System.out.println("Insira a segunda nota: ");
		nota2 = leitura.nextDouble();
		
		media = ((nota1 * 2) + (nota2 * 3)) / 5;
		
		System.out.println("A media ponderada das duas notas é igual a: " + media);
		
		
	}
}


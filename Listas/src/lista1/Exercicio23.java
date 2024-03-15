package lista1;
import java.util.Scanner;
public class Exercicio23 {
	public static void main(String[] args) {
		Float alturaPredio, alturaPessoa, sombraPredio, sombraPessoa;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe a sua altura em metros: ");
		alturaPessoa = leitura.nextFloat();
		
		System.out.println("Informe  a sombra do prédio em metros: ");
		sombraPredio = leitura.nextFloat();
		
		sombraPessoa = (float) (alturaPessoa * 1.5);
		
		alturaPredio = (alturaPessoa * sombraPredio) / sombraPessoa;
		
		System.out.println("A altura do prédio é igual a: " + alturaPredio);
	}
}

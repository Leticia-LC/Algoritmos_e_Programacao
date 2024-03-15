package lista1;
import java.util.Scanner;
public class Exercicio24 {
	public static void main(String[] args) {
		Float litros, agua, suco;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de litros de refresco que deseja fazer: ");
		litros = leitura.nextFloat();
		
		suco = (float) (litros * 0.2);
		
		agua = (float) (litros * 0.8);
		
		System.out.println("A quantidade de agua necessaria é de: " + agua + "litros");
		
		System.out.println("A quantidade de suco necessario é de: " + suco + "litros");
		
	}
}

package lista1;
import java.util.Scanner;
public class Exercicio21 {
	public static void main(String[] args) {
		Float quantidade, latas, garrafas, garrafasG;;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de latas que foram compradas: ");
		latas = leitura.nextFloat();
		
		System.out.println("Informe a quantidade de garrafas de 600ml que foram compradas: ");
		garrafas = leitura.nextFloat();
		
		System.out.println("Informe a quantidade de garrafas de 2L que foram compradas: ");
		garrafasG = leitura.nextFloat();
		
		quantidade = (float) ((latas * 0.350) + (garrafas * 0.600) + (garrafasG * 2));
		
		System.out.println("A quantidade de refrigerante comprada pelo comerciante é igual a: " + quantidade + " Litros.");
	}
}


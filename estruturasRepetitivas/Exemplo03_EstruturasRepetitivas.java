package estruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo03_EstruturasRepetitivas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		char resposta;
		
		do {
		
		System.out.println("Digite a temperatura em Celcius:");
		double celcius = sc.nextDouble();
		
		double fahrenheit = 9 * celcius / 5 + 32;
		
		System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
		
		System.out.println("Deseja repetir? S / N");
		resposta = sc.next().charAt(0);
		
		} while (resposta != 'n');
		
		sc.close();
		
	}

}

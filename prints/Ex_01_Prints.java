package prints;
import java.util.Locale;

public class Ex_01_Prints {

	public static void main(String[] args) {

		String produto1 = "Computador";
		String produto2 = "Office desk";
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		System.out.println("Produtos:");
		System.out.printf("%s, cujo preço é: R$ %.2f%n", produto1, preco1);
		System.out.printf("%s, cujo preço é: R$ %.2f%n", produto2, preco2);
		System.out.printf("Registro: %d anos de idade, código %d e gênero %c%n", idade, codigo, genero);
		
		System.out.printf("Medida com oito casas decimais: %f%n", medida);
		System.out.printf("Medida com três casas decimais: %.3f%n", medida);
		Locale.setDefault(Locale.US);
		System.out.printf("Medida com três casas decimais e ponto como separador: %.3f", medida);
		
		/* %s = string
		 * %d = inteiro
		 * %f = float
		 * %2f = double
		 * %b = boolean
		 * %c = char
		 */

	}

}

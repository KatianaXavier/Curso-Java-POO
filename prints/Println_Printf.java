package prints;
import java.util.Locale;

public class Println_Printf {

	public static void main(String[] args) {

		int y = 27;
		double x = 10.35784;
		
		String nome = "Kati";
		int idade = 27;
		double renda = 8000.0;
				
		System.out.println("hello, world!");
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		// configurando o ponto como separador decimal
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		System.out.printf("Resultado = %.2f metros%n", x);
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		/* %s = string
		 * %d = inteiro
		 * %f = float
		 * %2f = double
		 * %b = boolean
		 * %c = char
		 */
		
	}

}

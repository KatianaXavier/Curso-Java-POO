package estruturasSequenciais;
import java.util.Locale;
import java.util.Scanner;

public class Ex02_EstruturaSequencial {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		double raio, area;

		System.out.println("Digite o valor do raio de um círculo:");
		raio = leitor.nextDouble();

		area = 3.14159 * (raio * raio);

		System.out.printf("Área: %.4f", area);

		leitor.close();

	}

}

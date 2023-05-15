package estruturasSequenciais;
import java.util.Locale;
import java.util.Scanner;

public class Ex05_EstruturaSequencial {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		int codPeca1, qtdPeca1, codPeca2, qtdPeca2;
		double valorPeca1, valorPeca2, total;

		System.out.println("Digite o código da peça 1:");
		codPeca1 = leitor.nextInt();

		System.out.println("Digite a quantidade de peças 1:");
		qtdPeca1 = leitor.nextInt();

		System.out.println("Digite o valor da peça 1:");
		valorPeca1 = leitor.nextDouble();

		System.out.println("Digite o código da peça 2:");
		codPeca2 = leitor.nextInt();

		System.out.println("Digite a quantidade de peças 2:");
		qtdPeca2 = leitor.nextInt();

		System.out.println("Digite o valor da peça 2:");
		valorPeca2 = leitor.nextDouble();

		total = (valorPeca1 * qtdPeca1) + (valorPeca2 * qtdPeca2);

		System.out.printf("Valor a pagar: R$ %.2f", total);

		leitor.close();

	}

}

package estruturasSequenciais;
import java.util.Scanner;

public class Ex01_EstruturaSequencial {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int n1, n2, soma;

		System.out.println("Digite o primeiro número:");
		n1 = leitor.nextInt();
		System.out.println("Digite o segundo número:");
		n2 = leitor.nextInt();

		soma = n1 + n2;

		System.out.println("A soma dos números digitados é " + soma);

		leitor.close();

	}

}

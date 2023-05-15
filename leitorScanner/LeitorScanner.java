package leitorScanner;
import java.util.Locale;
import java.util.Scanner;

public class LeitorScanner {

	public static void main(String[] args) {

		// forma padrão do java para receber dados que serão digitados
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		String nome;
		int idade;
		// double salario;
		double salarioComPonto;
		char caracter;

		nome = leitor.next();
		System.out.println("O nome digitado é " + nome);

		idade = leitor.nextInt();
		System.out.println("A idade digitada é " + idade);

		/*
		 * atenção: no double, digita-se uma vírgula como separador decimal e a saída
		 * será o ponto como separador. se o usuário ditar com ponto, dará uma
		 * exception! para que o usuário possa digitar o ponto como separador decimal,
		 * deve-se colocar a Locale.setDefault(Locale.US) antes do scanner, lá em cima!
		 * aqui a saída também será com ponto.
		 */
		// salario = leitor.nextDouble();
		// System.out.println("O salário digitado é " + salario);

		salarioComPonto = leitor.nextDouble();
		System.out.println("O salário digitado é " + salarioComPonto);

		// o charAt(0) pega o primeiro caracter da string
		caracter = leitor.next().charAt(0);
		System.out.println("O primeiro caracter digitado é " + caracter);

		leitor.close();

	}

}

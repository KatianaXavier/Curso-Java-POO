package estruturasCondicionais;

import java.util.Scanner;

public class Ex01_EstruturasCondicionais {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.println("Digite um número:");
		numero = sc.nextInt();

		if (numero < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Não negativo");
		}

		sc.close();

	}

}

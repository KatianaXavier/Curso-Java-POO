package estruturasCondicionais;

import java.util.Scanner;

public class Ex02_EstruturasCondicionais {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.println("Digite um número:");
		numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Ímpar");
		}
		
		sc.close();

	}

}

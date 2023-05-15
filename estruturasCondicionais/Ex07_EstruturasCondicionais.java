package estruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex07_EstruturasCondicionais {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double X, Y;

		System.out.println("Digite o valor de X:");
		X = sc.nextDouble();

		System.out.println("Digite o valor de Y:");
		Y = sc.nextDouble();

		if (X > 0 && Y > 0) {
			System.out.println("Q1");
		} else if (X < 0 && Y > 0) {
			System.out.println("Q2");
		} else if (X < 0 && Y > 0) {
			System.out.println("Q3");
		} else if (X > 0 && Y < 0) {
			System.out.println("Q4");
		} else if (X == 0 && Y == 0) {
			System.out.println("Origem");
		} else if (X == 0) {
			System.out.println("Eixo Y");
		} else if (Y == 0) {
			System.out.println("Eixo X");
		}

		sc.close();

	}

}

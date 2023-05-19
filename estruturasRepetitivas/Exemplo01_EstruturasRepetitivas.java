package estruturasRepetitivas;

import java.util.Scanner;

public class Exemplo01_EstruturasRepetitivas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// leitura do primeiro valor
		int x = sc.nextInt();
		
		int soma = 0;
		
		while (x != 0) {
			soma = soma + x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();

	}

}

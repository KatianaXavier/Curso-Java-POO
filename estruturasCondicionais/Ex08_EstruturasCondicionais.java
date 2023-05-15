package estruturasCondicionais;

import java.util.Scanner;

public class Ex08_EstruturasCondicionais {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double salario, imposto, faixa1, faixa2, faixa3;
		
		System.out.println("Digite o valor do salário:");
		salario = sc.nextDouble();
		
		if (salario <= 2000) {
			System.out.println("Isento");
			
		} else if (salario > 2000 && salario <= 3000 ) {
			imposto = (salario - 2000) * 8 / 100;
			System.out.printf("Total a ser pago de imposto: R$ %.2f", imposto);
		} else if (salario > 3000 && salario <= 4500) {
			faixa1 = 999.99 * 8 / 100;
			faixa2 = (salario - 3000.01) * 18 / 100;
			imposto =  faixa1 + faixa2;
			System.out.printf("Total a ser pago de imposto: R$ %.2f", imposto);
			
		} else if (salario > 4500) {
			faixa1 = 999.99 * 8 / 100;
			faixa2 = 1499.99 * 18 / 100;
			faixa3 = (salario - 4500) * 28 / 100;
			imposto =  faixa1 + faixa2 + faixa3;
			System.out.printf("Total a ser pago de imposto: R$ %.2f", imposto);
		}
		
		sc.close();

	}

}

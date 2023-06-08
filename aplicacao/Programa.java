package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Trabalhador;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Trabalhador trabalhador = new Trabalhador();
		
		System.out.println("Insira o nome do trabalhador:");
		trabalhador.nome = sc.nextLine();
		System.out.println("Insira o salário bruto de " + trabalhador.nome + ":");
		trabalhador.salarioBruto = sc.nextDouble();
		System.out.println("Insira o valor de imposto a ser descontado:");
		trabalhador.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Dados do trabalhador: " + trabalhador);
		
		System.out.println();
		System.out.println("Qual a porcentagem de aumento de salário?");
		double porcentagem = sc.nextDouble();
		trabalhador.aumentoSalario(porcentagem);
		
		System.out.println();
		System.out.println("Dados atualizados: " + trabalhador);
		
		sc.close();

	}

}

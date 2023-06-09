package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Insira a largura e a altura do retângulo.");
		System.out.println("Largura:");
		retangulo.largura = sc.nextDouble();
		System.out.println("Altura:");
		retangulo.altura = sc.nextDouble();
		
		System.out.println(retangulo);
				
		sc.close();

	}

}

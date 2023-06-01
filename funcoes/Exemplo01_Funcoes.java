package funcoes;

import java.util.Scanner;

public class Exemplo01_Funcoes {

	public static void main(String[] args) {

		// faça um programa para ler 3 números inteiros e mostrar na tela o maior deles
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira três números:");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a, b, c);
		
		resultado(maior);
		
		sc.close();

	}
	
	// declarando uma função
	public static int max(int x, int y, int z) {
		
		int maiorFuncao;
		
		if(x > y && x > z) {
			maiorFuncao = x;
		} else if (y > z) {
			maiorFuncao = y;
		} else {
			maiorFuncao = z;
		}
		
		return maiorFuncao;
	}
	
	// função vazia (porque não retorna nada), que apenas imprime na tela uma informação
	public static void resultado(int valor) {
		
		System.out.println("O maior valor é: " + valor);
		
	}

}

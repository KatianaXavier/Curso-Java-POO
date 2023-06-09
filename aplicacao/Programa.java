package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Insira o nome do aluno:");
		aluno.nome = sc.nextLine();
		
		System.out.println("Insira as notas dos primeiro, segundo e terceiro trimestre:");
		aluno.tri1 = sc.nextDouble();
		aluno.tri2 = sc.nextDouble();
		aluno.tri3 = sc.nextDouble();
		
		System.out.println(aluno);
		
		sc.close();

	}

}

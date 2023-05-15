package estruturasCondicionais;

import java.util.Scanner;

public class Ex04_EstruturasCondicionais {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, duracao;
		
		System.out.println("Insira a hora que o jogo começou:");
		horaInicial = sc.nextInt();
		
		System.out.println("Insira a hora que o jogo terminou:");
		horaFinal = sc.nextInt();
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O jogo durou " + duracao + " hora(s)");
		
		sc.close();

	}

}

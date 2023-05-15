package estruturasSequenciais;
import java.util.Scanner;

public class Ex03_EstruturaSequencial {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		
		A = leitor.nextInt();
		B = leitor.nextInt();
		C = leitor.nextInt();
		D = leitor.nextInt();
		
		diferenca = A * B - C * D;
		
		System.out.println("A diferença entre os números é " + diferenca);
		
		leitor.close();

	}

}

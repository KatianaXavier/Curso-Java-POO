package leitorScanner;
import java.util.Scanner;

public class LeitorScanner2 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		// lendo várias coisas até a quebra de linha

		String s1, s2, s3;

		s1 = leitor.nextLine();
		s2 = leitor.nextLine();
		s3 = leitor.nextLine();

		System.out.println("Dados digitados:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		leitor.close();

	}

}

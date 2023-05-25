package estruturasRepetitivas;

import java.util.Scanner;

public class Ex03_EstruturasRepetitivas_For {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	
		for(int i = 0; i < n; i++) {
			
			double peso2 = sc.nextFloat();
			double peso3 = sc.nextFloat();
			double peso5 = sc.nextFloat();
			
			double mediaPonderada = (peso2 * 2 + peso3 * 3 + peso5 * 5) / 10;
			
			System.out.printf("%.1f%n", mediaPonderada);
			
		}
		
		sc.close();

	}

}

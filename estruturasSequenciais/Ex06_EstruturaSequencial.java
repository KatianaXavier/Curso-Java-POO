package estruturasSequenciais;
import java.util.Locale;
import java.util.Scanner;

public class Ex06_EstruturaSequencial {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		System.out.println("Insira os valores de A, B e C:");
		A = leitor.nextDouble();
		B = leitor.nextDouble();
		C = leitor.nextDouble();
		
		triangulo = A * C / 2;
		circulo = Math.PI * Math.pow(C, 2);
		trapezio = (A + B) * C / 2;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("Triângulo: %.3f\n", triangulo);
		System.out.printf("Círculo: %.3f\n", circulo);
		System.out.printf("Trapézio: %.3f\n", trapezio);
		System.out.printf("Quadrado: %.3f\n", quadrado);
		System.out.printf("Retângulo: %.3f\n", retangulo);
		
		leitor.close();

	}

}

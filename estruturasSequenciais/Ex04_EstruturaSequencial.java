package estruturasSequenciais;
import java.util.Locale;
import java.util.Scanner;

public class Ex04_EstruturaSequencial {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		int nFuncionario;
		double horasFuncionario, valorHora, salarioFuncionario;
		
		System.out.println("Digite o número do funcionário:");
		nFuncionario = leitor.nextInt();
		
		System.out.println("Digite o número de horas trabalhadas:");
		horasFuncionario = leitor.nextDouble();
		
		System.out.println("Digite o valor da hora trabalhada:");
		valorHora = leitor.nextDouble();

		salarioFuncionario = horasFuncionario * valorHora;
		
		System.out.printf("O funcionário nº %d recebe R$ %.2f", nFuncionario, salarioFuncionario);
		
		leitor.close();
	}

}

package manipulacaoDeStrings;

public class Ex01_ManipulacaoDeStrings {

	public static void main(String[] args) {

		String original = "hello HELLO HI hi   ";
		
		String minusculo = original.toLowerCase();
		
		String maiusculo = original.toUpperCase();
		
		String eliminaEspacosNosCantos = original.trim();
		
		// cria uma nova string que começa do índice indicado, incluindo ele
		String novaString1 = original.substring(2);
		
		// cria uma nova string que começa do 1º índice indicado, incluindo ele, e termina no 2º índice indicado, excluindo ele e incluindo o 1º índice nessa contagem
		String novaString2 = original.substring(2, 9);
		
		// substitui o 1º parâmetro pelo 2º
		String substitui = original.replace('e', 'x');
		
		String substitui2 = original.replace("hi", "hy");
		
		// informa a posição em que a sequência de caracteres "he" aparece pela primeira vez
		int primeiraOcorrencia = original.indexOf("he");
		
		// informa a posição em que a sequência de caracteres "hi" aparece pela primeira vez
		int ultimaOcorrencia = original.lastIndexOf("hi");

		System.out.println(minusculo);
		System.out.println(maiusculo);
		System.out.println(eliminaEspacosNosCantos);
		System.out.println(novaString1);
		System.out.println(novaString2);
		System.out.println(substitui);
		System.out.println(substitui2);
		System.out.println(primeiraOcorrencia);
		System.out.println(ultimaOcorrencia);

	}

}

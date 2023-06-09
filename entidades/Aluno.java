package entidades;

public class Aluno {
	
	public String nome;
	public double tri1, tri2, tri3;
	
	public double NotaFinal() {
		return tri1 + tri2 + tri3;
	}
	
	public String AprovOuReprov() {
		if (NotaFinal() >= 60) {
			return ("Aprovado");
		} else {
			return ("Reprovado" + PontosFaltantes());
		}
	}
	
	public String PontosFaltantes() {
		return ("\nFaltando " + String.format("%.2f",(60 - NotaFinal())) + " pontos");
	}
	
	public String toString() {
		return "Nota final = " + String.format("%.2f", NotaFinal()) + "\n" + AprovOuReprov();
	}

}

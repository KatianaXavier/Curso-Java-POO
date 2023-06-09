package entidades;

public class Retangulo {
	
	public double largura;
	public double altura;
	
	public double Area() {
		return largura * altura;
	}
	
	public double Perimetro() {
		return 2 * (largura + altura);
	}
	
	public double Diagonal() {
		return Math.sqrt((largura * largura) + (altura * altura));
	}
	
	public String toString() {
		return "ÁREA: " + String.format("%.2f", Area()) + "\nPERÍMETRO: " + String.format("%.2f", Perimetro()) + "\nDIAGONAL: " + String.format("%.2f", Diagonal());  
	}
	
}

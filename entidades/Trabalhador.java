package entidades;

public class Trabalhador {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto; 
	}
	
	public void aumentoSalario(double porcentagem) {
		this.salarioBruto += this.salarioBruto * (porcentagem / 100);
	}
	
	public String toString() {
		return nome + ", salário líquido: R$ " + String.format("%.2f", salarioLiquido());
	}

}

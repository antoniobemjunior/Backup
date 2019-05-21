package cargos;

public class Desenvolvedor extends Cargo{

	//Construtor
	public Desenvolvedor(double salario, int nivel) {
		cargo = "Desenvolvedor";
		this.salario = salario;
		this.nivel = nivel;
	}
	
	//Imposto de Renda
	public void ir() {
		if(nivel == 1) System.out.println("Imposto de Renda: "+salario*0.04);
		if(nivel == 2) System.out.println("Imposto de Renda: "+salario*0.05);
		if(nivel > 2) System.out.println("Imposto de Renda: "+salario*0.10);
	}
	
}

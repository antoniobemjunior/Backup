package cargos;

public class Estagiario extends Cargo{

	//Construtor
	public Estagiario() {
		cargo = "Estagiario";
	}
	
	//Imposto de Renda
	public void ir() {
		System.out.println("N�o h� desconto no imposto de renda.");
	}
	
}

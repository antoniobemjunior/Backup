package cargos;

public class Cargo {

	//Atributos
	protected String cargo;
	protected double salario;
	protected int nivel;
	
	//Vale transporte
	public void valeTransporte() {
		System.out.println("Desconto do Vale Transporte � "+salario*0.06);
	}
	
	//Identificacao
	public void identificacao() {
		System.out.println("O cargo selecionado � "+cargo);
	}
	
	
}

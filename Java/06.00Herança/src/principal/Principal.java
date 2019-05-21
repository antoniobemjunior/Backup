package principal;

import cargos.*;

public class Principal {

	public static void main(String[] args) {

		//Instanciar objetos
		Estagiario e = new Estagiario();
		Analista a = new Analista(5000,2);
		Desenvolvedor d = new Desenvolvedor(3000,3);
		
		//Chamando os m�todos de indetificacao
		e.identificacao();
		a.identificacao();
		d.identificacao();
		
		//Chamando os m�todos de vale transporte
		e.valeTransporte();
		a.valeTransporte();
		d.valeTransporte();

		//Chamando os m�todos de imposto de renda
		e.ir();
		a.ir();		
		d.ir();
		
	}

}

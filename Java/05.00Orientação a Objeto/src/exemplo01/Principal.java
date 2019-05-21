package exemplo01;

public class Principal {

	public static void main(String[] args) {

		//Instanciar
		Carro carro = new Carro();
		carro.ano = 2019;
		carro.fabricante = "Volkswagen";
		carro.cor = "Vermelho";
		carro.modelo = "Golf";
		
		carro.exibirDados();
		
		//Segunda intância
		Carro carro2 = new Carro();
		carro2 = carro;
		
		carro2.exibirDados();
	}

}

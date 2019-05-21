package estado;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		//Criar o HashMap
		HashMap<String, String> estados = new HashMap<String,String>();
		estados.put("Santa Catarina", "Florian�polis");
		estados.put("Paran�", "Curitiba");
		estados.put("Minas Gerais", "Belo Horizonte");
		estados.put("Rio Grande do Sul", "Porto Alegre");

		//Exibir informa��o espec�fica
		System.out.println(estados.get("Paran�"));

		//Remover uma informa��o
		estados.remove("Paran�");
		
		//Rmover todos os conteudos
		estados.clear();
		
		//Lista todos os valores
		System.out.println(estados);
		
	}

}

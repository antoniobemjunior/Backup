package exemplo01;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		//Criar o ArrayList
		ArrayList<String> cursos = new ArrayList<String>();
		
		//Cadastrar cursos
		cursos.add("JAVA");
		cursos.add("C#");
		
		//Alterar curso
		cursos.set(0, "JAVASCRIPT");
		
		//Excluir um curso
		cursos.remove(1);
		
		//Exibir a quantidade de registros
		System.out.println("Tamanho do ArrayList: " + cursos.size());
		
		//Excluir tudo
		cursos.clear();
		
		//Exibir cursos
		for(String curso : cursos) {
			System.out.println(curso);
		}
		
	}

}

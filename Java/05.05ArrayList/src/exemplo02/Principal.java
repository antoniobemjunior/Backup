package exemplo02;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		//Objeto 01
		Curso curso1 = new Curso();
		curso1.setNome("Java");
		curso1.setValor(2300);
		curso1.setSegmento("Desenvolvimento");

		//Objeto 02
		Curso curso2 = new Curso();
		curso2.setNome("Photoshop");
		curso2.setValor(600);
		curso2.setSegmento("Gráfica");
		
		//Objeto 03
		Curso curso3 = new Curso();
		curso3.setNome("C#");
		curso3.setValor(1800);
		curso3.setSegmento("Desenvolvimento");
		
		//ArrayList
		ArrayList<Curso> cursos = new ArrayList<Curso>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		
		//Laço
		for(int i=0; i < cursos.size(); i++) {
			System.out.println(cursos.get(i).getNome());
		}
	}

}

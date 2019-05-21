package ex01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Declaração da variável palavra
		String palavra = "";
		
		//Declaração da variável exibir
		String exibir = "";
		
		//Atribuição da variável palavra com o texto informado pelo usuário
		palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
		
		//Manipulação da variável palavra
		for(int i = 0; i < palavra.length(); i++) {
			if(i % 2 == 0) exibir += palavra.toUpperCase().charAt(i);
			else exibir += palavra.toLowerCase().charAt(i);
		}
		
		//Mostrando a variável exibir
		JOptionPane.showMessageDialog(null, exibir);
	}
	
}

package ex01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Declara��o da vari�vel palavra
		String palavra = "";
		
		//Declara��o da vari�vel exibir
		String exibir = "";
		
		//Atribui��o da vari�vel palavra com o texto informado pelo usu�rio
		palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
		
		//Manipula��o da vari�vel palavra
		for(int i = 0; i < palavra.length(); i++) {
			if(i % 2 == 0) exibir += palavra.toUpperCase().charAt(i);
			else exibir += palavra.toLowerCase().charAt(i);
		}
		
		//Mostrando a vari�vel exibir
		JOptionPane.showMessageDialog(null, exibir);
	}
	
}

package ex02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Declara��o da vari�vel palavra
		String palavra = "";
		
		//Declara��o da vari�vel vogal
		char[] vogal = {'a', 'e', 'i', 'o', 'u'};
		
		//Declara��o da vari�vel exibir
		int exibir = 0;
		
		//Atribui��o da vari�vel palavra com o texto informado pelo usu�rio
		palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
		
		//Manipula��o da vari�vel palavra
		for(int i = 0; i < palavra.length(); i++) for(int j = 0; j < vogal.length; j++) if(palavra.charAt(i) == vogal[j]) exibir++;
		
		//Mostrando a vari�vel exibir
		JOptionPane.showMessageDialog(null, "Vogais: " + exibir);
	}
	
}

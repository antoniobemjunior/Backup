package ex02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Declaração da variável palavra
		String palavra = "";
		
		//Declaração da variável vogal
		char[] vogal = {'a', 'e', 'i', 'o', 'u'};
		
		//Declaração da variável exibir
		int exibir = 0;
		
		//Atribuição da variável palavra com o texto informado pelo usuário
		palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
		
		//Manipulação da variável palavra
		for(int i = 0; i < palavra.length(); i++) for(int j = 0; j < vogal.length; j++) if(palavra.charAt(i) == vogal[j]) exibir++;
		
		//Mostrando a variável exibir
		JOptionPane.showMessageDialog(null, "Vogais: " + exibir);
	}
	
}

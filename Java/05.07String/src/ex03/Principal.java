package ex03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Declara��o da vari�vel verbo
		String verbo = "";
		
		//Declara��o da vari�vel palavra
		String palavra = "";
		
		//Declara��o do array conjugacao1
		String[] conjugacao1 = {"eu", "tu", "ele", "n�s", "v�s", "eles"};
		
		//Declara��o do array conjugacao2
		String[] conjugacao2 = {"o", "as", "a", "amos", "�is", "am"};
		
		//Declara��o da vari�vel exibir
		String exibir = "";
		
		//Atribui��o da vari�vel verbo com o texto informado pelo usu�rio
		verbo = JOptionPane.showInputDialog("Digite uma verbo com final AR: ");
		
		//Manipula��o da vari�vel verbo
		if(verbo.endsWith("ar")) {
			for(int i = 0; i < verbo.length()-2; i++) palavra += verbo.charAt(i);
			for(int i = 0; i < conjugacao1.length; i++) exibir += conjugacao1[i]+" "+palavra+conjugacao2[i]+"\n";
			
			//Mostrando a vari�vel exibir
			JOptionPane.showMessageDialog(null, exibir);
		}else JOptionPane.showMessageDialog(null, "N�o � um verbo com final AR.");
	}
	
}

package ex03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Declaração da variável verbo
		String verbo = "";
		
		//Declaração da variável palavra
		String palavra = "";
		
		//Declaração do array conjugacao1
		String[] conjugacao1 = {"eu", "tu", "ele", "nós", "vôs", "eles"};
		
		//Declaração do array conjugacao2
		String[] conjugacao2 = {"o", "as", "a", "amos", "áis", "am"};
		
		//Declaração da variável exibir
		String exibir = "";
		
		//Atribuição da variável verbo com o texto informado pelo usuário
		verbo = JOptionPane.showInputDialog("Digite uma verbo com final AR: ");
		
		//Manipulação da variável verbo
		if(verbo.endsWith("ar")) {
			for(int i = 0; i < verbo.length()-2; i++) palavra += verbo.charAt(i);
			for(int i = 0; i < conjugacao1.length; i++) exibir += conjugacao1[i]+" "+palavra+conjugacao2[i]+"\n";
			
			//Mostrando a variável exibir
			JOptionPane.showMessageDialog(null, exibir);
		}else JOptionPane.showMessageDialog(null, "Não é um verbo com final AR.");
	}
	
}

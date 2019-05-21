package exemplo03;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Formulario {

	//Método de formulário
	void formulario() {
		JFrame f = new JFrame();
		f.setSize(1000,800);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(painel());
		f.setVisible(true);
	}
	
	//Método de painel
	JPanel painel() {
		JPanel p = new JPanel();
		p.setBackground(new Color(0,102,255));
		p.setBounds(5, 5, 974, 750);
		return p;
	}
	
	
	
}

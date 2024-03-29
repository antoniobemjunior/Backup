package formulario;

import java.awt.Color;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class Formulario extends JFrame {

	//Declaração e Inicialização das variáveis
	JPanel contentPane = new JPanel();
	JPanel panel = new JPanel();
	
	//Construtor
	public void Formulario() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(590, 625);
		setResizable(false);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel.setBounds(10, 10, 557, 140);
		panel.setLayout(null);

		contentPane.add(panel);
		
		JButton produto1 = new JButton("Camisa 1");
		JButton produto2 = new JButton("Camisa 2");
		JButton produto3 = new JButton("Camisa 3");
		JButton produto4 = new JButton("Camisa 4");
		JButton produto5 = new JButton("Camisa 5");
		JButton produto6 = new JButton("Camisa 6");
		JButton produto7 = new JButton("Camisa 7");
		JButton produto8 = new JButton("Camisa 8");
		
		produto1.setBounds(10, 10, 50, 20);
		produto2.setBounds(10, 30, 50, 20);
		produto3.setBounds(10, 50, 50, 20);
		produto4.setBounds(10, 70, 50, 20);
		produto5.setBounds(70, 10, 50, 20);
		produto6.setBounds(70, 30, 50, 20);
		produto7.setBounds(70, 50, 50, 20);
		produto8.setBounds(70, 70, 50, 20);
		
		panel.add(produto1);
		panel.add(produto2);
		panel.add(produto3);
		panel.add(produto4);
		panel.add(produto5);
		panel.add(produto6);
		panel.add(produto7);
		panel.add(produto8);

	}
	
}

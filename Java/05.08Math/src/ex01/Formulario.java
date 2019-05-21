package ex01;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Formulario {

	//Variáveis Globais
	JTextField visor = new JTextField();
	String[] simbolo = {"sin","cos","tan","log","√","³√","<-","÷","7","8","9","x","4","5","6","-","1","2","3","+","+-","0",",","="};
	JFrame f = new JFrame();
	
	//Construtor
	public Formulario(){
		
		f.setSize(335, 540);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.getContentPane().setLayout(null);
		f.setLocationRelativeTo(null);
		
		definirVisor();
		f.getContentPane().add(visor);
		f.getContentPane().add(painelBotoes());
		
		f.setVisible(true);
	}
	
	//Definições do visor
	private void definirVisor() {
		visor.setBounds(0, 0, 335, 60);
		visor.setBorder(null);
		visor.setEditable(false);
	}
	
	//Botões
	private JPanel painelBotoes() {
		
		GridLayout layout = new GridLayout(6,4);
		
		JPanel p = new JPanel();
		p.setBounds(0, visor.getY()+visor.getHeight(), f.getWidth()-16, f.getHeight()-100);
		p.setLayout(layout);
		
		for(int i=0; i<24; i++) {
			
			JButton btn = new JButton(simbolo[i]);
			btn.setActionCommand(String.valueOf(i));
			btn.setFont(new Font("Arial", Font.BOLD,22));
			btn.setContentAreaFilled(false);
			btn.setBorder(null);
			p.add(btn);
				
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println(btn.getActionCommand());
				}
			});
			
		}
		
		return p;
	}
}







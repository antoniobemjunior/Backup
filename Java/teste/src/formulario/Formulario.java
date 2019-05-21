package formulario;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.Bean;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtCampo;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Acao a = new Acao();
	private JScrollPane scrollPane_1;
	private JTable table_1;
	
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 76, 380, 174);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setColumnHeaderView(table);
		
		txtCampo = new JTextField();
		txtCampo.setBounds(25, 11, 96, 20);
		contentPane.add(txtCampo);
		txtCampo.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(this::acao);
		btnCadastrar.setBounds(138, 10, 89, 23);
		contentPane.add(btnCadastrar);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(25, 279, 380, 124);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
	}
	
	private void acao(ActionEvent ev) {
		Bean obj = new Bean();
		obj.setCampo(txtCampo.getText());
		
		a.cadastrar(obj);
		
		table.setModel(a.selecionar());
		table_1.setModel(a.selecionarEstatisticas());
	}
}

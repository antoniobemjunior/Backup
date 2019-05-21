package formulario;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import modelo.Pessoa;


public class Formulario {

	//ArrayList de pessoas
	public static ArrayList<Pessoa> dadosPessoa = new ArrayList<Pessoa>();
	
	//DefaultTableModel dados da tabela
	public DefaultTableModel dados = new DefaultTableModel();
	
	//Construtor
	public Formulario() {
		//Declaração do JFrame
		JFrame f = new JFrame("Sistema Simples");
		
		//Configuração do JFrame
		f.setSize(335,500);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		//Adicionando os paineis no JFrame
		f.getContentPane().add(listarDados());
		f.getContentPane().add(cadastrarDados());
		
		//Mostrando o JFrame
		f.setVisible(true);
	}
	
	//Cadastrar dados
	private JPanel cadastrarDados() {
		//Declaração dos elementos
		JPanel p = new JPanel();
		JLabel lblNome = new JLabel("Nome: ");
		JLabel lblIdade = new JLabel("Idade: ");
		JLabel lblCidade = new JLabel("Cidade: ");
		JTextField txtNome = new JTextField();
		JTextField txtIdade = new JTextField();
		JTextField txtCidade = new JTextField();
		JButton btnCadastrar = new JButton("Cadastrar");
		
		//Configuração dos elementos
		p.setBounds(10, 10, 300, 200);
		p.setBorder(new LineBorder(new Color(255,0,0),5));
		p.setLayout(null); 
		lblNome.setBounds(10, 10, 60, 20);
		lblIdade.setBounds(10, 50, 60, 20);
		lblCidade.setBounds(10, 90, 60, 20);
		txtNome.setBounds(70, 10, 220, 20);
		txtIdade.setBounds(70, 50, 220, 20);
		txtCidade.setBounds(70, 90, 220, 20);
		btnCadastrar.setBounds(80, 130, 150, 20);
		
		//Ação do botão cadastrar
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Declaração das variáveis
				String nome = "";
				int idade = 0;
				String cidade = "";
				Pessoa p = new Pessoa();
								
				//Obter os dados informados
				nome = txtNome.getText();
				idade = Integer.parseInt(txtIdade.getText());
				cidade = txtCidade.getText();
				
				//Criar um objeto da classe pessoa
				p.setNome(nome);
				p.setIdade(idade);
				p.setCidade(cidade);
				
				//Adicioar ao ArrayList
				dadosPessoa.add(p);

				//Adicionar dados na tabela
				dados.addRow(new Object[] {nome,idade,cidade});
				
				//Limpar os campos
				txtNome.setText("");
				txtIdade.setText("");
				txtCidade.setText("");
				
				//Cursor no campo nome selecionado
				txtNome.requestFocus();
			}
		});
		
		//Adicionando os elementos no painel
		p.add(lblNome);
		p.add(lblIdade);
		p.add(lblCidade);
		p.add(txtNome);
		p.add(txtIdade);
		p.add(txtCidade);
		p.add(btnCadastrar);
		
		//Retornar o painel
		return p;
	}
	
	//Listar dados
	private JPanel listarDados() {
		//Declaração dos elementos
		JPanel p = new JPanel();
		JScrollPane barra = new JScrollPane(tabela());
		
		//Configuração dos elementos
		p.setBounds(10, 240, 300, 200);
		p.setBorder(new LineBorder(new Color(255,0,0),1));
		p.setLayout(null);
		barra.setBounds(0,0,300,200);
		barra.setBorder(new LineBorder(new Color(255,0,0),5));
		
		//Adicionando os elementos no painel
		p.add(barra);
		
		//Retornar o painel
		return p;
	}
	
	//Tabela
	private JTable tabela() {
		//Declaração dos elementos
		JTable t = new JTable(dados);

		//Adicionado as colunas na tabela t
		dados.addColumn("Nome");
		dados.addColumn("Idade");
		dados.addColumn("Cidade");
		
		//Adicionado as linhas na tabela t
		dados.addRow(new Object[] {"Ralf",46,"Blumenau"});
		dados.addRow(new Object[] {"Antonio",29,"Blumenau"});
		dados.addRow(new Object[] {"Vinicius",18,"Blumenau"});
						
		//Retorno
		return t;
	}
	
}

package formularios;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.Font;
import acao.Acao;
import beans.*;
import dados.Dados;

@SuppressWarnings("serial")
public class Formulario extends JFrame {

	//Declaração e inicialização das variáveis
	private Acao a = new Acao();
	private JLabel lblNome = new JLabel("Nome do Jogo");
	private JLabel lblGenero = new JLabel("Genero");
	private JLabel lblPlataforma = new JLabel("Plataforma");
	private JLabel lblClassificacao = new JLabel("Classificação");
	private JLabel lblValor = new JLabel("Valor");
	private JButton btnCadastrar = new JButton("Cadastrar");
	private JButton btnAlterar = new JButton("Alterar");
	private JButton btnCancelar = new JButton("Cancelar");		
	private JButton btnExcluir = new JButton("Excluir");
	public static JTextField txtNome = new JTextField();
	public static JTextField txtGenero = new JTextField();
	public static JTextField txtPlataforma = new JTextField();
	public static JTextField txtClassificacao = new JTextField();
	public static JTextField txtValor = new JTextField();
	private JScrollPane scrollPane = new JScrollPane();
	private JScrollPane scrollPane2 = new JScrollPane();
	private JScrollPane scrollPane3 = new JScrollPane();
	private JPanel contentPane = new JPanel();
	private JTable table = new JTable();
	private JTable table2 = new JTable();
	private JTable table3 = new JTable();
	private static int codigoCurso;
	public static int generoQuantidade;
	public static int plataformaQuantidade;
	public static String opcao = "";

	//Limpa os campos após digitado
	private void limparCampos() {
		txtNome.setText("");
		txtGenero.setText("");
		txtPlataforma.setText("");
		txtClassificacao.setText("");
		txtValor.setText("");
		txtNome.requestFocus();
	}
	
	//Apresenta os dados do Jogo
	private Jogo jogo() {
		Jogo j = new Jogo();
		j.setNomeJogo(txtNome.getText());
		j.setGeneroJogo(txtGenero.getText());
		j.setPlataformaJogo(txtPlataforma.getText());
		j.setClassificacaoJogo(Integer.parseInt(txtClassificacao.getText()));
		j.setValorJogo(Double.parseDouble(txtValor.getText()));
		return j;
	}
	
	//Apresenta os dados das estatisticas
	private EstatisticasGenero estatisticasGenero() {
		EstatisticasGenero e = new EstatisticasGenero();
		e.setGeneroJogo(txtGenero.getText());
		return e;
	}
	
	//Apresenta os dados das estatisticas
		private EstatisticasPlataforma estatisticasPlataforma() {
			EstatisticasPlataforma e = new EstatisticasPlataforma();
			e.setPlataformaJogo(txtPlataforma.getText());
			return e;
		}
	
	//Configura a disponibilidade, fonte e posição do botão
	private void configurar(JButton b, int x, int y) {
		b.setEnabled(false);
		b.setFont(new Font("Tahoma", Font.BOLD, 11));
		b.setBounds(x, y, 90, 30);
		contentPane.add(b);
	}

	//Configura a fonte e posição do label
	private void configurar(JLabel l, int x, int y) {
		l.setFont(new Font("Tahoma", Font.BOLD, 11));
		l.setBounds(x, y, 100, 20);
		contentPane.add(l);
	}
	
	//Configura a posição do campo
	private void configurar(JTextField t, int x, int y) {
		t.setBounds(x, y, 300, 20);
		contentPane.add(t);
	}
	
	//Configura a disponibilidade do botão
	private void botao(boolean c) {
		btnCadastrar.setEnabled(c);
		btnAlterar.setEnabled(!c);
		btnExcluir.setEnabled(!c);
		btnCancelar.setEnabled(!c);		
	}
	
	//Construtor
	public Formulario() {
				
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 525);
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		configurar(lblNome, 10, 10);
		configurar(lblGenero, 10, 30);
		configurar(lblPlataforma, 10, 50);
		configurar(lblClassificacao, 10, 70);
		configurar(lblValor, 10, 90);
		configurar(txtNome, 100, 10);
		configurar(txtGenero, 100, 30);
		configurar(txtPlataforma, 100, 50);
		configurar(txtClassificacao, 100, 70);
		configurar(txtValor, 100, 90);
		configurar(btnCadastrar, 10, 120);
		btnCadastrar.setEnabled(true);
		configurar(btnAlterar, 110, 120);
		configurar(btnExcluir, 210, 120);
		configurar(btnCancelar, 310, 120);

		table.setModel(a.selecao());
		scrollPane.add(table);
		
		scrollPane.setBounds(10, 160, 390, 155);
		scrollPane.setViewportView(table);
		contentPane.add(scrollPane);
						
		table2.setModel(a.EstatisticasGenero());
		scrollPane2.setBounds(10, 326, 195, 149);
		contentPane.add(scrollPane2);
		scrollPane2.add(table2);
		scrollPane2.setViewportView(table2);
						
		table3.setModel(a.EstatisticasPlataforma());
		scrollPane3.setBounds(205, 326, 195, 149);
		contentPane.add(scrollPane3);
		scrollPane3.add(table3);
		scrollPane3.setViewportView(table3);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for(int i = 0; i < Dados.arrayJogos.size();i++) {
					System.out.println(Dados.arrayJogos.get(i).getGeneroJogo());
				}
				
			}
		});
		btnNewButton.setBounds(410, 120, 89, 30);
		contentPane.add(btnNewButton);
		
		btnCadastrar.addActionListener(this::cadastrar);
		btnAlterar.addActionListener(this::alterar);
		btnExcluir.addActionListener(this::excluir);
		btnCancelar.addActionListener(this::cancelar);
		
		txtGenero.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				opcao = "Genero";
			}
			@SuppressWarnings("unused")
			public void inputMethodTextChanged(InputMethodEvent event) {
				opcao = "Genero";
			}
		});		
		
		txtPlataforma.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				opcao = "Plataforma";
			}
			@SuppressWarnings("unused")
			public void inputMethodTextChanged(InputMethodEvent event) {
				opcao = "Plataforma";
			}
		});		
		
		//Ação do clique na tabela Jogo
		table.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				codigoCurso = table.getSelectedRow(); 
				txtNome.setText(table.getValueAt(codigoCurso, 0).toString());
				txtGenero.setText(table.getValueAt(codigoCurso, 1).toString());
				txtPlataforma.setText(table.getValueAt(codigoCurso, 2).toString());
				txtClassificacao.setText(table.getValueAt(codigoCurso, 3).toString());
				txtValor.setText(table.getValueAt(codigoCurso, 4).toString());
				botao(false);	
			}
		});
	}

	//Ação do botão cadastrar
	private void cadastrar(ActionEvent e) {
		a.cadastrar(jogo(),estatisticasGenero(),estatisticasPlataforma());
		table.setModel(a.selecao());
		table2.setModel(a.EstatisticasGenero());
		table3.setModel(a.EstatisticasPlataforma());
		limparCampos();
	}

	//Ação do botão alterar
	private void alterar(ActionEvent e) {
		a.alteracao(codigoCurso,jogo(),estatisticasGenero(),estatisticasPlataforma());
		table.setModel(a.selecao());
		table2.setModel(a.EstatisticasGenero());
		table3.setModel(a.EstatisticasPlataforma());
		limparCampos();
		botao(true);
	}
	
	//Ação do botão excluir
	private void excluir(ActionEvent e) {
		a.exclusao(codigoCurso);
		table.setModel(a.selecao());
		table2.setModel(a.EstatisticasGenero());
		table3.setModel(a.EstatisticasPlataforma());
		limparCampos();
		botao(true);
	}

	//Ação do botão cancelar
	private void cancelar(ActionEvent e) {
		limparCampos();
		botao(true);
	}
}


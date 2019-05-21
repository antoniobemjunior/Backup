package exercicio_1;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtGenero;
	private JTextField txtPlataforma;
	private JLabel lblNome;
	private JLabel lblGenero;
	private JLabel lblPlataforma;
	private JLabel lblClassificaoIndicativa;
	private JTextField txtClassificacao;
	private JLabel lblValor;
	private JTextField txtValor;
	public static JTable tabela_jogos;
	Jogo Jogo;
	public static JTable tabela_plataforma;
	public static JTable tabela_genero;
	public static String plataforma_auxiliar = "";
	public static String genero_auxiliar = "";
	public static String nome_auxiliar = "";

	
	
	public boolean CamposVazios() {
		if (txtNome.getText().equals("") || txtGenero.getText().equals("") || txtPlataforma.getText().equals("") || txtClassificacao.getText().equals("") || txtValor.getText().equals("")) {
			return true;
		}else {
			return false;	
		}
	}
	
	public void LimpaCampos() {
		txtNome.setText("");
		txtGenero.setText("");
		txtPlataforma.setText("");
		txtClassificacao.setText("");
		txtValor.setText("");
	}
	
	public void RetornaCampos(int linha) {
		txtNome.setText((String) tabela_jogos.getValueAt(linha, 0));
		txtGenero.setText((String) tabela_jogos.getValueAt(linha, 1));
		txtPlataforma.setText((String) tabela_jogos.getValueAt(linha, 2));
		txtClassificacao.setText(Integer.toString((Integer) tabela_jogos.getValueAt(linha, 3)));
		txtValor.setText(Double.toString((Double) tabela_jogos.getValueAt(linha, 4)));
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	@SuppressWarnings("serial")
	public TelaCadastro() {
		
		Acoes Acoes = new Acoes();
		Object[] sim_nao = {"SIM","N�O"};
		
		setTitle("Cadastro de jogos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 160, 664, 182);
		contentPane.add(scrollPane);
		
		tabela_jogos = new JTable();
		tabela_jogos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(tabela_jogos);
		tabela_jogos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome do Jogo", "G\u00EAnero do Jogo", "Plataforma", "Classifica\u00E7\u00E3o indicativa", "Valor do Jogo"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tabela_jogos.getColumnModel().getColumn(0).setResizable(false);
		tabela_jogos.getColumnModel().getColumn(0).setPreferredWidth(200);
		tabela_jogos.getColumnModel().getColumn(1).setResizable(false);
		tabela_jogos.getColumnModel().getColumn(1).setPreferredWidth(96);
		tabela_jogos.getColumnModel().getColumn(2).setResizable(false);
		tabela_jogos.getColumnModel().getColumn(3).setResizable(false);
		tabela_jogos.getColumnModel().getColumn(3).setPreferredWidth(125);
		tabela_jogos.getColumnModel().getColumn(4).setResizable(false);
		tabela_jogos.getColumnModel().getColumn(4).setPreferredWidth(83);
		
		tabela_jogos.getTableHeader().setReorderingAllowed(false);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(10, 126, 114, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setEnabled(false);
		btnAlterar.setBounds(134, 126, 114, 23);
		contentPane.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setEnabled(false);
		btnExcluir.setBounds(258, 126, 114, 23);
		contentPane.add(btnExcluir);
		
		txtNome = new JTextField();
		txtNome.setBounds(47, 36, 287, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtGenero = new JTextField();
		txtGenero.setBounds(465, 36, 162, 20);
		contentPane.add(txtGenero);
		txtGenero.setColumns(10);
		
		txtPlataforma = new JTextField();
		txtPlataforma.setBounds(47, 95, 96, 20);
		contentPane.add(txtPlataforma);
		txtPlataforma.setColumns(10);
		
		lblNome = new JLabel("Nome do Jogo:");
		lblNome.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNome.setBounds(47, 11, 89, 14);
		contentPane.add(lblNome);
		
		lblGenero = new JLabel("G\u00EAnero do Jogo:");
		lblGenero.setFont(new Font("Arial", Font.PLAIN, 12));
		lblGenero.setBounds(465, 11, 96, 14);
		contentPane.add(lblGenero);
		
		lblPlataforma = new JLabel("Plataforma:");
		lblPlataforma.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPlataforma.setBounds(47, 70, 96, 14);
		contentPane.add(lblPlataforma);
		
		lblClassificaoIndicativa = new JLabel("Classifica\u00E7\u00E3o indicativa:");
		lblClassificaoIndicativa.setFont(new Font("Arial", Font.PLAIN, 12));
		lblClassificaoIndicativa.setBounds(234, 70, 131, 14);
		contentPane.add(lblClassificaoIndicativa);
		
		txtClassificacao = new JTextField();
		txtClassificacao.setColumns(10);
		txtClassificacao.setBounds(234, 95, 131, 20);
		contentPane.add(txtClassificacao);
		
		lblValor = new JLabel("Valor: (R$)");
		lblValor.setFont(new Font("Arial", Font.PLAIN, 12));
		lblValor.setBounds(466, 67, 59, 14);
		contentPane.add(lblValor);
		
		txtValor = new JTextField();
		txtValor.setColumns(10);
		txtValor.setBounds(465, 95, 162, 20);
		contentPane.add(txtValor);
		
		JScrollPane scrollPane_plataforma = new JScrollPane();
		scrollPane_plataforma.setBounds(10, 353, 324, 182);
		contentPane.add(scrollPane_plataforma);
		
		tabela_plataforma = new JTable();
		tabela_plataforma.setRequestFocusEnabled(false);
		tabela_plataforma.setRowSelectionAllowed(false);
		tabela_plataforma.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Plataforma", "Quantidade"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tabela_plataforma.getColumnModel().getColumn(0).setResizable(false);
		tabela_plataforma.getColumnModel().getColumn(1).setResizable(false);
		tabela_plataforma.getTableHeader().setReorderingAllowed(false);
		scrollPane_plataforma.setViewportView(tabela_plataforma);
		
		JScrollPane scrollPane_genero = new JScrollPane();
		scrollPane_genero.setBounds(350, 353, 324, 182);
		contentPane.add(scrollPane_genero);
		
		tabela_genero = new JTable();
		tabela_genero.setRequestFocusEnabled(false);
		tabela_genero.setRowSelectionAllowed(false);
		tabela_genero.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"G\u00EAnero", "Quantidade"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tabela_genero.getColumnModel().getColumn(0).setResizable(false);
		tabela_genero.getColumnModel().getColumn(1).setResizable(false);
		tabela_genero.getTableHeader().setReorderingAllowed(false);
		scrollPane_genero.setViewportView(tabela_genero);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(382, 126, 89, 23);
		contentPane.add(btnCancelar);
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (CamposVazios() == false) {
					Jogo = new Jogo();
					
					Jogo.setNome_jogo(txtNome.getText().toUpperCase());
					Jogo.setGenero_jogo(txtGenero.getText().toUpperCase());
					Jogo.setPlataforma_jogo(txtPlataforma.getText().toUpperCase());
					Jogo.setClassificacao_jogo(Integer.parseInt(txtClassificacao.getText()));
					Jogo.setValor_jogo(Double.parseDouble(txtValor.getText().replace(",", ".")));
					
					Acoes.Cadastro_jogo(Jogo.getNome_jogo(), Jogo.getGenero_jogo(), Jogo.getPlataforma_jogo(), Jogo.getClassificacao_jogo(), Jogo.getValor_jogo());
					LimpaCampos();
				}else {
					JOptionPane.showMessageDialog(null, "Verifique se os campos est�o preenchidos!", "ERRO!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tabela_jogos.getSelectedRowCount() != 0) {
						if (CamposVazios() == false) {
							if (JOptionPane.showOptionDialog(null, "Deseja alterar os valores atuais na tabela para os valores nos campos?", "Deseja alterar?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, sim_nao, null) == 0) {
								Acoes.Alterar_jogo(tabela_jogos.getSelectedRow(), txtNome.getText().toUpperCase(), txtGenero.getText().toUpperCase(), txtPlataforma.getText().toUpperCase(), Integer.parseInt(txtClassificacao.getText()), Double.parseDouble(txtValor.getText()));
								btnCadastrar.setEnabled(true);
								btnAlterar.setEnabled(false);
								btnExcluir.setEnabled(false);
								LimpaCampos();
							}
						}else {
							JOptionPane.showMessageDialog(null, "Verifique se os campos est�o preenchidos!", "ERRO!", JOptionPane.ERROR_MESSAGE);
						}
				}else {
					JOptionPane.showMessageDialog(null, "Selecione alguma linha!", "ERRO!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		tabela_jogos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (tabela_jogos.getSelectedRowCount() != 0) {
					RetornaCampos(tabela_jogos.getSelectedRow());
					btnCadastrar.setEnabled(false);
					btnAlterar.setEnabled(true);
					btnExcluir.setEnabled(true);
					nome_auxiliar = (String) tabela_jogos.getValueAt(tabela_jogos.getSelectedRow(), 0);
					genero_auxiliar = (String) tabela_jogos.getValueAt(tabela_jogos.getSelectedRow(), 1);
					plataforma_auxiliar = (String) tabela_jogos.getValueAt(tabela_jogos.getSelectedRow(), 2);
				}
			}
		});
		
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tabela_jogos.getSelectedRowCount() != 0) {
					if (JOptionPane.showOptionDialog(null, "Deseja realmente excluir?", "Deseja excluir?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, sim_nao, null) == 0) {
						Acoes.Excluir_jogo(tabela_jogos.getSelectedRow(), tabela_jogos.getValueAt(tabela_jogos.getSelectedRow(), 1).toString(), tabela_jogos.getValueAt(tabela_jogos.getSelectedRow(), 2).toString());
						btnCadastrar.setEnabled(true);
						btnAlterar.setEnabled(false);
						btnExcluir.setEnabled(false);
						LimpaCampos();
					}
				}else {
					JOptionPane.showMessageDialog(null, "Selecione alguma linha!", "ERRO!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				LimpaCampos();
			}
		});
	}
}

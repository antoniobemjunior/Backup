package formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import acao.AcaoPessoa;
import beans.Jogo;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

@SuppressWarnings("serial")
public class Formulario extends JFrame {

	private JPanel contentPane = new JPanel();
	private JLabel lblColaborador = new JLabel("Colaborador");
	private JTextField txtColaborador = new JTextField();
	private JLabel lblSalarioBruto = new JLabel("Salário Bruto");
	private JTextField txtSalarioBruto = new JTextField();
	private double SalarioBruto = 0; 
	private JLabel lblValeTransporte = new JLabel("Vale Transporte");
	private JCheckBox ckbValeTransporte = new JCheckBox("");
	private JTextField txtValeTransporte = new JTextField();
	private int cntValeTransporte = 0;
	private JLabel displayValeTransporte = new JLabel();
	private JLabel lblClubeFidelidade = new JLabel("Clube Fidelidade");
	private JCheckBox ckbClubeFidelidade = new JCheckBox("");
	private JTextField txtClubeFidelidade = new JTextField();
	private int cntClubeFidelidade = 0;
	private JLabel displayClubeFidelidade = new JLabel();
	private JLabel lblPlanoDeSaude = new JLabel("Plano de Saúde");
	private JCheckBox ckbPlanoDeSaude = new JCheckBox("");
	private JTextField txtPlanoDeSaude = new JTextField();
	private int cntPlanoDeSaude = 0;
	private JLabel displayPlanoDeSaude = new JLabel();	
	private JLabel lblFalta = new JLabel("Faltas no mês");
	private JSpinner spnFaltas = new JSpinner();
	private JLabel lblCargo = new JLabel("Cargo");
	@SuppressWarnings("rawtypes")
	private JComboBox cmbCargo = new JComboBox();
	private JLabel lblImpostoDeRenda = new JLabel("Imposto de Renda");
	private JTextField txtImpostoDeRenda = new JTextField();
	private JLabel lblSalarioLiquido = new JLabel("Salário Líquido");
	private JTextField txtSalarioLiquido = new JTextField();
	private JButton btnCadastrar = new JButton("Cadastrar");
	private JButton btnEstatisticas = new JButton("Estatisticas");
	private DecimalFormat df = new DecimalFormat("#,###.##");
	private JTable tabelaJogos = new JTable();
	private AcaoPessoa a = new AcaoPessoa();
	private Component[] componentes = {lblColaborador,txtColaborador,lblCargo,cmbCargo,lblSalarioBruto,txtSalarioBruto,btnCadastrar,lblValeTransporte,ckbValeTransporte,txtValeTransporte,lblClubeFidelidade,ckbClubeFidelidade,txtClubeFidelidade,btnEstatisticas,lblPlanoDeSaude,ckbPlanoDeSaude,txtPlanoDeSaude,lblImpostoDeRenda,txtImpostoDeRenda,lblFalta,spnFaltas,lblSalarioLiquido,txtSalarioLiquido};
	private JLabel cargo1 = new JLabel("Estagiário");
	private int cntCargo1 = 0;
	private JLabel cargo2 = new JLabel("Desenvolvedor Jr");
	private int cntCargo2 = 0;
	private JLabel cargo3 = new JLabel("Desenvolvedor Pleno");
	private int cntCargo3 = 0;
	private JLabel cargo4 = new JLabel("Desenvolvedor Sênior");
	private int cntCargo4 = 0;
	private JLabel cargo5 = new JLabel("Analista de Sistemas Jr");
	private int cntCargo5 = 0;
	private JLabel cargo6 = new JLabel("Analista de Sistemas Pleno");
	private int cntCargo6 = 0;
	private JLabel cargo7 = new JLabel("Analista de Sistemas Sênior");
	private int cntCargo7 = 0;
	private JLabel cargo8 = new JLabel("Arquiteto de Software");
	private int cntCargo8 = 0;
	private JPanel estatisticas = new JPanel();
	private JLabel cargosDisplay = new JLabel();
	private JLabel nenhumaFalta = new JLabel();
	private int cntNenhumaFalta = 0;
	private JLabel ateTresFaltas = new JLabel();
	private int cntAteTresFaltas = 0;
	private JLabel ateCincoFaltas = new JLabel();
	private int cntAteCincoFaltas = 0; 
	private JLabel acimaDeCincoFaltas = new JLabel();
	private int cntAcimaDeCincoFaltas = 0;
	private JPanel panel = new JPanel();
	private Jogo j = new Jogo();
	private int opcao = 0;
	private JScrollPane scrollPane = new JScrollPane();
	
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

	private void estatistica(String n, int y, JLabel l, int c) {
		l.setText(n);
		l.setBounds(585,y,200,20);
		l.setText(l.getText()+" "+c);	
		contentPane.add(l);
	}

	private void estatistica2(String n, int y, JLabel l, int c, int t) {
		l.setText(n);
		l.setBounds(585,y,200,20);
		l.setText(l.getText()+((c*100)/t)+"%");
		contentPane.add(l);
	}
	
	private void limparCampos() {
		txtColaborador.setText("");
		cmbCargo.setSelectedIndex(0);
		txtSalarioBruto.setText("");
		ckbValeTransporte.setSelected(false);
		txtValeTransporte.setText("");
		ckbClubeFidelidade.setSelected(false);
		txtClubeFidelidade.setText("");
		ckbPlanoDeSaude.setSelected(false);
		txtPlanoDeSaude.setText("");
		txtImpostoDeRenda.setText("");
		spnFaltas.setValue(0);
		txtSalarioLiquido.setText("");
	}
	
	private void panelAdd(Component[] componentes) {
		for(int i = 0; i < componentes.length; i++) panel.add(componentes[i]);
	}
	
	private void configura1(JTextField t, int y) {
		t.setBorder(new LineBorder(Color.BLACK,1));
		t.setBackground(Color.WHITE);
		t.setEditable(false);
		t.setBounds(120, y, 150, 20);
	}
	
	private void configura2(JTextField t, int y) {
		t.setBorder(new LineBorder(Color.BLACK,1));
		t.setBackground(Color.WHITE);
		t.setEditable(false);
		t.setBounds(130, y, 140, 20);
	}
	
	@SuppressWarnings("rawtypes")
	private void configura3(JComboBox c, int y) {
		c.setBorder(new LineBorder(Color.BLACK,1));
		c.setBackground(Color.WHITE);
		c.setBounds(120, (y-1), 150, 22);
	}
	
	private void configura4(JCheckBox c, int y) {
		c.setSelected(false);
		c.setBounds(110, y, 20, 20);
	}
	
	private void configura5(JSpinner c, int y) {
		c.setBorder(new LineBorder(Color.BLACK,1));
		c.setBackground(Color.WHITE);
		c.setBounds(120, y, 150, 20);
	}
	
	private void configura6(JLabel l, int y) {
		l.setBounds(10, y, 110, 15);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Formulario() {

		panelAdd(componentes);		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(590, 625);
		setResizable(false);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel.setBounds(10, 10, 557, 214);
		panel.setLayout(null);
		contentPane.add(panel);
		
		configura6(lblColaborador, 10);
		configura1(txtColaborador,10);
		txtColaborador.setEditable(true);
		configura6(lblCargo, 31);
		configura3(cmbCargo, 31);
		cmbCargo.setModel(new DefaultComboBoxModel(new String[] {"Estagiário", "Desenvolvedor Jr", "Desenvolvedor Pleno", "Desenvolvedor Sênior", "Analista de Sistemas Jr", "Analista de Sistemas Pleno", "Analista de Sistemas Sênior", "Arquiteto de Software"}));
		configura6(lblSalarioBruto, 52);
		configura1(txtSalarioBruto, 52);
		configura6(lblImpostoDeRenda, 73);
		configura1(txtImpostoDeRenda, 73);
		configura6(lblFalta, 94);
		configura5(spnFaltas, 94);
		configura6(lblValeTransporte, 115);
		configura4(ckbValeTransporte, 115);
		configura2(txtValeTransporte, 115);
		configura6(lblClubeFidelidade, 136);
		configura4(ckbClubeFidelidade, 136);
		configura2(txtClubeFidelidade, 136);
		configura6(lblPlanoDeSaude, 157);
		configura4(ckbPlanoDeSaude, 157);
		configura2(txtPlanoDeSaude, 157);
		configura6(lblSalarioLiquido, 178);
		configura1(txtSalarioLiquido, 178);
		
		btnCadastrar.setBounds(350, 80, 120, 25);
		btnEstatisticas.setBounds(350, 110, 120, 25);
				
		tabelaJogos.setModel(a.selecionarJogos());
		scrollPane.setViewportView(tabelaJogos);
		scrollPane.setBounds(10, 236, 557, 339);
		contentPane.add(scrollPane);
				
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Instânciar obj
				j = new Jogo();
				j.setNome(txtColaborador.getText());
				j.setPlataforma(txtSalarioLiquido.getText());
				
				//Realizar cadastro
				a.cadastrarColaborador(j);
				
				//Atualizar
				tabelaJogos.setModel(a.selecionarJogos());
				
				//Limpar campos
				limparCampos();
				
				//Foco em Colaborador
				txtColaborador.requestFocus(true);
			}
		});
		
		btnEstatisticas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setSize(890, 625);
				setLocationRelativeTo(null);
				
				cargosDisplay.setBounds(650, 10, 200, 20);
				cargosDisplay.setText("Quantidade por cargo");
				
				estatistica("Estagiário", 40, cargo1, cntCargo1);
				estatistica("Desenvolvedor Jr", 60, cargo2, cntCargo2);
				estatistica("Desenvolvedor Pleno", 80, cargo3, cntCargo3);
				estatistica("Desenvolvedor Sênior", 100, cargo4, cntCargo4);
				estatistica("Analista de Sistemas Jr", 120, cargo5, cntCargo5);
				estatistica("Analista de Sistemas Pleno", 140, cargo6, cntCargo6);
				estatistica("Analista de Sistemas Sênior", 160, cargo7, cntCargo7);
				estatistica("Arquiteto de Software", 180, cargo8, cntCargo8);
				
				estatisticas.setBounds(575,10,290,514);
				estatisticas.setLayout(null);
				estatisticas.setBorder(new LineBorder(Color.LIGHT_GRAY,1));
				
				estatistica("Vale Transporte: ", 220, displayValeTransporte, cntValeTransporte);
				estatistica("Clube Fidelidade: ", 240, displayClubeFidelidade, cntClubeFidelidade);
				estatistica("Plano de Saúde: ", 260, displayPlanoDeSaude, cntPlanoDeSaude);
												
				cntNenhumaFalta--;
				
				int todas = cntNenhumaFalta;
				todas += cntAteTresFaltas;
				todas += cntAteCincoFaltas;
				todas += cntAcimaDeCincoFaltas;

				estatistica2("Nenhuma falta: ", 300, nenhumaFalta, cntNenhumaFalta, todas);
				estatistica2("Até 3 faltas: ", 320, ateTresFaltas, cntAteTresFaltas, todas);
				estatistica2("Até 5 faltas: ", 340, ateCincoFaltas, cntAteCincoFaltas, todas);
				estatistica2("Acima de 5 faltas: ", 360, acimaDeCincoFaltas, cntAcimaDeCincoFaltas, todas);
				
				contentPane.add(cargosDisplay);
				contentPane.add(estatisticas);
			}
		});

		spnFaltas.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				opcao = (Integer) spnFaltas.getValue();
				if(opcao < 0) spnFaltas.setValue(0);
				if(opcao == 0) cntNenhumaFalta++;
				if(opcao > 0 && opcao <= 3) cntAteTresFaltas++;
				if(opcao > 3 && opcao <= 5) cntAteCincoFaltas++;
				if(opcao > 5) cntAcimaDeCincoFaltas++;
			}
		});
				
		cmbCargo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cargo = cmbCargo.getSelectedItem().toString();
				if(!txtColaborador.getText().equals("")) {
					if(cargo == "Estagiário") { 
						txtSalarioBruto.setText("900.0");
						txtImpostoDeRenda.setText("0.0");
						cntCargo1++;
					}
					if(cargo == "Desenvolvedor Jr") {
						txtSalarioBruto.setText("1300.0");
						txtImpostoDeRenda.setText("52.0");
						cntCargo2++;
					}
					if(cargo == "Desenvolvedor Pleno") {
						txtSalarioBruto.setText("1800.0");
						txtImpostoDeRenda.setText("99.0");
						cntCargo3++;
					}
					if(cargo == "Desenvolvedor Sênior") {
						txtSalarioBruto.setText("2400.0");
						txtImpostoDeRenda.setText("144.0");
						cntCargo4++;
					}
					if(cargo == "Analista de Sistemas Jr") {
						txtSalarioBruto.setText("2700.0");
						txtImpostoDeRenda.setText("175.5");
						cntCargo5++;
					}
					if(cargo == "Analista de Sistemas Pleno") {
						txtSalarioBruto.setText("3200.0");
						txtImpostoDeRenda.setText("224.0");
						cntCargo6++;
					}
					if(cargo == "Analista de Sistemas Sênior") {
						txtSalarioBruto.setText("3600.0");
						txtImpostoDeRenda.setText("270.0");
						cntCargo7++;
					}
					if(cargo == "Arquiteto de Software") {
						txtSalarioBruto.setText("4400.0");
						txtImpostoDeRenda.setText("352.0");
						cntCargo8++;
					}
					SalarioBruto = Double.parseDouble(txtSalarioBruto.getText());
					txtSalarioLiquido.setText(Double.toString(Double.parseDouble(txtSalarioBruto.getText())-Double.parseDouble(txtImpostoDeRenda.getText())));
				}
			}
		});

		ckbClubeFidelidade.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ckbClubeFidelidade.setSelected(true);
				if(ckbClubeFidelidade.isSelected() == true) {
					txtClubeFidelidade.setText("100.0");
					txtSalarioLiquido.setText(Double.toString(Double.parseDouble(txtSalarioLiquido.getText())-(Double.parseDouble(txtClubeFidelidade.getText()))));
					cntClubeFidelidade++;
				}
			}
		});

		ckbPlanoDeSaude.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ckbPlanoDeSaude.setSelected(true);
				if(ckbPlanoDeSaude.isSelected() == true) {
					txtPlanoDeSaude.setText(df.format(0.03f*Double.parseDouble(txtSalarioLiquido.getText())).replace(',', '.'));
					txtSalarioLiquido.setText(Double.toString(Double.parseDouble(txtSalarioLiquido.getText())-(Double.parseDouble(txtPlanoDeSaude.getText()))));
					cntPlanoDeSaude++;
				}
				if(opcao == 0) txtSalarioLiquido.setText(Double.toString(Double.parseDouble(txtSalarioLiquido.getText())+(50)));
			}
		});
		
		ckbValeTransporte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ckbValeTransporte.setSelected(true);
				if(ckbValeTransporte.isSelected() == true) {
					txtValeTransporte.setText(df.format(0.06f*SalarioBruto));
					txtSalarioLiquido.setText(Double.toString(SalarioBruto-(Double.parseDouble(txtValeTransporte.getText()))));
					cntValeTransporte++;
				}
			}
		});
	}
}

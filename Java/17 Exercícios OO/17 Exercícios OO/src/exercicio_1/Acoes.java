package exercicio_1;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Acoes{

	DefaultTableModel tabela_jogos = new DefaultTableModel();
	DefaultTableModel tabela_plataforma = new DefaultTableModel();
	DefaultTableModel tabela_genero = new DefaultTableModel();
	
	public boolean ExisteCadastro(String nome, String plataforma) {
		boolean existe = false;
			for (int i = 0; i < tabela_jogos.getRowCount(); i++) {
				if (nome.equals(tabela_jogos.getValueAt(i, 0))) {
					if (plataforma.equals(tabela_jogos.getValueAt(i, 2))) {
						existe = true;
						break;
					}else {
						existe = false;
					}
				}else {
					existe = false;
				}
			}
		return existe;
	}

	public boolean ExistePlataforma(String plataforma) {
		boolean existe = false;
		for (int i = 0; i < tabela_plataforma.getRowCount(); i++) {
			if (plataforma.equals(tabela_plataforma.getValueAt(i,0))) {
				existe = true;
			}
		}
		return existe;
	}
	
	public boolean ExisteGenero(String genero) {
		boolean existe = false;
		for (int i = 0; i < tabela_genero.getRowCount(); i++) {
			if (genero.equals(tabela_genero.getValueAt(i, 0))) {
				existe = true;
			}
		}
		return existe;
	}
	
	
	
	public void AtualizaPlataforma(String plataforma) {

		int contador;
		if (ExistePlataforma(plataforma) == false) {
			tabela_plataforma.addRow(new Object[] {plataforma, "1"});
		}else {
			for (int i = 0; i < tabela_plataforma.getRowCount(); i++) {
				if (plataforma.equals(tabela_plataforma.getValueAt(i, 0))) {
					contador = Integer.parseInt((tabela_plataforma.getValueAt(i, 1).toString()));
					contador++;
					tabela_plataforma.setValueAt(contador , i, 1);
					break;
				}
			}
		}
		ExcluiPlataforma();
	}
	
	public void AtualizaGenero(String genero) {

		int contador;
		if (ExisteGenero(genero) == false) {
			tabela_genero.addRow(new Object[] {genero, "1"});
		}else {
			for (int i = 0; i < tabela_genero.getRowCount(); i++) {
				if (genero.equals(tabela_genero.getValueAt(i, 0))) {
					contador = Integer.parseInt((tabela_genero.getValueAt(i, 1).toString()));
					contador++;
					tabela_genero.setValueAt(contador , i, 1);
					break;
				}
			}
		}
		ExcluirGenero();
	}
	
	
	public void ExcluiPlataforma() {
		
		int contador;
		for (int i = 0; i < tabela_plataforma.getRowCount(); i++) {
			if (TelaCadastro.plataforma_auxiliar.equals(tabela_plataforma.getValueAt(i, 0))) {
				contador = Integer.parseInt(tabela_plataforma.getValueAt(i, 1).toString());
				contador --;
				if (contador <= 0) {
					tabela_plataforma.removeRow(i);
				}else {
					tabela_plataforma.setValueAt(contador, i, 1);
				}
				break;
			}
		}
		TelaCadastro.tabela_plataforma.setModel(tabela_plataforma);
	}
	
	
	public void ExcluirGenero() {
		
		int contador;
		for (int i = 0; i < tabela_genero.getRowCount(); i++) {
			if (TelaCadastro.genero_auxiliar.equals(tabela_genero.getValueAt(i, 0))) {
				contador = Integer.parseInt(tabela_genero.getValueAt(i, 1).toString());
				contador --;
				if (contador <= 0) {
					tabela_genero.removeRow(i);
				}else {
					tabela_genero.setValueAt(contador, i, 1);
				}
				break;
			}
		}
		TelaCadastro.tabela_genero.setModel(tabela_genero);
	}
	
	public void Cadastro_jogo(String nome, String genero, String plataforma, int classificacao, double valor) {
		
			if (ExisteCadastro(nome, plataforma) == false) {
				int contador;
				
				tabela_jogos = (DefaultTableModel) TelaCadastro.tabela_jogos.getModel();
				tabela_jogos.addRow(new Object[] {nome, genero, plataforma, classificacao, valor});
				TelaCadastro.tabela_jogos.setModel(tabela_jogos);
				
				tabela_plataforma = (DefaultTableModel) TelaCadastro.tabela_plataforma.getModel();
				tabela_genero = (DefaultTableModel) TelaCadastro.tabela_genero.getModel();

				
				if (ExistePlataforma(plataforma) == false) {
					tabela_plataforma.addRow(new Object[] {plataforma, "1"});
				}else {
					for (int i = 0; i < tabela_jogos.getRowCount(); i++) {
						if (plataforma.equals(tabela_jogos.getValueAt(i, 2))) {
							for (int j = 0; j < tabela_plataforma.getRowCount(); j++) {
								if (tabela_plataforma.getValueAt(j, 0).equals(plataforma)) {
									contador = Integer.parseInt((tabela_plataforma.getValueAt(j, 1).toString()));
									contador++;
									tabela_plataforma.setValueAt(contador , j, 1);
									break;
								}
							}
							break;
						}
					}
				}
				
				
				if (ExisteGenero(genero) == false) {
					tabela_genero.addRow(new Object[] {genero, "1"});
				}else {
					for (int i = 0; i < tabela_jogos.getRowCount(); i++) {
						if (genero.equals(tabela_jogos.getValueAt(i, 1))) {
							for (int j = 0; j < tabela_genero.getRowCount(); j++) {
								if (tabela_genero.getValueAt(j, 0).equals(genero)) {
									contador = Integer.parseInt((tabela_genero.getValueAt(j, 1).toString()));
									contador++;
									tabela_genero.setValueAt(contador , j, 1);
									break;
								}
							}
							break;
						}
					}
				}
				
				
			}else {
				JOptionPane.showMessageDialog(null, "J� existe o jogo nesta plataforma!", "ERRO!", JOptionPane.ERROR_MESSAGE);
			}
		
	}
	
	public void Alterar_jogo(int linha, String nome, String genero, String plataforma, int classificacao, double valor) {
		
		if (TelaCadastro.nome_auxiliar.equals(nome) && TelaCadastro.plataforma_auxiliar.equals(plataforma)) {
					tabela_jogos = (DefaultTableModel) TelaCadastro.tabela_jogos.getModel();
					tabela_jogos.setValueAt(nome, linha, 0);
					tabela_jogos.setValueAt(genero, linha, 1);
					tabela_jogos.setValueAt(plataforma, linha, 2);
					tabela_jogos.setValueAt(classificacao, linha, 3);
					tabela_jogos.setValueAt(valor, linha, 4);
					TelaCadastro.tabela_jogos.setModel(tabela_jogos);
					
					AtualizaPlataforma(plataforma);
					AtualizaGenero(genero);
					
			}else if (ExisteCadastro(nome, plataforma) == false) {
				tabela_jogos = (DefaultTableModel) TelaCadastro.tabela_jogos.getModel();
				tabela_jogos.setValueAt(nome, linha, 0);
				tabela_jogos.setValueAt(genero, linha, 1);
				tabela_jogos.setValueAt(plataforma, linha, 2);
				tabela_jogos.setValueAt(classificacao, linha, 3);
				tabela_jogos.setValueAt(valor, linha, 4);
				TelaCadastro.tabela_jogos.setModel(tabela_jogos);
				
				AtualizaPlataforma(plataforma);
				AtualizaGenero(genero);
			}else {
				JOptionPane.showMessageDialog(null, "J� existe o jogo nesta plataforma!", "ERRO!", JOptionPane.ERROR_MESSAGE);
			}
	}
	
	public void Excluir_jogo(int linha, String genero, String plataforma) {
		
		tabela_jogos = (DefaultTableModel) TelaCadastro.tabela_jogos.getModel();
		tabela_jogos.removeRow(linha);
		TelaCadastro.tabela_jogos.setModel(tabela_jogos);
		ExcluiPlataforma();
		ExcluirGenero();
		
	}
}

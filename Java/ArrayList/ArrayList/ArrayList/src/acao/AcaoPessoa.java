package acao;

import javax.swing.table.DefaultTableModel;

import beans.Jogo;
import dados.Dados;

public class AcaoPessoa {
	
	//Objeto da classe AcaoPlataforma
	AcaoPlataforma ap = new AcaoPlataforma();

	// Cadastrar Colaborador
	public void cadastrarColaborador(Jogo j) {
		Dados.arrayJogos.add(j);
		ap.existePlataforma(j.getPlataforma());
	}

	// Selecionar jogos
	public DefaultTableModel selecionarJogos() {

		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Colaborador");
		modelo.addColumn("Salário Líquido");

		for (int i = 0; i < Dados.arrayJogos.size(); i++) {
			modelo.addRow(new Object[] { Dados.arrayJogos.get(i).getNome(), Dados.arrayJogos.get(i).getPlataforma(),
					Dados.arrayJogos.get(i).getValor() });
		}

		return modelo;

	}

	// Alterar jogo
	public void alterarJogo(int indice, Jogo j, String nomePlataforma) {
		Dados.arrayJogos.set(indice, j);
		ap.atualizarPlataforma(j.getPlataforma(), nomePlataforma);
	}

	

	
}








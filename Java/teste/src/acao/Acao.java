package acao;
import javax.swing.table.DefaultTableModel;

import beans.Bean;
import beans.Estatistica;
import dados.Vetor;

public class Acao {

	//Cadastrar dado
	public void cadastrar(Bean obj) {
		Vetor.dados.add(obj);
		cadastrarEstatistica(obj.getCampo());
	}
	
	//Listar dados
	public DefaultTableModel selecionar() {
		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Campo");
		
		for(int i=0; i<Vetor.dados.size(); i++) {
			modelo.addRow(new Object[] {
				Vetor.dados.get(i).getCampo()
			});
		}
		
		return modelo;
		
	}
	
	//Cadastrar no ArrayList de estatísticas
	private void cadastrarEstatistica(String nome) {
		
		//Índice
		int indice = -1;
		
		//Percorre o vetor de estatísticas, caso haja o mesmo valor que o informado pelo usuário será obtido o índice
		for(int i=0; i<Vetor.dadosEstatistica.size(); i++) {
			
			if(nome.equals(Vetor.dadosEstatistica.get(i).getNome())) {
				indice = i;
			}
			
		}

		//-1 Singnifica que não encontrou o termo informado pelo usuário
		if(indice == -1) {
			Estatistica e = new Estatistica();
			e.setNome(nome);
			e.setQtd(1);
			Vetor.dadosEstatistica.add(e);
			
		//Caso encontre o termo informado pelo usuário, será realizado um incremento
		}else {
			int qtd = Vetor.dadosEstatistica.get(indice).getQtd();
			qtd++;
			
			Estatistica e = new Estatistica();
			e.setNome(nome);
			e.setQtd(qtd);
			
			Vetor.dadosEstatistica.set(indice, e);
		}
		
	}
	
	
	//Listar estatísticas
	public DefaultTableModel selecionarEstatisticas() {
		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Nome");
		modelo.addColumn("Quantidade");
		
		for(int i=0; i<Vetor.dadosEstatistica.size(); i++) {
			modelo.addRow(new Object[] {
				Vetor.dadosEstatistica.get(i).getNome(),
				Vetor.dadosEstatistica.get(i).getQtd()
			});
		}
		
		return modelo;
		
	}
	
}













package acao;

//import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import beans.*;
import dados.Dados;
import formularios.Formulario;

public class Acao {

	//CRUD - Create, Read, Update and Delete
	
	//Cadastro
	public void cadastrar(Jogo j, EstatisticasGenero g, EstatisticasPlataforma p) {
		boolean plataforma = plataforma();
		if(validar() == true)
			if(plataforma == true) {
				Dados.arrayJogos.add(j);
				cadastrarEstatisticaGenero(g.getGeneroJogo());
				cadastrarEstatisticaPlataforma(p.getPlataformaJogo());
			}
	}
	
	//Selecao
	public DefaultTableModel selecao() {
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Nome");
		modelo.addColumn("G�nero");
		modelo.addColumn("Plataforma");
		modelo.addColumn("Classifica��o");
		modelo.addColumn("Valor");
		for(int indice=0; indice<Dados.arrayJogos.size(); indice++) {
			modelo.addRow(new Object [] {
				Dados.arrayJogos.get(indice).getNomeJogo(),
				Dados.arrayJogos.get(indice).getGeneroJogo(),
				Dados.arrayJogos.get(indice).getPlataformaJogo(),
				Dados.arrayJogos.get(indice).getClassificacaoJogo(),
				Dados.arrayJogos.get(indice).getValorJogo(),
			});
		}
		return modelo;
	}
	
	//Alteracao
	public void alteracao(int indice, Jogo c, EstatisticasGenero g, EstatisticasPlataforma p) {
		Dados.arrayJogos.set(indice, c);
		if(Formulario.opcao == "Genero") {
			cadastrarEstatisticaGenero(g.getGeneroJogo());
			Dados.arrayEstatisticasGenero.set(indice, g);
			Dados.arrayEstatisticasGenero.remove(g);
		}
		if(Formulario.opcao == "Plataforma") {
			cadastrarEstatisticaPlataforma(p.getPlataformaJogo());
			Dados.arrayEstatisticasPlataforma.set(indice, p);
			Dados.arrayEstatisticasPlataforma.remove(p);
		}
		//Dados.arrayJogos.remove(indice);
	}
	
	//Exclusao
	public void exclusao(int indice) {
		Dados.arrayJogos.remove(indice);
	}
	
	//Valida��o
	private boolean validar() {
		boolean v = false;
		if(!Formulario.txtNome.getText().equals("")) v = true;
		if(!Formulario.txtGenero.getText().equals("")) v = true; 
		if(!Formulario.txtPlataforma.getText().equals("")) v = true;
		if(!Formulario.txtClassificacao.getText().equals("")) v = true;
		if(!Formulario.txtValor.getText().equals("")) v = true;
		return v;
	}

	//Plataforma
	private boolean plataforma() {
		boolean v = true;
		for(int i = 0; i < Dados.arrayJogos.size(); i++) { 
			if(Dados.arrayJogos.get(i).getNomeJogo().equals(Formulario.txtNome.getText())) {
				if(Dados.arrayJogos.get(i).getPlataformaJogo().equals(Formulario.txtPlataforma.getText())) {
					v = false;
				}
			}
		}
		return v;
	}
	
	//Cadastrar no ArrayList de estat�sticas
	private void cadastrarEstatisticaGenero(String nome) {
		//�ndice
		int indice = -1;
		//Percorre o vetor de estat�sticas, caso haja o mesmo valor que o informado pelo usu�rio ser� obtido o �ndice
		for(int i=0; i<Dados.arrayEstatisticasGenero.size(); i++) {
			if(nome.equals(Dados.arrayEstatisticasGenero.get(i).getGeneroJogo())) {
				indice = i;
			}
		}
		//-1 Singnifica que n�o encontrou o termo informado pelo usu�rio
		if(indice == -1) {
			EstatisticasGenero e = new EstatisticasGenero();
			e.setGeneroJogo(nome);
			e.setQtdGeneroJogo(1);
			Dados.arrayEstatisticasGenero.add(e);
		//Caso encontre o termo informado pelo usu�rio, ser� realizado um incremento
		}else {
			int qtd = Dados.arrayEstatisticasGenero.get(indice).getQtdGeneroJogo();
			qtd++;
			EstatisticasGenero e = new EstatisticasGenero();
			e.setGeneroJogo(nome);
			e.setQtdGeneroJogo(qtd);
			Dados.arrayEstatisticasGenero.set(indice, e);
		}
	}
	
	//Cadastrar no ArrayList de estat�sticas
	private void cadastrarEstatisticaPlataforma(String nome) {
		//�ndice
		int indice = -1;
		//Percorre o vetor de estat�sticas, caso haja o mesmo valor que o informado pelo usu�rio ser� obtido o �ndice
		for(int i=0; i<Dados.arrayEstatisticasPlataforma.size(); i++) {
			if(nome.equals(Dados.arrayEstatisticasPlataforma.get(i).getPlataformaJogo())) {
				indice = i;
			}
		}
		//-1 Singnifica que n�o encontrou o termo informado pelo usu�rio
		if(indice == -1) {
			EstatisticasPlataforma e = new EstatisticasPlataforma();
			e.setPlataformaJogo(nome);
			e.setQtdPlataformaJogo(1);
			Dados.arrayEstatisticasPlataforma.add(e);
		//Caso encontre o termo informado pelo usu�rio, ser� realizado um incremento
		}else {
			int qtd = Dados.arrayEstatisticasPlataforma.get(indice).getQtdPlataformaJogo();
			qtd++;
			EstatisticasPlataforma e = new EstatisticasPlataforma();
			e.setPlataformaJogo(nome);
			e.setQtdPlataformaJogo(qtd);
			Dados.arrayEstatisticasPlataforma.set(indice, e);
		}
	}
	
	//Listar Genero
	public DefaultTableModel EstatisticasGenero() {
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("G�nero");
		modelo.addColumn("Qtd");
		for(int i=0; i<Dados.arrayEstatisticasGenero.size(); i++) {
			modelo.addRow(new Object[] {
				Dados.arrayEstatisticasGenero.get(i).getGeneroJogo(),
				Dados.arrayEstatisticasGenero.get(i).getQtdGeneroJogo(),
			});
		}
		return modelo;
	}
	
	//Listar Plataforma
	public DefaultTableModel EstatisticasPlataforma() {
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Plataforma");
		modelo.addColumn("Qtd");
		for(int i=0; i<Dados.arrayEstatisticasPlataforma.size(); i++) {
			modelo.addRow(new Object[] {
				Dados.arrayEstatisticasPlataforma.get(i).getPlataformaJogo(),
				Dados.arrayEstatisticasPlataforma.get(i).getQtdPlataformaJogo()
			});
		}
		return modelo;
	}
}

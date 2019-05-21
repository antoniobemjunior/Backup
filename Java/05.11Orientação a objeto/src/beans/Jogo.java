package beans;

public class Jogo {

	//Atributos
	private String nomeJogo, generoJogo, plataformaJogo;
	private int classificacaoJogo;
	private double valorJogo;

	//Get e Set
	public String getNomeJogo() {
		return nomeJogo;
	}
	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}
	public String getGeneroJogo() {
		return generoJogo;
	}
	public void setGeneroJogo(String generoJogo) {
		this.generoJogo = generoJogo;
	}
	public String getPlataformaJogo() {
		return plataformaJogo;
	}
	public void setPlataformaJogo(String plataformaJogo) {
		this.plataformaJogo = plataformaJogo;
	}
	public int getClassificacaoJogo() {
		return classificacaoJogo;
	}
	public void setClassificacaoJogo(int string) {
		this.classificacaoJogo = string;
	}
	public double getValorJogo() {
		return valorJogo;
	}
	public void setValorJogo(double valorJogo) {
		this.valorJogo = valorJogo;
	}
}


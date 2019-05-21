package colaborador;

public class Pessoa {

	//Atributos
	private String nome, email, endereco;
	private int idade;
	
	//Construtor
	public Pessoa(String nome, String email, String endereco, int idade) {
		this.nome = nome;
		this.email = email;
		this.endereco  = endereco;
		this.idade = idade;
		
		exibirDadosPessoa();
	}
	
	//Método para exibir dados da pessoa
	private void exibirDadosPessoa() {
		System.out.println("Nome: "+nome);
		System.out.println("E-mail: "+email);
		System.out.println("Endereço: "+endereco);
		System.out.println("Idade: "+idade);
	}
	
}

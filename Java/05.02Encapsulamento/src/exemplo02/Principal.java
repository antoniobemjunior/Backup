package exemplo02;

public class Principal {

	public static void main(String[] args) {

		Pessoa p = new Pessoa();
		p.setNome("Antonio");
		p.setIdade(29);

		System.out.println(p.getNome() + "\n" + p.getIdade());
		
	}

}

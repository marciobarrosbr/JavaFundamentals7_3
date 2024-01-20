package staticPessoaExemple;

public class Pessoa {
	private String nome;
	private int idade;
	
	//Construtor privado (para impedir a criação de instancias diretamente)
	private Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}//end constructor
	
	//método estático para criar instancias da classe
	public static Pessoa criarPessoa(String nome, int idade) {
		if(idade>= 0) {
			return new Pessoa(nome, idade);
		}else {
			System.out.println("Idade inválida. Não é possível criar a pessoa.");
			return null;
		}//end if else
	}//end method static Pessoa
	
	//método getter
	public String getName() {
		return nome;
	}//end method getName
	public int getIdade() {
		return idade;
	}//end method getIdade
	
	
}

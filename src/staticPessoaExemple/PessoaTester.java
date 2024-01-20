package staticPessoaExemple;

public class PessoaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa1 = Pessoa.criarPessoa("Alice", 25);
		Pessoa pessoa2 = Pessoa.criarPessoa("Bob", -5);
		//Isso resultará em uma mensagem de idade inválida
		
		//Verificando se as instancias foram criadas do sucesso
		if(pessoa1 !=null) {
			System.out.println("nome: "+ pessoa1.getName()+", Idade: "+pessoa1.getIdade());
		}
		if (pessoa2 != null) {
			System.out.println("Nome: "+ pessoa2.getName()+ ", Idade: "+ pessoa2.getIdade());
		}
	}	
}

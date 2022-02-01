package classeObjetos.exercicio1;

public class Cliente {

	private String nome;
	private int idade;
	private String cpf;
	private String rg;
	private String endereco;
	private String email;
	
	public Cliente() {
		this.nome = "Luciana Soares";
		this.idade = 20;
		this.cpf = "123.456.789-10";
		this.rg = "01.234.567-8";
		this.endereco = "Rua sem nome, 100";
		this.email = "email@gmail.com";
	}
	
	public void status() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("CPF: " + cpf);
		System.out.println("RG: " + rg);
		System.out.println("Endereço: " + endereco);
		System.out.println("E-mail: " + email);
	}
}
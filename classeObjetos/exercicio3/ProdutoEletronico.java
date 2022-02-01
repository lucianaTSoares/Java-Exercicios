package classeObjetos.exercicio3;

public class ProdutoEletronico {
	
	private String tipoProduto;
	private String cor;
	private String marca;
	private int durabilidade;
	private boolean ligado;

	
	public ProdutoEletronico() {
		this.tipoProduto = "Smartphone";
		this.cor = "Roxo";
		this.marca = "Samsung";
		this.durabilidade = 100;
		this.ligado = false;
	}
	
	public void ligar() {
		
		if (ligado == true) {
			System.out.println("Produto já está ligado.");
		} else
			System.out.println("Ligando o produto.");
	}
	
	public void desligar() {
		
		if (ligado == true) {
			System.out.println("Desligar produto.");
		} else
			System.out.println("Produto está desligado.");
	}
	
	public void status() {
		System.out.println("Tipo do produto: " + tipoProduto);
		System.out.println("Cor: " + cor);
		System.out.println("Marca: " + marca);
		System.out.println("Durabilidade: " + durabilidade + "% \n");
		
		desligar();
	}
}

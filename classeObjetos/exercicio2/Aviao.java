package classeObjetos.exercicio2;

public class Aviao {

	private String modelo;
	private String cor; 
	private float comprimento;
	private float peso;
	private int durabilidade;
	private boolean voando;
	
	public Aviao() {
		this.modelo = "Airbus A320";
		this.cor = "Branco e vermelho";
		this.comprimento = 37.57f;
		this.peso = 55300f;
		this.durabilidade = 100;
		this.voando = false;
	}
	
	public void voar() {
		
		if (voando == false) {
			System.out.println("Não está em voo.");
		} else
			System.out.println("Está em voo..");
	}
	
	
	public void status() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Cor: " + cor);
		System.out.println("Comprimento: " + comprimento + "m");
		System.out.println("Peso: " + peso + "kg");
		System.out.println("Durabilidade: " + durabilidade + "% \n");
		voar();
	}
}

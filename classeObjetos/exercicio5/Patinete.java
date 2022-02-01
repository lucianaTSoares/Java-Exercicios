package classeObjetos.exercicio5;

public class Patinete {
    
    private String cor;
    private String corRodas;
    private boolean eletrico;
    private int potencia;
    private int pesoSuportado;
    private String tipo;
    private boolean ligado;


    public Patinete() {
        this.cor = "Azul Marinho";
        this.corRodas = "Preto";
        this.eletrico = true;
        this.potencia = 150;
        this.pesoSuportado = 100;
        this.tipo = "Adulto";
        this.ligado = false;
    }

    public void ligar() {
        
        if (ligado == false) {
            this.ligado = true;
            System.out.println("Patinete está ligando...");
        } else
            System.out.println("Patinete já está desligado.");
    }

    public void desligar() {

        if (ligado == true) {
            this.ligado = false;
            System.out.println("Patinete está desligando...");
        } else
            System.out.println("Patinete já está desligado.");
    }

    public void mostrarInformacoes() {
        System.out.println("Cor: " + cor);
        System.out.println("Cor das rodas: " + corRodas);
        System.out.println("É elétrico? " + eletrico);
        System.out.println("Potência: " + potencia + "W");
        System.out.println("Peso suportado: " + pesoSuportado + "kg");
        System.out.println("Tipo: " + tipo);
        System.out.println("Está ligado? " + ligado + "\n");
        ligar();
    }
}

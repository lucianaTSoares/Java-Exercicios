package herancaEPolimorfismo.Exercicio1;

public class Animal {
    
    private String nome;
    private int idade;
    private String som;

    public void emitirSom() {
        System.out.println("Som: " + som);
    }

    public void correr() {
        System.out.println("Correndo...");
    }

    // Metodos getter e setter
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }
}

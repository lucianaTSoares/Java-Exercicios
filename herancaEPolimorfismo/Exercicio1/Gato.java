package herancaEPolimorfismo.Exercicio1;

public class Gato extends Animal {
    
    @Override
    public void emitirSom() {
        System.out.println("Som: Miar");
    }

    public void arranhar() {
        System.out.println("Arranhando...");
    }
}

package herancaEPolimorfismo.Exercicio1;

public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Som: Latir");
    }

    public void brincar() {
        System.out.println("Brincando...");
    }
}

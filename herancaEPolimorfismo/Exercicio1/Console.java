package herancaEPolimorfismo.Exercicio1;

import java.util.Scanner;

public class Console {
    
    public static void main(String[] args) {
        
        Cachorro dog = new Cachorro();
        Gato gato = new Gato();
        Preguica preguica = new Preguica();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-- LISTA DE ANIMAIS --\n");

        // Cachorro
        System.out.print("Insira o nome do cachorro: ");
        dog.setNome(sc.nextLine());

        System.out.print("Insira a idade do cachorro: ");
        dog.setIdade(sc.nextInt());
        sc.nextLine();

        System.out.println("\nNome: " + dog.getNome());
        System.out.println("Idade: " + dog.getIdade());
        dog.brincar();
        System.out.println("\n");

        // Gato
        System.out.print("Insira o nome do gato: ");
        gato.setNome(sc.nextLine());

        System.out.print("Insira a idade do gato: ");
        gato.setIdade(sc.nextInt());
        sc.nextLine();

        System.out.println("\nNome: " +  gato.getNome());
        System.out.println("Idade: " +  gato.getIdade());
        gato.arranhar();
        System.out.println("\n");

        // Preguica
        System.out.print("Insira o nome da preguiça: ");
        preguica.setNome(sc.nextLine());

        System.out.print("Insira a idade da preguiça: ");
        preguica.setIdade(sc.nextInt());
        sc.nextLine();

        System.out.println("\nNome: " +  preguica.getNome());
        System.out.println("Idade: " +  preguica.getIdade());
        preguica.subirArvores();
        System.out.println("\n");

        sc.close();
    }
}

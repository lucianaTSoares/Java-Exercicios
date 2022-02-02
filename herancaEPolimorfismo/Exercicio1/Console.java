/*
Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal.

Implemente um programa que crie os 3 tipos de animais definidos no exercício
anterior e invoque o método que emite o som de cada um de forma polimórfica, isto
é, independente do tipo de animal.
*/

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
        dog.emitirSom();
        dog.brincar();
        dog.correr();
        System.out.println("\n");

        // Gato
        System.out.print("Insira o nome do gato: ");
        gato.setNome(sc.nextLine());

        System.out.print("Insira a idade do gato: ");
        gato.setIdade(sc.nextInt());
        sc.nextLine();

        System.out.println("\nNome: " +  gato.getNome());
        System.out.println("Idade: " +  gato.getIdade());
        gato.emitirSom();
        gato.arranhar();
        gato.correr();
        System.out.println("\n");

        // Preguica
        System.out.print("Insira o nome da preguiça: ");
        preguica.setNome(sc.nextLine());

        System.out.print("Insira a idade da preguiça: ");
        preguica.setIdade(sc.nextInt());
        sc.nextLine();

        System.out.println("\nNome: " +  preguica.getNome());
        System.out.println("Idade: " +  preguica.getIdade());
        preguica.emitirSom();
        preguica.subirArvores();
        System.out.println("\n");

        sc.close();
    }
}

package herancaEPolimorfismo.Exercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Programa {
    
    public static void main(String[] args) {
        
        ArrayList<String> listaEstoque = new ArrayList<>(); 
        Scanner sc = new Scanner(System.in);
        String produto;
        int opcao, posicao;

        do {
            System.out.println("\n\n---- MENU ESTOQUE ----\n");
            System.out.println("Escolha uma das opções abaixo: \n\n");
            System.out.println("1- Adicionar produto\n"
                                + "2- Alterar produto\n"
                                + "3- Remover produto\n"
                                + "4- Apresentar informações do estoque\n"
                                + "5- Sair\n");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();
        
            switch (opcao) {

                case 1:
                    System.out.print("\nInsira o nome do produto: ");
                    listaEstoque.add(produto = sc.nextLine());
                    System.out.println("\nProduto adicionado com sucesso.");
                    break;

                case 2: 
                    System.out.print("\nInsira o nome do produto para alteração: ");
                    produto = sc.nextLine();
                    
                    if (listaEstoque.contains(produto) == true) {
                        posicao = listaEstoque.indexOf(produto); // procura a posicao do elemento

                        System.out.print("Insira um novo nome: ");
                        produto = sc.nextLine();

                        listaEstoque.set(posicao, produto);

                        System.out.println("\nProduto alterado com sucesso.");

                    } else
                        System.out.println("\nITEM NÃO ENCONTRADO, TENTE NOVAMENTE!");

                    break;
                
                    case 3:
                    System.out.print("\nInsira o nome do produto para remoção: ");
                    produto = sc.nextLine();

                    if (listaEstoque.contains(produto) == true) {
                        posicao = listaEstoque.indexOf(produto); // procura a posicao do elemento
                        listaEstoque.remove(posicao);
                        System.out.println("\nProduto removido com sucesso.");

                    } else
                        System.out.println("\nITEM NÃO ENCONTRADO, TENTE NOVAMENTE!");

                    break;

                    case 4:
                        Collections.sort(listaEstoque);
                        System.out.println("\nLista: " + listaEstoque);
                    break;
            }

        } while (opcao != 5);
        sc.close();
    }
}

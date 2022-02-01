package classeObjetos.exercicio3;

import java.util.Scanner;

public class ConsoleProduto {

	public static void main(String[] args) {

		ProdutoEletronico produto = new ProdutoEletronico();
		Scanner sc = new Scanner(System.in);
		int num;
		
		produto.status();
		
		System.out.println("\nDeseja ligar o produto?\n1- Sim\n2- Não\n");
		System.out.print("Número: ");
		num = sc.nextInt();
		
		if (num == 1) {
			produto.ligar();
		} else
			System.exit(0);

		sc.close();
	}
}
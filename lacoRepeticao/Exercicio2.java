/*
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */

package lacoRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		int i, num, numImpares = 0, numPares = 0;
		Scanner scan = new Scanner(System.in);

		for (i = 0; i < 10; i++) {

			System.out.print("Insira um número: ");
			num = scan.nextInt();

			switch (num % 2) {

			case 0:
				numPares++;
				break;

			default:
				numImpares++;
			}
		}

		System.out.println("\nQuantidade de números pares: " + numPares);
		System.out.println("Quantidade de números ímpares: " + numImpares);
	}
}

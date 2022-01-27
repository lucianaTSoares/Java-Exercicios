/*
 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 */

package lacoRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		int i, num, numImpares = 0, numPares = 0;
		Scanner scan = new Scanner(System.in);

		for (i = 0; i < 10; i++) {

			System.out.print("Insira um n�mero: ");
			num = scan.nextInt();

			switch (num % 2) {

			case 0:
				numPares++;
				break;

			default:
				numImpares++;
			}
		}

		System.out.println("\nQuantidade de n�meros pares: " + numPares);
		System.out.println("Quantidade de n�meros �mpares: " + numImpares);
	}
}

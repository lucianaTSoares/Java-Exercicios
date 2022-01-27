/*
 * Crie um programa que leia um número do teclado até que encontre um
 * número igual a zero. No final, mostre a soma dos números
 * digitados.(DO...WHILE)
 */

package lacoRepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		int num, somaNumeros = 0;
		Scanner sc = new Scanner(System.in);

		do {

			System.out.print("Insira um número: ");
			num = sc.nextInt();

			somaNumeros += num;

		} while (num != 0);

		System.out.println("\nSoma: " + somaNumeros);
		sc.close();
	}

}

/*
 * Crie um programa que leia um n�mero do teclado at� que encontre um
 * n�mero igual a zero. No final, mostre a soma dos n�meros
 * digitados.(DO...WHILE)
 */

package lacoRepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		int num, somaNumeros = 0;
		Scanner sc = new Scanner(System.in);

		do {

			System.out.print("Insira um n�mero: ");
			num = sc.nextInt();

			somaNumeros += num;

		} while (num != 0);

		System.out.println("\nSoma: " + somaNumeros);
		sc.close();
	}

}

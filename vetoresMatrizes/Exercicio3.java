/*
 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
 * 		a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
 * 		das matrizes N1 e N2;
 * 		b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
 * 		posição das matrizes N1 e N2.
 */

package vetoresMatrizes;

import java.util.Random;

public class Exercicio3 {

	public static void main(String[] args) {

		Random gerador1 = new Random();
		Random gerador2 = new Random();
		int[][] n1 = new int[4][6];
		int[][] n2 = new int[4][6];
		int[][] m1 = new int[4][6];
		int[][] m2 = new int[4][6];

		for (int l = 0; l < 4; l++) {
			
			for (int c = 0; c < 6; c++) {
				
				n1[l][c] = gerador1.nextInt(9) + 1;
				n2[l][c] = gerador2.nextInt(9) + 1;

				m1[l][c] = n1[l][c] + n2[l][c];
				m2[l][c] = n1[l][c] - n2[l][c];
			}
		}

		// Print matriz N1
		System.out.println("Matriz N1: ");
		
		for (int l = 0; l < 4; l++) {

			for (int c = 0; c < 6; c++) {
				System.out.print(n1[l][c] + "\t");
			}
			System.out.println();
		}
		
		// Print matriz N2
		System.out.println("\n\nMatriz N2: ");

		for (int l = 0; l < 4; l++) {

			for (int c = 0; c < 6; c++) {
				System.out.print(n2[l][c] + "\t");
			}
			System.out.println();
		}
		
		// Print matriz M1
		System.out.println("\n\nMatriz M1: ");

		for (int l = 0; l < 4; l++) {

			for (int c = 0; c < 6; c++) {
				System.out.print(m1[l][c] + "\t");
			}
			System.out.println();
		}
		
		// Print matriz M2
		System.out.println("\n\nMatriz M2: ");
		
		for (int l = 0; l < 4; l++) {

			for (int c = 0; c < 6; c++) {
				System.out.print(m2[l][c] + "\t");
			}
			System.out.println();
		}
	}
}

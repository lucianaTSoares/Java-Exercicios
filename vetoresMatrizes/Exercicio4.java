/*
 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
 * em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
 * diagonal, ou seja, diagonal principal.
 */

package vetoresMatrizes;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	
		int[][] num = new int[3][3];
		int soma = 0, somaDiagonal = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int l = 0; l < 3; l++) {
			
			for (int c = 0; c < 3; c++) {
				
				System.out.print("Insira valores: ");
				num[l][c] = sc.nextInt();
				
				soma += num[l][c];
			}
		}
		
		somaDiagonal = num[0][0] + num[1][1] + num[2][2];
		
		System.out.println("\nSoma total da matriz: " + soma);
		System.out.println("Soma da diagonal: " + somaDiagonal);
		sc.close();
	}

}

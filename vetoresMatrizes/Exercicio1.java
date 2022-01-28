/*
 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
 * atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
 */

package vetoresMatrizes;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	
		int maiorPontuacao = 0;
		int[] pontuacao = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			
			System.out.print("Adicione a pontuação " + (i+1) + ": ");
			pontuacao[i] = sc.nextInt();
			
			System.out.println("Pontuação: " + pontuacao[i] + "\n");
			
			if (pontuacao[i] > maiorPontuacao) {
				
				maiorPontuacao = pontuacao[i];
			}
		}
		
		System.out.println("Maior pontuação: " + maiorPontuacao);
		sc.close();
	}

}

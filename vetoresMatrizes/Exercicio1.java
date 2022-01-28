/*
 * Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
 * atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
 */

package vetoresMatrizes;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	
		int maiorPontuacao = 0;
		int[] pontuacao = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			
			System.out.print("Adicione a pontua��o " + (i+1) + ": ");
			pontuacao[i] = sc.nextInt();
			
			System.out.println("Pontua��o: " + pontuacao[i] + "\n");
			
			if (pontuacao[i] > maiorPontuacao) {
				
				maiorPontuacao = pontuacao[i];
			}
		}
		
		System.out.println("Maior pontua��o: " + maiorPontuacao);
		sc.close();
	}

}

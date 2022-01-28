/*
 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
 * que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
 * imprima a média aritmética dos lançamentos, contabilize e apresente também
 * quantas foram as ocorrências da maior pontuação.
 */

package vetoresMatrizes;

import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {

		Random numAleatorio = new Random();
		int[] vetor = new int[10];
		int maiorNumero = 0, qntOcorrencia = 0, qnt1 = 0, qnt2 = 0, qnt3 = 0, qnt4 = 0, qnt5 = 0, qnt6 = 0;
		double somaValores = 0, mediaValores;

		System.out.print("Valores lançados: ");

		for (int i = 0; i < 10; i++) {

			vetor[i] = numAleatorio.nextInt(6) + 1; // Randomizacao de valores e atribuicao no vetor

			System.out.print(vetor[i] + "  ");

			somaValores += vetor[i];

			// Verifica qual o maior numero ocorrido
			if (vetor[i] > maiorNumero) {
				maiorNumero = vetor[i];
			}

			// Verifica qnt de ocorrencia do maior numero ocorrido
			switch (vetor[i]) {
			case 1:
				qnt1 += 1;

				if (maiorNumero == 1) {
					qntOcorrencia = qnt1;
				}

				break;

			case 2:
				qnt2 += 1;

				if (maiorNumero == 2) {
					qntOcorrencia = qnt2;
				}

				break;

			case 3:
				qnt3 += 1;

				if (maiorNumero == 3) {
					qntOcorrencia = qnt3;
				}

				break;

			case 4:
				qnt4 += 1;

				if (maiorNumero == 4) {
					qntOcorrencia = qnt4;
				}

				break;

			case 5:
				qnt5 += 1;

				if (maiorNumero == 5) {
					qntOcorrencia = qnt5;
				}

				break;

			case 6:
				qnt6 += 1;

				if (maiorNumero == 6) {
					qntOcorrencia = qnt6;
				}

				break;
			}
		}

		mediaValores = somaValores / 10;

		System.out.println("\nMédia dos valores: " + mediaValores);
		System.out.println("O maior valor foi " + maiorNumero + " e seu número de ocorrencia foi " + qntOcorrencia + ".");
	}
}

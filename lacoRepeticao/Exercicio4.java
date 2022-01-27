/*
 * Uma empresa desenvolveu uma pesquisa para saber as características
 * psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
 * era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
 * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
 * agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
 * pessoas, calcule e mostre: (WHILE)
 * 	- o número de pessoas calmas;
 * 	- o número de mulheres nervosas;
 * 	- o número de homens agressivos;
 * 	- o número de outros calmos;
 * 	- o número de pessoas nervosas com mais de 40 anos;
 * 	- o número de pessoas calmas com menos de 18 anos.
 */

package lacoRepeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		int i = 0, idade, sexo, comportamento;
		int qntCalmos = 0, qntMulheresNervosas = 0, qntHomensAgressivos = 0, qntOutrosCalmos = 0, qntNervosaIdadeMaior = 0, qntCalmaIdadeMenor = 0;
		Scanner sc = new Scanner(System.in);

		while (i < 150) {

			System.out.println("--- PESQUISA ---");
			System.out.print("\nInsira sua idade: ");
			idade = sc.nextInt();

			System.out.println("\nInsira seu sexo de acordo com o número correspondente: ");
			System.out.println("1 - Feminino \n2 - Masculino \n3 - Outros");
			System.out.print("\nNúmero: ");
			sexo = sc.nextInt();
			
			if (sexo != 1 && sexo != 2 && sexo != 3) {
				System.out.println("\nInsira um dos números correspondentes.\n");
				System.exit(0);
			}

			System.out.println("\nInsira como era seu comportamento de acordo com o número correspondente: ");
			System.out.println("1 - Calmo \n2 - Nervoso \n3 - Agressivo");
			System.out.print("\nNúmero: ");
			comportamento = sc.nextInt();

			switch (comportamento) {
				case 1:
					if (sexo == 3) {
						qntOutrosCalmos++;
					}
					
					if (idade < 18) {
						qntCalmaIdadeMenor++;
					}
					
					qntCalmos++;
					
					break;
	
				case 2:
					if (sexo == 1) {
						qntMulheresNervosas++;
					}
					
					if (idade > 40) {
						qntNervosaIdadeMaior++;
					}
					
					break;
	
				case 3:
					if (sexo == 2) {
						qntHomensAgressivos++;
					}
					
					break;
	
				default:
					System.out.println("\nInsira um dos números correspondentes.\n");
					System.exit(0);
			}
			i++;
		}
		
		System.out.println("\n--- RESULTADO ---");
		System.out.println("\nNúmero de pessoas calmas: " + qntCalmos);
		System.out.println("Número de mulheres nervosas: " + qntMulheresNervosas);
		System.out.println("Número de homens agressivos: " + qntHomensAgressivos);
		System.out.println("Número de outros calmos: " + qntOutrosCalmos);
		System.out.println("Número de pessoas nervosas com +40 anos: " + qntNervosaIdadeMaior);
		System.out.println("Número de pessoas calmas com -18 anos: " + qntCalmaIdadeMenor);

		sc.close();
	}

}

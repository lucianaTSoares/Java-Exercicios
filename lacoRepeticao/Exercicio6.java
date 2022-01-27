/*
 * Escrever um programa que receba vários números inteiros no teclado. E no
 * final imprimir a média dos números múltiplos de 3. Para sair digitar
 * 0(zero).(DO...WHILE)
 */

package lacoRepeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		int num, somaNumeros = 0, mediaNumeros, qntNumerosMultiplos3 = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 0 para encerrar o programa.\n");
		
		do {
			
			System.out.print("Insira um número: ");
			num = sc.nextInt();
			
			if (num % 3 == 0) {
				somaNumeros += num;
				
				if (num != 0) {
					qntNumerosMultiplos3++;		
				}
			}
						
		} while (num != 0);
		
		mediaNumeros = somaNumeros / qntNumerosMultiplos3;
		
		System.out.println("\nMédia dos números múltiplos de 3: " + mediaNumeros);
		sc.close();
	}

}

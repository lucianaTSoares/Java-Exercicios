/*
 * Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
 * final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
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
			
			System.out.print("Insira um n�mero: ");
			num = sc.nextInt();
			
			if (num % 3 == 0) {
				somaNumeros += num;
				
				if (num != 0) {
					qntNumerosMultiplos3++;		
				}
			}
						
		} while (num != 0);
		
		mediaNumeros = somaNumeros / qntNumerosMultiplos3;
		
		System.out.println("\nM�dia dos n�meros m�ltiplos de 3: " + mediaNumeros);
		sc.close();
	}

}

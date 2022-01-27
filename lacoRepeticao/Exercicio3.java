/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 
 * 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando 
 * idade for =-99. (WHILE)
 */

package lacoRepeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		int idade = 0, menos21Anos = 0, mais50Anos = 0, demaisIdade = 0;
		Scanner scan = new Scanner(System.in);

		while (idade <= 99) {

			System.out.print("Idade: ");
			idade = scan.nextInt();

			if (idade < 21) {
				menos21Anos++;
				
			} else if (idade > 50) {
				mais50Anos++;
				
			} else {
				demaisIdade++;
			}
		}
		
		System.out.println("\nPessoas com menos de 21 anos: " + menos21Anos);
		System.out.println("Pessoas com mais de 50 anos: " + mais50Anos);
		System.out.println("Pessoas entre 21 e 50 anos: " + demaisIdade);
		
		scan.close();
	}
}

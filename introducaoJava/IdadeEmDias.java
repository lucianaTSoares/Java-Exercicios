package introducaoJava;
/*
 * Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e 
 * dias e mostre-a expressa apenas em dias.
 */

import java.util.Scanner;

public class IdadeEmDias {
	
	public static void main(String[] args) {
		
		int idadeAnos, idadeMeses, idadeDias, idadeExprDias;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Escreva sua idade em anos: ");
		idadeAnos = scan.nextInt();
		
		System.out.print("Escreva sua idade em meses: ");
		idadeMeses = scan.nextInt();
		
		System.out.print("Escreva sua idade em dias: ");
		idadeDias = scan.nextInt();

		idadeExprDias = (idadeDias + (idadeAnos*365) + (idadeMeses*30));
		
		System.out.println("\nIdade em dias: " + idadeExprDias);
		
		scan.close();
	}

}

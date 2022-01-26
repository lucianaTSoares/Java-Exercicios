package introducaoJava;
/*
 * Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a 
 * expressa em anos, meses e dias.
 */

import java.util.Scanner;

public class IdadeDiaMesAno {

	public static void main(String[] args) {
		
		int idadeDias, dia, mes, ano;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira sua idade em dias: ");
		idadeDias = scan.nextInt();
		
		dia = idadeDias / 365;
		mes = (idadeDias % 365) / 30;
		ano = (idadeDias % 365) % 30;
		
		System.out.println("\nSua idade em dias: " + dia);
		System.out.println("Sua idade em meses: " + mes);
		System.out.println("Sua idade em anos: " + ano);
		
		scan.close();
		
	}
}

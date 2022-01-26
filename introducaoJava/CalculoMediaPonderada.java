package introducaoJava;
/*
 * Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste 
 * aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, 
 * respectivamente.
 */

import java.util.Scanner;

public class CalculoMediaPonderada {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, mediaFinal;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira a primeira nota: ");
		nota1 = scan.nextInt();
		
		System.out.print("Insira a segunda nota: ");
		nota2 = scan.nextInt();
		
		System.out.print("Insira a terceira nota: ");
		nota3 = scan.nextInt();
		
		mediaFinal = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2+3+5);
		
		System.out.println("\nA m�dia ponderada das notas �: " + mediaFinal);
		
		scan.close();
	}
}

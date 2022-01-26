package introducaoJava;
/*
 * Construa um programa em c que, tendo como dados de entrada dois pontos 
 * quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles.
 */

import java.util.Scanner;

public class CalculoDistanciaPontos {

	public static void main(String[] args) {
		
		double x1, y1, x2, y2, potenciaPontos, distanciaPontos;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira as coordenadas do ponto P1: ");
		x1 = scan.nextDouble(); y1 = scan.nextDouble();
		
		System.out.print("\nInsira as coordenadas do ponto P2: ");
		x2 = scan.nextDouble(); y2 = scan.nextDouble();
		
		potenciaPontos = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
		distanciaPontos = (int) Math.sqrt(potenciaPontos); // Comando para realizar raiz quadrada; cast para tornar o valor para inteiro
		
		System.out.print("\nDisntancia entre os pontos: " + distanciaPontos);
		
		scan.close();
	}

}

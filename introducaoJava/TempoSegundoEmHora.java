package introducaoJava;
/*
 * Faça um sistema que leia o tempo de duração de um evento em uma fábrica 
 * expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */

import java.util.Scanner;

public class TempoSegundoEmHora {

	public static void main(String[] args) {
		
		int tempoSegundos, horas, minutos, segundos;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira a duração do evento expressa em segundos: ");
		tempoSegundos = scan.nextInt();
		
		horas = (tempoSegundos / 60) / 60;
		minutos = (tempoSegundos / 60) % 60;
		segundos = (tempoSegundos % 60);
		
		System.out.println("\nDuração do evento: " + horas + ":" + minutos + ":" + segundos);
		
		scan.close();
	}

}

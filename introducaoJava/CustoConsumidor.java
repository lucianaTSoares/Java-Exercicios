package introducaoJava;
/*
 * O custo ao consumidor de um carro novo � a soma do custo de f�brica com a 
 * percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). 
 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
 * escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao 
 * consumidor.
 * 
 */

import java.util.Scanner;

public class CustoConsumidor {

	public static void main(String[] args) {
		
		double custoDeFabrica, custoDoConsumidor, percentagemDistribuidor, percentagemImposto;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira o custo de f�brica: R$");
		custoDeFabrica = scan.nextDouble();
		
		percentagemDistribuidor = (custoDeFabrica*28) / 100;
		percentagemImposto = (custoDeFabrica*45) / 100;
		
		custoDoConsumidor = custoDeFabrica + percentagemDistribuidor + percentagemImposto;
		
		System.out.println("\nCusto do consumidor: R$" + custoDoConsumidor);
		
		scan.close();
	}

}

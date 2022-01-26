package introducaoJava;
import java.util.Scanner;

public class CalculoD {

	public static void main(String[] args) {

		double a, b, c, resultadoR, resultadoS;
		int resultadoD;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira o primeiro n�mero: ");
		a = scan.nextDouble();
		
		System.out.print("Insira o segundo n�mero: ");
		b = scan.nextDouble();
		
		System.out.print("Insira o terceiro n�mero: ");
		c = scan.nextDouble();
		
		if (a >= 0 && b >= 0 && c >= 0) {
			
			resultadoR = Math.pow(a + b, 2); // Math.pow realiza a pot�ncia dos n�meros; s� aceita num tipo double
			resultadoS = Math.pow(b + c, 2);
			
			resultadoD = (int) ((resultadoR + resultadoS) / 2); // Cast para tornar o valor de resultadoD para inteiro
			
			System.out.print("\nResultado: " + resultadoD);
			
		} else {
			System.out.println("\nInsira valores positivos para que o calculo seja feito.");
		}
		
		scan.close();
	}

}

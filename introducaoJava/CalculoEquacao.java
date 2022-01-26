package introducaoJava;
import java.util.Scanner;

public class CalculoEquacao {

	public static void main(String[] args) {
		
		int a, b, c, d, e, f, resultadoX, resultadoY, divisor;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira seis números: ");
		a = scan.nextInt(); b = scan.nextInt(); c = scan.nextInt();
		d = scan.nextInt(); e = scan.nextInt(); f = scan.nextInt();
	
		divisor = (a*e - b*c);
		resultadoX = (c*e - b*f) / divisor;
		resultadoY = (a*f - c*d) / divisor;
		
		System.out.println("\nValor de X: " + resultadoX);
		System.out.println("Valor de Y: " + resultadoY);
		
		scan.close();
	}

}

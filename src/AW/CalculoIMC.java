package AW;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoIMC {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" *** Cálculo do IMC: \n");
		
		System.out.println(" --- IMC = PESO /ALTURA * ALTURA \n");
		
		System.out.print(" --- DIGITE SEU PESO: ");
		double peso = scanner.nextDouble();
		
		System.out.print(" --- DIGITE SUA ALTURA: ");
		double altura = scanner.nextDouble();
		
		double imc = peso/(altura * altura);
		double resultadoImc = imc;
		
		DecimalFormat df = new DecimalFormat("###,##0.00");
		
		System.out.print("\n *** RESULTADO: " + df.format(resultadoImc));
		
		scanner.close();
	}

}

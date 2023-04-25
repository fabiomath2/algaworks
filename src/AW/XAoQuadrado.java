package AW;

import java.util.Scanner;

public class XAoQuadrado {
		
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Calcule: O quadrado de um número: \n");
			
			System.out.print("informe um número; ");
			double valor = scanner.nextDouble(); System.out.print("\n");
			
			double resultado = Math.pow(valor, 2);
			System.out.print("Resultado: " + resultado);
			
			scanner.close();
		}
}

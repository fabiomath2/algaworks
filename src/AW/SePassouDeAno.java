package AW;

import java.util.Scanner;

public class SePassouDeAno {
	
	public static void main(String[] args) {
		
		System.out.println("Verifique se você passou de ano: \n");
		System.out.println("(Sua média é composta pelas notas da 1º, 2º, 3º e 4º unidades dividido por 4.)\n");
		
		Scanner scanner =  new Scanner(System.in);	
		
		System.out.print("Insira sua nota da 1º unidade: ");
		double nota1 = scanner.nextDouble(); System.out.print("\n");

		System.out.print("Insira sua nota da 2º unidade: ");
		double nota2 = scanner.nextDouble(); System.out.print("\n");
		
		System.out.print("Insira sua nota da 3º unidade: ");
		double nota3 = scanner.nextDouble(); System.out.print("\n");
		
		System.out.print("Insira sua nota da 4º unidade: ");
		double nota4 = scanner.nextDouble(); System.out.print("\n");
		
		double mediaMIN = 6;
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Sua média: " + media); System.out.print("\n");
		
		if (media >= mediaMIN) {
			System.out.println("Parabéns! você passou de ano.");
		} else {
			System.out.println("Infelizmente você foi reprovado.");
		}
		
		scanner.close();
	}

}

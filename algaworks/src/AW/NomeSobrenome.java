package AW;

import java.util.Scanner;

public class NomeSobrenome {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("e seu sobrenome: ");
		String sobrenome = scanner.nextLine(); System.out.print("\n");
		
		String nomeCompleto = nome + " " + sobrenome;
		System.out.println("Seu nome completo: " + nomeCompleto);
		
		scanner.close();
	}

}

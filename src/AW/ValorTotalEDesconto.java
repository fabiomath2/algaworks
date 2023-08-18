package AW;

import java.util.Scanner;

public class ValorTotalEDesconto {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Double qtdProduto;
		Double valorProduto;
		
		System.out.print("Insira a quantidade do produto desejada: "); qtdProduto = scanner.nextDouble(); System.out.print("\n");
		System.out.print("Insira o valor do produto: "); valorProduto = scanner.nextDouble(); System.out.print("\n");
		
		Double subtotalProduto = (qtdProduto * valorProduto);
		
		System.out.print("Subtotal: " + subtotalProduto + "\n");
		
		if (qtdProduto >= 10) {
			
			Double desconto = ((subtotalProduto*10)/100);
			System.out.print("Desconto (10%): " + desconto + "\n");
			
			Double subtotalComDesconto = (subtotalProduto - desconto);
			
			System.out.print("Subtotal com desconto: " + subtotalComDesconto);
			
			scanner.close();
		}
	}
}

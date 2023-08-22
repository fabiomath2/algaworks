package AW;

import java.util.Scanner;

public class DescontoDeFreteNasCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: R$");
        double valorProduto = scanner.nextDouble();

        double valorFrete = 15.0;
        double valorFinal;

        if (valorProduto >= 100.0) {
            valorFinal = valorProduto;
        } else {
            valorFinal = valorProduto + valorFrete;
        }

        System.out.println("Valor final da compra: R$" + valorFinal);

        scanner.close();
    }
}

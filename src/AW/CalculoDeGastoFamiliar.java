package AW;

import java.util.Scanner;

public class CalculoDeGastoFamiliar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorContaLuz, valorContaAgua, valorContaTelefone, valorEscolaFilho, valorFaturaCartao, gastosSupermercado;

        System.out.print("Digite o valor da conta de luz: ");
        valorContaLuz = scanner.nextDouble();

        System.out.print("Digite o valor da conta de água: ");
        valorContaAgua = scanner.nextDouble();

        System.out.print("Digite o valor da conta de telefone: ");
        valorContaTelefone = scanner.nextDouble();

        System.out.print("Digite o valor da escola do filho: ");
        valorEscolaFilho = scanner.nextDouble();

        System.out.print("Digite o valor da fatura do cartão: ");
        valorFaturaCartao = scanner.nextDouble();

        System.out.print("Digite os gastos com supermercado: ");
        gastosSupermercado = scanner.nextDouble();

        double gastoTotal = 0.0;
        gastoTotal += valorContaLuz;
        gastoTotal += valorContaAgua;
        gastoTotal += valorContaTelefone;
        gastoTotal += valorEscolaFilho;
        gastoTotal += valorFaturaCartao;
        gastoTotal += gastosSupermercado;

        System.out.println("O gasto total da família no mês é: " + gastoTotal);

        scanner.close();
    }
}

package Emprestimo;

import java.util.Scanner;

public class EmprestimoBancario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       System.out.println("Qual o valor do empréstimo? R$ ");
       double valorEmprestimo = sc.nextDouble();

       System.out.println("Informe o prazo de pagamento desejado (em meses): ");
       int prazo = sc.nextInt();

       System.out.println("Informe a renda mensal: ");
       double rendaMensal= sc.nextDouble();

       double taxaJuros;
       if (valorEmprestimo > 0 && prazo > 0 && rendaMensal > 0) {
            if (rendaMensal >= 5000) {
                taxaJuros = 0.1;
            } else {
                if (prazo <= 12) {
                    taxaJuros = 0.15;
                } else {
                    taxaJuros = 0.2;
                }
            }
/*verifica se o valor do empréstimo, o prazo desejado e a renda mensal são maiores que zero.
Se forem, ele verifica a renda mensal do cliente.
Se a renda mensal for maior ou igual a 5000, a taxa de juros aplicada será de 10%.
Caso contrário, o código verifica o prazo desejado.
Se o prazo for menor ou igual a 12 meses, a taxa de juros será de 15%.
Caso contrário, a taxa de juros será de 20%.*/

        double valorParcela = (valorEmprestimo * taxaJuros) / (1 - Math.pow(1 + taxaJuros, -prazo));

        System.out.println("Empréstimo aprovado!");
        System.out.println("Taxa de juros aplicada: " + (taxaJuros * 100) + "%");
        System.out.println("Valor das parcelas: R$ " + valorParcela);
    } else {
        System.out.println("Empréstimo não pode ser aprovado. Verifique as informações fornecidas.");
    }

        sc.close();

    }
}


package GerenciadorFinancasPessoais;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GerenciadorDeFinancas gerenciador = new GerenciadorDeFinancas();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("==== Gerenciador de Finanças Pessoais ====");
            System.out.println("1. Adicionar uma transação");
            System.out.println("2. Exibir resumo das transações");
            System.out.println("3. Calcular saldo atual");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (opcao) {
                    case 1:
                        System.out.print("Digite a descrição da transação: ");
                        String descricao = scanner.nextLine();
                        System.out.print("Digite o valor da transação: ");
                        double valor = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Digite o tipo da transação (receita ou despesa): ");
                        String tipo = scanner.nextLine();
                        Transacao transacao = new Transacao(descricao, valor, tipo);
                        gerenciador.adicionarTransacao(transacao);
                        System.out.println("Transação adicionada com sucesso!");
                        break;
                    case 2:
                        gerenciador.exibirResumoTransacoes();
                        break;
                    case 3:
                        double saldoAtual = gerenciador.calcularSaldoAtual();
                        System.out.println("Saldo atual: " + saldoAtual);
                        break;
                    case 4:
                        System.out.println("Encerrando o programa...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
            }

            System.out.println();
        } while (opcao != 4);

        scanner.close();
    }
}
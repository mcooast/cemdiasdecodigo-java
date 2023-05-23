package Calculadora;
import java.util.Scanner;
public class CalculadoraApp {
    public static void main(String[] args) {

        // calculadora: num, operação, numero, igual, resultado

        Scanner scanner = new Scanner(System.in);

        double num1, num2, resultado;

        char operacao;

        do {
            System.out.println("Digite um número: ");
            num1 = scanner.nextDouble();

            System.out.println("Digite outro número: ");
            num2 = scanner.nextDouble();

            System.out.println("Digite a operação desejada (+, -, / , *): ");
            operacao = scanner.next().charAt(0); // se o usuário digitar "+", o método next() irá ler a string "+"
            // e o método charAt(0) irá obter o primeiro caractere "+" e atribuí-lo à variável operacao.

            switch (operacao) {
                case '+':
                    resultado = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + resultado);
                    break;
                case '-':
                    resultado = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + resultado);
                    break;
                case '/':
                    resultado = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + resultado);
                    break;
                case '*':
                    resultado = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + resultado);
                    break;
                default:
                    System.out.println("Operação inválida");
                    break;
            }

        } while (verificarNovaOperacao());

        scanner.close();
    }

    public static boolean verificarNovaOperacao() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja realizar uma nova operação ? (S ou N): ");
        return !sc.nextLine().toUpperCase().equals("N");
    }

}


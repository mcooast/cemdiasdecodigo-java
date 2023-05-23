package ConversorTemperatura;

import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcao;

        do {
            System.out.print("Informe a temperatura que deseja converter (ex: 25): ");
            double temperatura = sc.nextDouble();
            System.out.print("Deseja converter para Celsius (C) ou Fahrenheit (F)? ");
            String opcaoStr = sc.next().toUpperCase();
            opcao = opcaoStr.charAt(0);
            if (opcao == 'C' || opcao == 'F') {
                // opção válida, continuar com o programa
            } else {
                System.out.println("Opção inválida");
                return; // encerra o programa
            }

            double resultado;
            String unidadeOrigem, unidadeDestino;

            if (opcao == 'C') {
                resultado = converterCelsiusParaFahrenheit(temperatura);
                unidadeOrigem = "Celsius";
                unidadeDestino = "Fahrenheit";
            } else if (opcao == 'F') {
                resultado = converterFahrenheitParaCelsius(temperatura);
                unidadeOrigem = "Fahrenheit";
                unidadeDestino = "Celsius";
            } else {
                System.out.println("Opção inválida");
                continue;
            }

            System.out.printf("%.2f %s equivale a %.2f %s.\n", temperatura, unidadeOrigem, resultado, unidadeDestino);

        } while (verificarNovaOperacao());

        sc.close();
    }

    public static double converterCelsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double converterFahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static boolean verificarNovaOperacao() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Deseja realizar uma nova conversão? (S ou N): ");
        return sc.next().toUpperCase().charAt(0) == 'S';
    }
}

package CalculadoraIMC;

import java.text.Normalizer;
import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double peso = 0;
        double altura = 0;

        System.out.println("Informe o peso em quilogramas: ");
        peso = sc.nextDouble();

        System.out.println("Informe a altura em metros: ");
        altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        if (imc <18.5){
            System.out.println("Você está com baixo peso.");
        } else if (imc >= 18.5 && imc <=24.9){
            System.out.println("Você está com peso normal.");
        } else if (imc >= 25 && imc <= 29.9){
            System.out.println("Você está com sobrepeso.");
        }else if (imc >= 30 && imc <= 34.9){
            System.out.println("Você está com obesidade.");
        }else if (imc >= 35 && imc <= 39.9){
            System.out.println("Você está com obesidade severa (grau II).");
        }else if (imc > 40){
            System.out.println("Você está com obesidade mórbida (grau III)");
        }
        sc.close();
    }
}




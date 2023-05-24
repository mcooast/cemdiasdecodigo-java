package JogoDeAdvinhacao;
import java.util.Scanner;

public class JogoDeAdvinhacao {

    public static void main(String[] args) {
        jogar();
    }

    public static void jogar() {
        Scanner sc = new Scanner(System.in);
        boolean jogarNovamente = true;

        while (jogarNovamente){
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        int tentativas = 0;
        int numDigitado = 0;
        boolean acertou = false;

        while (tentativas <= 10 && numDigitado != numeroAleatorio) {
            System.out.println("Jogo de advinhação! Digite um número: ");
            numDigitado = sc.nextInt();
            tentativas++;

            if (numDigitado == numeroAleatorio) {
                System.out.printf("Parabéns! Você acertou em %d tentativas\n", tentativas);
            } else {
                System.out.println("Não foi dessa vez!");
                System.out.println(numDigitado > numeroAleatorio ? "Dica: Tente um número menor." : "Dica: Tente um número maior.");
            }
        }

        if (!acertou) {
            System.out.println("Você atingiu 10 tentativas. Jogue novamente!");
        }

        System.out.println("Deseja jogar novamente? (S/N)");
        String resposta = sc.next();

        if (resposta.equalsIgnoreCase("N")){
        jogarNovamente = false;
        }
        }

        sc.close();
    }
}
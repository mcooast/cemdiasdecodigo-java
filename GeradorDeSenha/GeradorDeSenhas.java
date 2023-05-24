import java.security.SecureRandom;
import java.util.Scanner;

public class GeradorDeSenhas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vamos gerar uma senha segura para você, preciso de algumas informações antes.\n");

        System.out.print("Qual o comprimento mínimo da senha? ");
        int comprimentoMinimo = scanner.nextInt();

        System.out.print("Usar letras maiúsculas? (S/N): ");
        boolean usarLetrasMaiusculas = scanner.next().equalsIgnoreCase("S");

        System.out.print("Usar letras minúsculas? (S/N): ");
        boolean usarLetrasMinusculas = scanner.next().equalsIgnoreCase("S");

        System.out.print("Usar números? (S/N): ");
        boolean usarNumeros = scanner.next().equalsIgnoreCase("S");

        System.out.print("Usar caracteres especiais? (S/N): ");
        boolean usarCaracteresEspeciais = scanner.next().equalsIgnoreCase("S");

        String senhaGerada = gerarSenhaSegura(comprimentoMinimo, usarLetrasMaiusculas, usarLetrasMinusculas, usarNumeros, usarCaracteresEspeciais);
        System.out.println("Sua senha gerada foi: " + senhaGerada);
    }

    private static String gerarSenhaSegura(int comprimentoMinimo, boolean usarLetrasMaiusculas, boolean usarLetrasMinusculas, boolean usarNumeros, boolean usarCaracteresEspeciais) {
        StringBuilder caracteresPermitidos = new StringBuilder();
        SecureRandom random = new SecureRandom(); //A classe SecureRandom é usada para gerar números aleatórios seguros.

        String letrasMaiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String letrasMinusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String caracteresEspeciais = "!@#$%^&*()_-+=<>?";

        if (usarLetrasMaiusculas) {
            caracteresPermitidos.append(letrasMaiusculas);
        }
        if (usarLetrasMinusculas) {
            caracteresPermitidos.append(letrasMinusculas);
        }
        if (usarNumeros) {
            caracteresPermitidos.append(numeros);
        }
        if (usarCaracteresEspeciais) {
            caracteresPermitidos.append(caracteresEspeciais);
        }

        StringBuilder senha = new StringBuilder(comprimentoMinimo);
        for (int i = 0; i < comprimentoMinimo; i++) {
            int indice = random.nextInt(caracteresPermitidos.length());
            senha.append(caracteresPermitidos.charAt(indice));
        }

        return senha.toString();
    }
}

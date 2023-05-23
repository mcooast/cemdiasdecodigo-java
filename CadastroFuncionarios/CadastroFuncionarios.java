package CadastroFuncionarios;
import java.util.Scanner;
public class CadastroFuncionarios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de funcionários a cadastrar: ");
        int numeroFuncionarios = sc.nextInt();

        // Arrays para armazenar dados dos funcionários
        String[] nomes = new String[numeroFuncionarios];
        int[] idades = new int[numeroFuncionarios];
        double[] salarios = new double[numeroFuncionarios];

        // Cadastro de funcionários
        for (int i = 0; i < numeroFuncionarios; i++) {
            System.out.println("--- Cadastro do Funcionário " + (i + 1) + "---");
            System.out.println("Digite o nome do funcionário: ");
            nomes[i] = sc.next();

            System.out.println("Digite a idade do funcionário: ");
            idades[i] = sc.nextInt();

            System.out.println("Digite o salário do funcionário: ");
            salarios[i] = sc.nextDouble();
        }

        // Exibir funcionários cadastrados
        System.out.println("---- Funcionários Cadastrados ----");
        for (int i = 0; i < numeroFuncionarios; i++) {
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Idade: " + idades[i]);
            System.out.println("Salário: " + salarios[i]);
            System.out.println("-----------------------------");
        }

        // Calcula a média de salários
        double somaSalarios = 0;
        for (double salario : salarios) {
            somaSalarios += salario;
        }
        double mediaSalarios = somaSalarios / numeroFuncionarios;

        // Exibe a média de salários
        System.out.println("Média de Salários: " + mediaSalarios);

        // Verifica se algum funcionário possui salário acima da média
        System.out.println("---- Funcionários com Salário Acima da Média ----");
        for (int i = 0; i < numeroFuncionarios; i++) {
            if (salarios[i] > mediaSalarios) {
                System.out.println("Nome: " + nomes[i]);
                System.out.println("Salário: " + salarios[i]);
                System.out.println("-----------------------------");
            }
        }
    }
}

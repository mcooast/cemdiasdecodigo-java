import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDeTarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tarefas = new ArrayList<>();

        int opcao = 0;
        while (opcao != 4) {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a descrição da tarefa:");
                    scanner.nextLine(); // Limpar o buffer
                    String descricao = scanner.nextLine();
                    adicionarTarefa(tarefas, descricao);
                    break;
                case 2:
                    exibirTarefas(tarefas);
                    break;
                case 3:
                    System.out.println("Digite o índice da tarefa concluída:");
                    int indice = scanner.nextInt();
                    marcarTarefaConcluida(tarefas, indice);
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }

    public static void exibirMenu() {
        System.out.println("===== MENU =====");
        System.out.println("1. Adicionar tarefa");
        System.out.println("2. Exibir tarefas");
        System.out.println("3. Marcar tarefa como concluída");
        System.out.println("4. Sair");
        System.out.println("Escolha uma opção: ");
    }

    public static void adicionarTarefa(List<String> tarefas, String descricao) {
        tarefas.add(descricao);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public static void exibirTarefas(List<String> tarefas) {
        System.out.println("===== TAREFAS =====");
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println(i + ". " + tarefas.get(i));
            }
        }
    }

    public static void marcarTarefaConcluida(List<String> tarefas, int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);
            System.out.println("Tarefa marcada como concluída.");
        } else {
            System.out.println("Índice inválido! Tente novamente.");
        }
    }
}

package LojaDeJogos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LojaDeJogos lojaDeJogos = new LojaDeJogos();

        boolean sair = false;

        while (!sair) {
            System.out.println("====== Loja de Jogos ======");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Adicionar Jogo ao Catálogo");
            System.out.println("3. Comprar Jogo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    lojaDeJogos.cadastrarUsuario();
                    break;
                case 2:
                    lojaDeJogos.adicionarJogo();
                    break;
                case 3:
                    scanner.nextLine(); // Limpa o buffer do scanner
                    System.out.print("Digite o nome do usuário: ");
                    String nomeUsuario = scanner.nextLine();

                    // Busca o usuário pelo nome
                    Usuarios usuarioEncontrado = null;
                    for (Usuarios usuario : lojaDeJogos.getUsuarios()) {
                        if (usuario.getNome().equalsIgnoreCase(nomeUsuario)) {
                            usuarioEncontrado = usuario;
                            break;
                        }
                    }

                    if (usuarioEncontrado != null) {
                        lojaDeJogos.comprarJogo(usuarioEncontrado);
                    } else {
                        System.out.println("Usuário não encontrado.");
                    }
                    break;
                case 0:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}

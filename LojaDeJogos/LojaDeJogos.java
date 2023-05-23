package LojaDeJogos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class LojaDeJogos {
    private List<Usuarios> usuarios;
    private List<Jogos> jogos;

    // Construtor da classe LojaDeJogos
    public LojaDeJogos() {
        usuarios = new ArrayList<>();
        jogos = new ArrayList<>();
    }

    //Método ára obter lista de usuários
    public List<Usuarios> getUsuarios(){
        return usuarios;
    }

    // Método para cadastrar um usuário na loja
    public void cadastrarUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Cadastro de Usuário---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        Usuarios usuario = new Usuarios(nome, endereco, idade);
        usuarios.add(usuario);

        System.out.println("Usuário cadastrado com sucesso!");
    }

    // Método para adicionar um jogo ao catálogo
    public void adicionarJogo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Cadastro de Jogo---");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();

        System.out.print("Classificação Indicativa: ");
        int classificacaoIndicativa = scanner.nextInt();

        Jogos jogo = new Jogos(titulo, descricao, preco, classificacaoIndicativa);
        jogos.add(jogo);

        System.out.println("Jogo cadastrado com sucesso!");
    }

    // Método para realizar a compra de um jogo
    public void comprarJogo(Usuarios usuario) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Catálogo de Jogos---");
        for (int i = 0; i < jogos.size(); i++) {
            Jogos jogo = jogos.get(i);
            System.out.println(i + ": " + jogo.getTitulo() + " - R$" + jogo.getPreco());
        }

        System.out.print("Digite o número do jogo que deseja comprar: ");
        int escolha = scanner.nextInt();

        if (escolha >= 0 && escolha < jogos.size()) {
            Jogos jogoEscolhido = jogos.get(escolha);

            // Verifica se o usuário possui idade suficiente para jogar
            if (usuario.getIdade() >= jogoEscolhido.getClassificacaoIndicativa()) {
                System.out.println("Compra realizada com sucesso!");
            } else {
                System.out.println("Você não possui idade suficiente para comprar este jogo.");
            }
        } else {
            System.out.println("Opção inválida.");
        }
    }
}
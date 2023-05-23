package SistemaCadastroProdutos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>(); // criação de lista vazia, será utilizada para armazenar os produtos cadastrados pelo usuário.
        int opcao = 0; // variável vai armazenar a opção escolhida pelo usuário no menu.
        while (opcao != 3) {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Listar produtos");
            System.out.println("3. Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do produto:");
                    String nome = scanner.next();
                    System.out.println("Digite o preço do produto:");
                    double preco = scanner.nextDouble();
                    System.out.println("Digite a quantidade em estoque do produto:");
                    int quantidadeEmEstoque = scanner.nextInt();
                    System.out.println("Digite a data de validade do produto:");
                    String dataDeValidade = scanner.next();
                    Produto produto = new Produto(nome, preco, quantidadeEmEstoque, dataDeValidade);
                    produtos.add(produto);
                    System.out.println("Produto cadastrado com sucesso!");
                    produto.calcularValorTotal();
                    produto.verificarValidade();
                    break;
                case 2: // o sistema exibe a mensagem "Produtos cadastrados:" e segue para o próximo passo do laço
                    System.out.println("Produtos cadastrados:");
                    for (Produto p : produtos) {
                        System.out.println(p.getNome() + " - R$" + p.getPreco() + " - " + p.getQuantidadeEmEstoque() + " unidades em estoque");
                    }
                    break;

            }
        }
    }
}
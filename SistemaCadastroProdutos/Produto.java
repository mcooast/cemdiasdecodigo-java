package SistemaCadastroProdutos;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEmEstoque;
    private String dataDeValidade;

    /*Com o construtor, é possível criar um objeto da classe Produto e inicializar todos os seus atributos de uma só vez,
     * passando os valores como argumentos do construtor. Além disso, o construtor permite garantir que os atributos obrigatórios sejam definidos ao criar um novo objeto da classe.
     * Em resumo, o construtor torna mais conveniente e seguro criar objetos da classe Produto,
     * pois garante que todos os atributos necessários sejam definidos e que os objetos sejam criados com um estado inicial consistente.*/

    // Construtor
    public Produto(String nome, double preco, int quantidadeEmEstoque, String dataDeValidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.dataDeValidade = dataDeValidade;
    }

    // Métodos de acesso - boas práticas encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidade) {
        this.quantidadeEmEstoque = quantidade;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public void calcularValorTotal() {
        double valorTotal = preco * quantidadeEmEstoque;
        System.out.println("Valor total desse produto no estoque: R$ " + valorTotal);
    }

    public void verificarValidade() {
        System.out.println("Produto está vencido? " + (dataDeValidade.equals("01/01/2023") ? "Sim" : "Não"));
    }

    public String toString() {
        return "Nome: " + nome + ", Preço: " + preco + ", Quantidade em estoque: " + quantidadeEmEstoque + ", Data de validade: " + dataDeValidade;
    }
}

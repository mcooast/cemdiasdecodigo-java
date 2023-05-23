package ListaDeCompras;
class Item {
    private String nome;
    private int quantidade;
    private double preco;
    private boolean comprado;

    public Item(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.comprado = false;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isComprado() {
        return comprado;
    }

    public void marcarComoComprado() {
        this.comprado = true;
    }
}


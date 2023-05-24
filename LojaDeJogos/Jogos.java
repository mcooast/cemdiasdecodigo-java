package LojaDeJogos;

public class Jogos {

    private String titulo;
    private String descricao;
    private double preco;
    private int classificacaoIndicativa;


    public Jogos(String titulo, String descricao, double preco, int classificacaoIndicativa) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.preco = preco;
        this.classificacaoIndicativa = classificacaoIndicativa;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public void setClassificacaoIndicativa(int classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }
}

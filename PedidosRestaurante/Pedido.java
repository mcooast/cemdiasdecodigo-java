package PedidosRestaurante;

public class Pedido {

    private int numeroPedido;
    private String descricao;
    private double valor;

    public Pedido(int numeroPedido, String descricao, double valor) {
        this.numeroPedido = numeroPedido;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }
}
    class ListaVaziaException extends Exception {
        public ListaVaziaException(String mensagem) {
            super(mensagem);
        }
}

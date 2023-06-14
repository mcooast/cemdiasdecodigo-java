package PedidosRestaurante;

public class Main {

    public static void main(String[] args) {

        Restaurante restaurante = new Restaurante();

        Pedido pedido1 = new Pedido(1, "Pizza", 35.0);
        Pedido pedido2 = new Pedido(2, "Hambúrguer", 15.0);
        Pedido pedido3 = new Pedido(3, "Refrigerante", 5.0);

        restaurante.adicionarPedido(pedido1);
        restaurante.adicionarPedido(pedido2);
        restaurante.adicionarPedido(pedido3);

        restaurante.imprimirPedidos();

        try{
            double total = restaurante.calcularTotal();
            System.out.println("Total da compra: " + total);
        } catch (ListaVaziaException e){ // para cair nessa condição a lista de pedidos deve estar vazia, comentar o código que adiciona os pedidos
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

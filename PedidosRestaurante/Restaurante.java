package PedidosRestaurante;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {

    private List<Pedido> listaPedidos;

    public Restaurante(){
        listaPedidos = new ArrayList<>();
    }
    public void adicionarPedido(Pedido pedido){
    listaPedidos.add(pedido);
    }

    public double calcularTotal() throws ListaVaziaException {
        if (listaPedidos.isEmpty()) {
            throw new ListaVaziaException("A lista de pedidos está vazia.");
        }

        double total = 0;
        for (Pedido pedido : listaPedidos) {
            total += pedido.getValor();
        }

        return total;
    }

    public void imprimirPedidos() {
        for (Pedido pedido : listaPedidos) {
            System.out.println("Número do pedido: " + pedido.getNumeroPedido());
            System.out.println("Descrição: " + pedido.getDescricao());
            System.out.println("Valor: " + pedido.getValor());
            System.out.println("--------------------");
        }
    }
}

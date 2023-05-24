package ListaDeCompras;

import java.util.ArrayList;
import java.util.List;

class ListaDeCompras {
    private List<Item> itens;

    public ListaDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void marcarItemComoComprado(Item item) {
        item.marcarComoComprado();
    }

    public void gerarResumo() {
        System.out.println("Itens comprados:");
        for (Item item : itens) {
            if (item.isComprado()) {
                System.out.println("- " + item.getNome() + " (Quantidade: " + item.getQuantidade() + ")");
            }
        }
        System.out.println("Itens pendentes:");
        for (Item item : itens) {
            if (!item.isComprado()) {
                System.out.println("- " + item.getNome() + " (Quantidade: " + item.getQuantidade() + ")");
            }
        }
    }
}



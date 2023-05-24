package ListaDeCompras;

public class App {
        public static void main(String[] args) {
            ListaDeCompras lista = new ListaDeCompras();

            // Adicionando itens à lista
            Item item1 = new Item("Maçã", 5, 2.50);
            Item item2 = new Item("Leite", 2, 3.00);
            Item item3 = new Item("Pão", 1, 2.00);
            Item item4 = new Item("Queijo", 1, 5.60);
            Item item5 = new Item("Café", 1, 6.00);

            lista.adicionarItem(item1);
            lista.adicionarItem(item2);
            lista.adicionarItem(item3);
            lista.adicionarItem(item4);
            lista.adicionarItem(item5);

            // Marcando um item como comprado
            lista.marcarItemComoComprado(item2);
            lista.marcarItemComoComprado(item5);

            // Gerando resumo da lista de compras
            lista.gerarResumo();
        }
    }

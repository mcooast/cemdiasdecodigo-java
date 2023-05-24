package GerenciamentoLivros;
import java.util.ArrayList;
public class Biblioteca {
    private ArrayList<Livro> listaLivros = new ArrayList<>();

    public void cadastrarLivro(Livro livro) {
        listaLivros.add(livro);
    }

    public ArrayList<Livro> listarLivros() {
        return listaLivros;
    }

    public void atualizarLivro(Livro livro) {
        for (int i = 0; i < listaLivros.size(); i++) {
            if (listaLivros.get(i).getTitulo().equals(livro.getTitulo())) {
                listaLivros.set(i, livro);
                break;
            }
        }
    }
    public void excluirLivro(String titulo) {
        for (int i = 0; i < listaLivros.size(); i++) {
            if (listaLivros.get(i).getTitulo().equals(titulo)) {
                listaLivros.remove(i);
                break;
            }

            /*O uso do comando break nestes métodos é importante para melhorar a eficiência do programa,
             * evitando que ele continue executando o laço de busca/remoção depois que já encontrou/excluiu o livro desejado.
             * Além disso, como os métodos têm como objetivo encontrar ou excluir apenas um livro por vez,
             * o uso do break é a forma mais adequada de implementá-los.*/
        }
    }
}

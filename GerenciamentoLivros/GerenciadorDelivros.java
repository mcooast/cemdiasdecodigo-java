package GerenciamentoLivros;
import java.util.ArrayList;
public class GerenciadorDelivros {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        //Cadastrar Livros

        Livro livro1 = new Livro();
        livro1.setTitulo("O Pequeno Príncipe");
        livro1.setAutor("Antoine de Saint-Exupéry");
        livro1.setEditora("Gallimard");
        livro1.setAnoPublicacao(1943);
        livro1.setNumPaginas(93);

        Livro livro2 = new Livro();
        livro2.setTitulo("1984");
        livro2.setAutor("George Orwell");
        livro2.setEditora("Secker and Warburg");
        livro2.setAnoPublicacao(1949);
        livro2.setNumPaginas(328);

        biblioteca.cadastrarLivro(livro1);
        biblioteca.cadastrarLivro(livro2);

        // Listar livros
        ArrayList<Livro> listaLivros = biblioteca.listarLivros();
        for (Livro livro : listaLivros) {
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Editora: " + livro.getEditora());
            System.out.println("Ano de Publicação: " + livro.getAnoPublicacao());
            System.out.println("Número de Páginas: " + livro.getNumPaginas());
            System.out.println();
        }

        // Atualizar livro
        Livro livro3 = new Livro();
        livro3.setTitulo("O Pequeno Príncipe");
        livro3.setAutor("Antoine de Saint-Exupéry");
        livro3.setEditora("Gallimard");
        livro3.setAnoPublicacao(1943);
        livro3.setNumPaginas(120);

        biblioteca.atualizarLivro(livro3);

        // Excluir livro
        biblioteca.excluirLivro("1984");

        // Listar livros novamente
        ArrayList<Livro> listaLivrosAtualizada = biblioteca.listarLivros();
        for (Livro livro : listaLivrosAtualizada) {
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Editora: " + livro.getEditora());
            System.out.println("Ano de Publicação: " + livro.getAnoPublicacao());
            System.out.println("Número de Páginas: " + livro.getNumPaginas());
            System.out.println();
        }
    }
}



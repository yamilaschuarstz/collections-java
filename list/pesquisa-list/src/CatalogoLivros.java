import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }


    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livros = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            for (Livro livro : listaLivros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livros.add(livro);
                }
            }
        }

        return livros;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livros = new ArrayList<>();
        if (!listaLivros.isEmpty()){
            for (Livro livro : listaLivros){
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    livros.add(livro);
                }
            }
        }

        return livros;
    }

    public Livro pesquisaPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!listaLivros.isEmpty()){
            for (Livro livro : listaLivros){
                if (livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros livros = new CatalogoLivros();
        livros.adicionarLivro("Livro 1", "Autor 1", 2020);
        livros.adicionarLivro("Livro 2", "Autor 2", 2021);
        livros.adicionarLivro("Livro 2", "Autor 2", 2022);
        livros.adicionarLivro("Livro 3", "Autor 3", 2023);
        livros.adicionarLivro("Livro 4", "Autor 4", 1995);

        System.out.println(livros.pesquisarPorAutor("Autor 2"));
        System.out.println(livros.pesquisarPorAutor("Autor 4"));

        System.out.println(livros.pesquisaPorIntervaloAnos(2020, 2022));

        System.out.println(livros.pesquisaPorTitulo("Livro 2"));

        System.out.println(livros.pesquisaPorTitulo("Livro 3"));

    }

}
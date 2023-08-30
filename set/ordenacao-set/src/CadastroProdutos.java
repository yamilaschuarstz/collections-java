import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos produtos = new CadastroProdutos();

        produtos.adicionarProduto(12312, "Nescau", 5.99, 5);
        produtos.adicionarProduto(324234, "Caneta", 1.99, 10);
        produtos.adicionarProduto(4534534, "Massa", 6.50, 9);

        System.out.println(produtos.produtoSet);

        System.out.println(produtos.exibirProdutosPorNome());

        System.out.println(produtos.exibirProdutosPorPreco());
    }
}

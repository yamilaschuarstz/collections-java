import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> produtos;

    public EstoqueProdutos() {
        this.produtos = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtos.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(produtos);
    }

    public double calculaValorTotalEstoque(){
        double valorTotal = 0;
        if (!produtos.isEmpty()){
            for (Produto p : produtos.values()){
                valorTotal += p.getPreco() * p.getQuantidade();
            }
        }

        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!produtos.isEmpty()){
            for (Produto p : produtos.values()){
                if (p.getPreco() > maiorPreco){
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }

        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!produtos.isEmpty()){
            for (Produto p : produtos.values()){
                if (p.getPreco() < menorPreco){
                    menorPreco = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        }

        return produtoMaisBarato;
    }
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.exibirProdutos();

        estoque.adicionarProduto(324234, "Produto A", 5.90, 10);
        estoque.adicionarProduto(5465, "Produto B", 4.99, 5);
        estoque.adicionarProduto(4542534, "Produto C", 100, 2);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoque.calculaValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());
    }
}

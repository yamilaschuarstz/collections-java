import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    CarrinhoDeCompras(){
        itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();
        for (Item item : itens){
            if (item.getNome().equalsIgnoreCase(nome)){
                itemsParaRemover.add(item);
            }
        }

        itens.removeAll(itemsParaRemover);
    }

    public double calculaValorTotal(){
        double valorTotalCompra = 0;
        for (Item item : itens){
            double valorTotalItem = 0;
            valorTotalItem = item.getPreco() * item.getQuantidade();
            valorTotalCompra += valorTotalItem;
        }

        return valorTotalCompra;
    }

    public void exibirItens(){
        System.out.println(itens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Nescau", 5.50, 3);
        carrinho.adicionarItem("Leite", 3.90, 2);
        carrinho.exibirItens();
        System.out.println("Valor total do carrinho: R$" + carrinho.calculaValorTotal());
        carrinho.removerItem("nescau");
        carrinho.exibirItens();

    }
}

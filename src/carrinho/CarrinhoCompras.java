package carrinho;

import pagamentoStrategy.PagamentoStrategy;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private PagamentoStrategy pagamentoStrategy;
    private List<Item> produtos = new ArrayList<>();
    public CarrinhoCompras(PagamentoStrategy pagamentoStrategy) {
        this.pagamentoStrategy = pagamentoStrategy;
    }

    public void adicionaItem( Item item ){
        produtos.add(item);
    }
    public void removeItem(String nome) {
        boolean removido = produtos.removeIf(item -> item.getNome().equalsIgnoreCase(nome));

        if (!removido) {
            System.out.println("Não há produto com o nome '" + nome + "' para ser excluído.");
        } else {
            System.out.println("Produto '" + nome + "' removido com sucesso.");
        }
    }

    public void setPagamentoStrategy(PagamentoStrategy pagamentoStrategy) {
        this.pagamentoStrategy = pagamentoStrategy;
    }

    public double calculaTotal(){
        return produtos.stream().mapToDouble(Item::getValor).sum();
    }

    public void realizaPagamento(){
        pagamentoStrategy.pagamento();
    }

    public void printItens(){
        if (produtos.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            produtos.forEach(System.out::println);
        }
    }

}
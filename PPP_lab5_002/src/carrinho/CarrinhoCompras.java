package carrinho;

import pagamentoStrategy.PagamentoStrategy;
import freteStrategy.FreteStrategy;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private PagamentoStrategy pagamentoStrategy;
    private FreteStrategy freteStrategy;
    private List<Item> produtos;

    public CarrinhoCompras(PagamentoStrategy pagamentoStrategy, FreteStrategy freteStrategy, List<Item> produtos) {
        this.pagamentoStrategy = pagamentoStrategy;
        this.freteStrategy = freteStrategy;
        this.produtos = produtos;
    }

    public void adicionaItem(Item item ){
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

    public double calculaTotal(){
        return produtos.stream().mapToDouble(Item::getValor).sum();
    }

    public double calculaFrete( double distanciaKM ){ return freteStrategy.calcularfrete(distanciaKM);}

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

    public void setFreteStrategy(FreteStrategy freteStrategy) {
        this.freteStrategy = freteStrategy;
    }

    public void setPagamentoStrategy(PagamentoStrategy pagamentoStrategy) {
        this.pagamentoStrategy = pagamentoStrategy;
    }


}
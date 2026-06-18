import carrinho.*;
import pagamentoStrategy.*;

public class Main {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras(new PixPagamento());

        Item produto1 = new Item("Notebook", 3500.00);
        Item produto2 = new Item("Celular", 1200.00);
        Item produto3 = new Item("Teclado", 150.00);
        Item produto4 = new Item("Mouse", 80.00);

        carrinho.adicionaItem(produto1);
        carrinho.adicionaItem(produto2);
        carrinho.adicionaItem(produto3);
        carrinho.adicionaItem(produto4);

        System.out.println("\n--- Itens no Carrinho ---");
        carrinho.printItens();
        System.out.printf("[Valor Total]: R$ %.2f%n", carrinho.calculaTotal());

        carrinho.realizaPagamento();

        System.out.println("\n[Usuário alterou a opção para Cartão] : ");
        carrinho.setPagamentoStrategy(new CartaoPagamento()); // Troca de estratégia em tempo de execução
        carrinho.realizaPagamento();

    }
}


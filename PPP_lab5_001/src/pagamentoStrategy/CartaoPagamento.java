package pagamentoStrategy;

public class CartaoPagamento implements PagamentoStrategy {
    @Override
    public void pagamento() {
        System.out.println("[pagamento via Cartão] : Pedido feito com sucesso!!!");
    }
}


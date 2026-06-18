package pagamentoStrategy;

public class PixPagamento implements PagamentoStrategy {
    @Override
    public void pagamento() {
        System.out.println("[pagamento via pix] : Pedido feito com sucesso!!!");
    }
}

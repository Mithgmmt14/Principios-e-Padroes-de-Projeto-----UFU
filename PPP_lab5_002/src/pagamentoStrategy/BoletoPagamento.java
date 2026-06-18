package pagamentoStrategy;

public class BoletoPagamento implements PagamentoStrategy {
    @Override
    public void pagamento() {
        System.out.println("[pagamento via Boleto] : Pedido feito com sucesso!!!");
    }
}

package Template;

public class Loja extends ProcessadorPedidos {

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento: processado no caixa físico.");
    }

    @Override
    public void tipoEntrega() {
        System.out.println("Entrega: retirada direto na loja.");
    }
}

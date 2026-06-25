package Template;

public class Online extends ProcessadorPedidos {

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento: pagamento via cartão de crédito.");
    }

    @Override
    public void tipoEntrega() {
        System.out.println("Entrega: pacote sendo preparado para o envio via correios.");
    }
}

package Template;

public class Criptomoedas extends ProcessadorPedidos {

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento: pagamento via criptomoedas.");
    }

    @Override
    public void tipoEntrega() {
        System.out.println("Entrega: pacote sendo preparado para o envio via correios.");
    }
}

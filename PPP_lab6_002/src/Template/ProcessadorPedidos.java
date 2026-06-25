package Template;

public abstract class ProcessadorPedidos {
    public abstract void processarPagamento();
    public abstract void tipoEntrega();

    public final void fazerPedido(int quantidadeItens, double valor){
        double valorTotal = quantidadeItens * valor;
        System.out.println("Total em R$ a ser pago: " + valorTotal);

        this.processarPagamento();
        this.tipoEntrega();

        System.out.println("Pedido realizado com sucesso.");
    }

}

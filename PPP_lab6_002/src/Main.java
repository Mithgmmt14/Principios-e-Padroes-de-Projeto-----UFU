import Template.*;
/*
 * * - Template Method: Trabalha com base na herança. Ele
 * define o esqueleto de um algoritmo em uma classe base e delega a implementação
 * de passos específicos para suas subclasses.
 * * - Decorator: Trabalha com base na composição. Ele
 * permite anexar novas responsabilidades ou comportamentos a um objeto em tempo
 * de execução.
 */

public class Main {
    static void main(String[] args) {
        System.out.println("======= PEDIDO ONLINE =======");
        ProcessadorPedidos pedidoOnline = new Online();
        pedidoOnline.fazerPedido(3, 50.00);

        System.out.println("\n======= PEDIDO NA LOJA =======");
        ProcessadorPedidos pedidoLoja = new Loja();
        pedidoLoja.fazerPedido(1, 120.00);

        System.out.println("\n======= PEDIDO CRIPTOMOEDAS =======");
        ProcessadorPedidos pedidoCripto = new Criptomoedas();
        pedidoCripto.fazerPedido(5, 300.00);
    }
}

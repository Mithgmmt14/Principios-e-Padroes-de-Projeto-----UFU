package observers;

import subject.Acao;

public class AcaoBroker {
    public void vender(Acao acao, Investidor investidor) {
        System.out.println("[BROKER] : VENDENDO ações de " +
                acao.getSimbolo() + " a pedido do investidor " + investidor.getNome());
    }

    public void comprar(Acao acao, Investidor investidor) {
        System.out.println("[BROKER] Comando recebido: COMPRANDO ações de " +
                acao.getSimbolo() + " a pedido do investidor " + investidor.getNome());
    }
}

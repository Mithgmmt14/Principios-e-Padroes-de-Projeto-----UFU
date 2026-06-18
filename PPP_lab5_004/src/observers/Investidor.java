package observers;

import subject.Acao;

public class Investidor implements Observer {

    private String nome;
    private double limiteMin;
    private double limiteMax;
    private AcaoBroker broker;

    public Investidor(String nome, double limiteMin, double limiteMax, AcaoBroker broker) {
        this.nome = nome;
        this.limiteMin = limiteMin;
        this.limiteMax = limiteMax;
        this.broker = broker;
    }

    public String getNome() { return nome; }

    @Override
    public void atualizar(Acao acao) {
        double precoAtual = acao.getPreco();

        if (precoAtual >= limiteMax) {
            System.out.println(nome + ": Preço máximo atingido (R$ " + limiteMax + ") para " + acao.getSimbolo() + ".");
            broker.vender(acao, this);
        } else if (precoAtual <= limiteMin) {
            System.out.println(nome + ": Preço mínimo atingido (R$ " + limiteMin + ") para " + acao.getSimbolo() + ".");
            broker.comprar(acao, this);
        } else {
            System.out.println(nome + ": Preço de " + acao.getSimbolo() + " (R$ " + precoAtual + ") está dentro da margem segura.");
        }
    }
}

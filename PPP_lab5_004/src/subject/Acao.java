package subject;

import observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Acao implements Subject {
    private String simbolo;
    private double preco;
    private List<Observer> investidores;

    public Acao(String simbolo, double precoInicial) {
        this.simbolo = simbolo;
        this.preco = precoInicial;
        this.investidores = new ArrayList<>();
    }

    public String getSimbolo() { return simbolo; }
    public double getPreco() { return preco; }

    public void setPreco(double novoPreco) {
        System.out.println("\n-> Variação de Mercado: " + simbolo + " agora custa R$ " + novoPreco);
        this.preco = novoPreco;
        notifyObservers();
    }

    @Override
    public void addObservers(Observer investidor) {
        investidores.add(investidor);
    }

    @Override
    public void notifyObservers() {
        for (Observer investidor : investidores) {
            investidor.atualizar(this);
        }
    }
}

package veiculo;

import visitor.Visitor;

public class Bicicleta extends Veiculo {
    private String cor;

    public Bicicleta(String cor) {
        this.cor = cor;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getCor() {
        return cor;
    }
}

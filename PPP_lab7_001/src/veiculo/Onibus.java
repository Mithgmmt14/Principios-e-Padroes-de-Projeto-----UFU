package veiculo;

import visitor.Visitor;

public class Onibus extends Veiculo{
    private int quantidade_lugares;
    private String ano_fabricacao;

    public Onibus(int quantidade_lugares, String ano_fabricacao) {
        this.quantidade_lugares = quantidade_lugares;
        this.ano_fabricacao = ano_fabricacao;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public int getQuantidade_lugares() {
        return quantidade_lugares;
    }

    public String getAno_fabricacao() {
        return ano_fabricacao;
    }
}

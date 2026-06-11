package Decorator;

public class PizzaDecorator implements Pizza {
    private Pizza wrappeee;
    public PizzaDecorator (Pizza pizza){
        this.wrappeee = pizza;
    }

    @Override
    public String getDescricao() {
        return wrappeee.getDescricao();
    }

    @Override
    public double getPreco() {
        return wrappeee.getPreco();
    }
}

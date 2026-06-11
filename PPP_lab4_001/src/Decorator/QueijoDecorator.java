package Decorator;

public class QueijoDecorator extends PizzaDecorator {
    public QueijoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 3;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + "Queijo, ";
    }
}

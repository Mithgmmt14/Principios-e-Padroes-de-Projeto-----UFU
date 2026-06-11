package Decorator;
public class TomateDecorator extends PizzaDecorator {
    public TomateDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + "Tomate, ";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 2;
    }
}

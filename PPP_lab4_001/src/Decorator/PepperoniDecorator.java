package Decorator;

public class PepperoniDecorator extends PizzaDecorator {
    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 8.0;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + "Pepperoni, ";
    }
}

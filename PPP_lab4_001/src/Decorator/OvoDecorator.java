package Decorator;

public class OvoDecorator extends PizzaDecorator {
    public OvoDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPreco() {
        return super.getPreco()+ 5;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + "Ovo, ";
    }
}

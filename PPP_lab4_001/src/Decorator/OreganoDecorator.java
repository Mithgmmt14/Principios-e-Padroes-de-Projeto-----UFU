package Decorator;

public class OreganoDecorator extends PizzaDecorator{
    public OreganoDecorator(Pizza pizza) {
        super(pizza);
    }
    @Override
    public double getPreco() {
        return super.getPreco()+0.50;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + "Orégano, ";
    }
}

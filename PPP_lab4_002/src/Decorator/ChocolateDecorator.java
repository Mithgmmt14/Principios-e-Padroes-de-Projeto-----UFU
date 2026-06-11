package Decorator;

public class ChocolateDecorator extends CafeDecorator {
    public ChocolateDecorator(Cafe cafe) {
        super(cafe);
    }
    @Override
    public double calculaCusto() {
        return super.calculaCusto() + 4.0;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + "Chocolate, ";
    }
}

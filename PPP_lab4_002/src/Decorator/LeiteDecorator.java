package Decorator;

public class LeiteDecorator extends CafeDecorator {
    public LeiteDecorator(Cafe cafe) {
        super(cafe);
    }
    @Override
    public double calculaCusto() {
        return super.calculaCusto() + 2.0;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + "Leite, ";
    }
}

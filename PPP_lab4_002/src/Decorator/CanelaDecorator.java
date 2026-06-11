package Decorator;

public class CanelaDecorator extends CafeDecorator {
    public CanelaDecorator(Cafe cafe) {
        super(cafe);
    }
    @Override
    public double calculaCusto() {
        return super.calculaCusto() + 1.5;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + "Canela, ";
    }
}

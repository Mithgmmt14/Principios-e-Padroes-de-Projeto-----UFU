package Decorator;

public class CafeDecorator implements Cafe {

    protected Cafe wrappeee;
    public CafeDecorator (Cafe cafe){
            this.wrappeee = cafe;
        }

    @Override
    public double calculaCusto() {
        return wrappeee.calculaCusto();
    }

    @Override
    public String getDescricao() {
        return wrappeee.getDescricao();
    }
}

package ObjetoBase;
import Decorator.Pizza;

public class MassaFinaPizza implements Pizza {

    @Override
    public String getDescricao() {
        return "Massa de pizza Fina, ";
    }

    @Override
    public double getPreco() {
        return 20.00;
    }
}

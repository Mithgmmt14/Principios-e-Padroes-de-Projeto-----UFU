package ObjetoBase;
import Decorator.Pizza;

public class MassaEspessaPizza implements Pizza {

    @Override
    public String getDescricao() {
        return "Massa de pizza Espessa, ";
    }

    @Override
    public double getPreco() {
        return 25.0;
    }
}

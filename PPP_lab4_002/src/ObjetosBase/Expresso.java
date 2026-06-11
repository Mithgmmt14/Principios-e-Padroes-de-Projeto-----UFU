package ObjetosBase;

import Decorator.Cafe;

public class Expresso implements Cafe {

    @Override
    public double calculaCusto() {
        return 5.0;
    }

    @Override
    public String getDescricao() {
        return "Expresso, ";
    }
}

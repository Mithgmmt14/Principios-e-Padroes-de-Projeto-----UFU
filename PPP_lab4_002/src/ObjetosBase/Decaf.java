package ObjetosBase;

import Decorator.Cafe;

public class Decaf implements Cafe {

    @Override
    public double calculaCusto() {
        return 7.0;
    }

    @Override
    public String getDescricao() {
        return "Decaf, ";
    }
}

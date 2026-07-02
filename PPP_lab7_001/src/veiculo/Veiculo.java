package veiculo;

import visitor.Visitor;

public abstract class Veiculo {
    abstract public void accept ( Visitor v );
}

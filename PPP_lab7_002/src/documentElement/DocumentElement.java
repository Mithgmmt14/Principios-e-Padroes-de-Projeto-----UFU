package documentElement;
import visitor.Visitor;

public abstract class DocumentElement {
    abstract public void accept ( Visitor v );
}

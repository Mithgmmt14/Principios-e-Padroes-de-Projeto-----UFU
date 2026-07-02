package documentElement;
import visitor.Visitor;

public class Table extends DocumentElement {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}

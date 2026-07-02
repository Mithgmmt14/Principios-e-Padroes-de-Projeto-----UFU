package documentElement;
import visitor.Visitor;
public class Image extends DocumentElement {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}

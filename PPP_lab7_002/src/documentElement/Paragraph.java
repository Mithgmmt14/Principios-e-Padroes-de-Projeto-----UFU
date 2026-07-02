package documentElement;
import visitor.Visitor;
public class Paragraph extends DocumentElement {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}

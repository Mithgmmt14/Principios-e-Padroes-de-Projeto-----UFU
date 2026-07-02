package visitor;

import documentElement.*;

public interface Visitor {
    void visit(Image image);
    void visit (Paragraph paragraph);
    void visit (Table table);
}
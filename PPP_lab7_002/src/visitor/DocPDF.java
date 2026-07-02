package visitor;

import documentElement.*;

public class DocPDF implements Visitor {
    @Override
    public void visit(Image image) {
        System.out.println("Exporting image to PDF... ");
    }

    @Override
    public void visit(Paragraph paragraph) {
        System.out.println("Exporting paragraph to PDF... ");
    }

    @Override
    public void visit(Table table) {
        System.out.println("Exporting table to PDF... ");
    }
}

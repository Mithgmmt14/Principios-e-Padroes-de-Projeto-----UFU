package visitor;

import documentElement.*;

public class WordCount implements Visitor{
    @Override
    public void visit(Image image) {
        System.out.println("Can't count words in a image ");
    }

    @Override
    public void visit(Paragraph paragraph) {
        System.out.println("Counting words in a paragraph... ");
    }

    @Override
    public void visit(Table table) {
        System.out.println("Counting the numbers of columns... ");
    }
}

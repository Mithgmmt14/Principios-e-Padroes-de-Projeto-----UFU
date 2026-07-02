import documentElement.*;
import visitor.*;

import java.util.ArrayList;

public class Main {
    public static void main ( String[]args){
        ArrayList<DocumentElement> document = new ArrayList<>();
        document.add(new Image());
        document.add(new Paragraph());
        document.add(new Table());

        Visitor visitor = new DocHTML();
        for ( DocumentElement elem: document ){
            elem.accept(visitor);
        }
        System.out.println();
        visitor = new DocPDF();
        for ( DocumentElement elem: document ){
            elem.accept(visitor);
        }
        System.out.println();
        visitor = new WordCount();
        for ( DocumentElement elem: document ){
            elem.accept(visitor);
        }
    }
}

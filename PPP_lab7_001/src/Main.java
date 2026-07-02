import veiculo.*;
import visitor.*;

import java.util.ArrayList;

public class Main {
    public static void main ( String[]args ){
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add( new Carro("Preto", "Chevrolet", "Onix"));
        veiculos.add( new Onibus( 40, "2005"));
        veiculos.add( new Bicicleta("Cinza"));

        Visitor visitor = new PrintVisitor();
        for ( Veiculo v : veiculos){
            v.accept( visitor );
        }

        System.out.println();
        visitor = new WarningVisitor();
        for ( Veiculo v: veiculos){
            v.accept(visitor);
        }
    }
}
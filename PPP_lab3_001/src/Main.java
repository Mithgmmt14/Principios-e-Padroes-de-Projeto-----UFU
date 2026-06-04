import adapters.*;
import ave.*;
import pato.*;
import pavao.*;

public class Main {
    public static void main ( String[] args ){
        Ave pato_teste = new AdapterPatoAve ( new PatoDomestico() );
        Ave pavao_teste = new AdapterPavaoAve( new PavaoAzul() );

        System.out.println("=== Testes Pato ===");
        pato_teste.voar();
        pato_teste.emitirSom();
        System.out.println();

        System.out.println("=== Testes Pavao ===");
        pavao_teste.emitirSom();
        pavao_teste.voar();
        System.out.println();

    }
}



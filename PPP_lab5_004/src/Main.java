import observers.*;
import subject.*;

public class Main {
    public static void main(String[] args){
        AcaoBroker broker = new AcaoBroker();
        Acao petr4 = new Acao("PETR4", 25.00);

        Investidor Matheus = new Investidor("João", 20.00, 30.00, broker);
        Investidor Ana = new Investidor("Maria", 22.00, 28.00, broker);

        petr4.addObservers(Matheus);
        petr4.addObservers(Ana);
        
        petr4.setPreco(26.50);
        petr4.setPreco(29.00);
        petr4.setPreco(31.00);
        petr4.setPreco(21.00);
    }
}

package visitor;
import veiculo.*;

public interface Visitor {
    void visit ( Carro c );
    void visit ( Onibus o);
    void visit ( Bicicleta b );
}

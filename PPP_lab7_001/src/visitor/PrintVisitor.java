package visitor;
import veiculo.*;
public class PrintVisitor implements Visitor {

    @Override
    public void visit(Carro c) {
        System.out.println("[Modelo]: " + c.getModelo() +
                           "\t[Marca]: " + c.getMarca() +
                           "\t[Cor]: " + c.getCor());
    }

    @Override
    public void visit(Onibus o) {
        System.out.println("[Quantidade de lugares]: " + o.getQuantidade_lugares() +
                           "\t[Ano fabricacao]: " + o.getAno_fabricacao());
    }

    @Override
    public void visit(Bicicleta b) {
        System.out.println("[Cor]: " + b.getCor());
    }
}

package visitor;
import veiculo.*;
public class WarningVisitor implements Visitor {

    @Override
    public void visit(Carro c) {
        System.out.println("Enviando mensagem ao dono... favor atualizar dados do IPVA");
    }

    @Override
    public void visit(Onibus o) {
        System.out.println("Enviando mensagem ao dono... atenção para atualização das licenças");
    }

    @Override
    public void visit(Bicicleta b) {
        System.out.println("Enviando mensagem ao dono... comemore no parque o dia do ciclismo");
    }
}

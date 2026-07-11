package quiz.aplicacao.programacao.fabrica;

import quiz.aplicacao.programacao.jogo.InterfaceGraficaSwing;
import quiz.framework.factory.UserInterfaceFactory;
import quiz.framework.graphicaluserinterface.UserInterface;

public class InterfaceGraficaSwingFactory implements UserInterfaceFactory {
    @Override
    public UserInterface create() {
        return new InterfaceGraficaSwing();
    }
}

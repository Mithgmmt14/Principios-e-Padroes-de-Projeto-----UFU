package quiz.aplicacao.omori.fabrica;

import quiz.aplicacao.omori.jogo.InterfaceGraficaConsole;
import quiz.framework.fabrica.UserInterfaceFactory;
import quiz.framework.graphicaluserinterface.UserInterface;

public class InterfaceGraficaConsoleFactory implements UserInterfaceFactory {

    @Override
    public UserInterface create() {
        return new InterfaceGraficaConsole();
    }
}

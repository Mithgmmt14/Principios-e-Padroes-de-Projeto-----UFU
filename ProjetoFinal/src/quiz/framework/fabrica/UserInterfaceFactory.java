package quiz.framework.fabrica;

import quiz.framework.graphicaluserinterface.UserInterface;

/**
 * Interface para a aplicação do padrão Factory.
 * A classe concreta que irá criar objetos do tipo 'UserInterfaceFactory' deve implementar essa interface.
 * @author Matheus Vieira de Assis
 */

public interface UserInterfaceFactory {
    UserInterface create();
}

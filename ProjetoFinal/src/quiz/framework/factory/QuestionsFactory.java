package quiz.framework.factory;

import quiz.framework.questionmanager.Question;

import java.util.List;

/**
 * Interface para a aplicação do padrão Factory.
 * A classe concreta que irá instanciar e popular a lista de questões para o Quiz deve implementar essa classe.
 * @author Matheus Vieira de Assis
 */

public interface QuestionsFactory {
    List<Question> create();
}

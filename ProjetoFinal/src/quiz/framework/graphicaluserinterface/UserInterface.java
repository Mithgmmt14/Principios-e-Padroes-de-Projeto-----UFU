package quiz.framework.graphicaluserinterface;

import quiz.framework.Result;
import quiz.framework.gerenciadorperguntas.Alternative;

import java.util.List;

public interface UserInterface {
    void showQuestion(String statement);
    void showAlternatives(List<Alternative> alternatives);
    Alternative readQuestion();
    void showFinalResult(Result result);
}

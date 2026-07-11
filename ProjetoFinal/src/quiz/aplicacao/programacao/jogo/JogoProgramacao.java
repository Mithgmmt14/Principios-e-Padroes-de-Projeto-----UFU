package quiz.aplicacao.programacao.jogo;

import quiz.framework.GameTemplate;
import quiz.framework.Result;
import quiz.framework.scorecalculation.StrategyScoreCalculation;
import quiz.framework.questionmanager.Question;
import quiz.framework.graphicaluserinterface.UserInterface;

import java.util.List;

/**
 * Classe concreta responsável por implementar os métodos gancho (hooks) da classe abstrata GameTemplate.
 * Define as mensagens específicas de inicialização e encerramento para o quiz com o tema Programação.
 * Nesse caso, não há nenhuma alteração, mantendo os métodos gancho com corpo vazio.
 * @author Matheus Vieira de Assis
 */

public class JogoProgramacao extends GameTemplate {

    public JogoProgramacao(StrategyScoreCalculation scoreCalculation, UserInterface graphicalInterface, List<Question> questions, Result result) {
        super(scoreCalculation, graphicalInterface, questions, result);
    }

    @Override
    public void initialization() {
    }

    @Override
    public void completion() {
    }
}

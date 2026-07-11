package quiz.aplicacao.programacao.fabrica;

import quiz.aplicacao.programacao.jogo.CalculoPontuacaoProgramacaoStrategy;
import quiz.framework.calculopontuacao.StrategyScoreCalculation;
import quiz.framework.fabrica.ScoreCalculationFactory;

/**
 * Classe concreta responsável por definir a lógica de pontuação para o Quiz sobre programação.
 * @author Matheus Vieira de Assis
 */

public class CalculoPontuacaoProgramacaoFactory implements ScoreCalculationFactory {

    @Override
    public StrategyScoreCalculation create() {
        return new CalculoPontuacaoProgramacaoStrategy();
    }
}

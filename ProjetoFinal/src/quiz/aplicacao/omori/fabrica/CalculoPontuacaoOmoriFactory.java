package quiz.aplicacao.omori.fabrica;

import quiz.aplicacao.omori.jogo.CalculoPontuacaoOmoriStrategy;
import quiz.framework.scorecalculation.StrategyScoreCalculation;
import quiz.framework.factory.ScoreCalculationFactory;

public class CalculoPontuacaoOmoriFactory implements ScoreCalculationFactory{

    @Override
    public StrategyScoreCalculation create() {
        return new CalculoPontuacaoOmoriStrategy();
    }
}

package quiz.aplicacao.omori.fabrica;

import quiz.aplicacao.omori.jogo.CalculoPontuacaoOmoriStrategy;
import quiz.framework.calculopontuacao.StrategyScoreCalculation;
import quiz.framework.fabrica.ScoreCalculationFactory;

public class CalculoPontuacaoOmoriFactory implements ScoreCalculationFactory{

    @Override
    public StrategyScoreCalculation create() {
        return new CalculoPontuacaoOmoriStrategy();
    }
}

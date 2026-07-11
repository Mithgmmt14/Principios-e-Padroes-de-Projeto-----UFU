package quiz.framework.factory;

import quiz.framework.scorecalculation.StrategyScoreCalculation;

/**
 * Interface para a aplicação do padrão Factory.
 * A classe concreta que irá criar objetos do tipo 'StrategyScoreCalculation' deve implementar essa interface.
 * @author Matheus Vieira de Assis
 */

public interface ScoreCalculationFactory {
    StrategyScoreCalculation create();
}

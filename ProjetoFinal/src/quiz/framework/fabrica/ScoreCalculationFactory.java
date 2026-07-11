package quiz.framework.fabrica;

import quiz.framework.calculopontuacao.StrategyScoreCalculation;

/**
 * Interface para a aplicação do padrão Factory.
 * A classe concreta que irá criar objetos do tipo 'StrategyScoreCalculation' deve implementar essa interface.
 * @author Matheus Vieira de Assis
 */

public interface ScoreCalculationFactory {
    StrategyScoreCalculation create();
}

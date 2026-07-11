package quiz.framework.scorecalculation;

/**
 * Interface para a aplicação do padrão Strategy.
 * A classe que será responsável pela lógica de cálculo de pontos deve implementar esta interface.
 * @author Matheus Vieira de Assis
 */

public interface StrategyScoreCalculation {
    int calculate(boolean hit, int elapsedTime );
}

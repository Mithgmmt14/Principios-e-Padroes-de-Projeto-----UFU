package quiz.aplicacao.programacao.jogo;

import quiz.framework.scorecalculation.StrategyScoreCalculation;

/**
 * Classe concreta responsável por definir a lógica de pontuação para o Quiz sobre Omori.
 * @author Matheus Vieira de Assis
 */

public class CalculoPontuacaoProgramacaoStrategy implements StrategyScoreCalculation {
    @Override
    public int calculate(boolean hit, int elapsedTime) {
        if ( hit ){
            return 10;
        }
        return -5;
    }
}

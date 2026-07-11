package quiz.aplicacao.omori.jogo;

import quiz.framework.scorecalculation.StrategyScoreCalculation;

/**
 * Classe concreta responsável por definir a lógica de pontuação para o Quiz sobre Omori.
 * @author Matheus Vieira de Assis
 */

public class CalculoPontuacaoOmoriStrategy implements StrategyScoreCalculation {

    @Override
    public int calculate(boolean hit, int elapsedTime) {
        if ( hit ){
            if (elapsedTime <= 30 ){
                return 15;
            } else if (elapsedTime <= 60) {
                return 10;
            }
            return 5;
        }else {
            return -5;
        }
    }
}

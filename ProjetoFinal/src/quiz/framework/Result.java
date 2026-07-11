package quiz.framework;

/**
 * Classe concreta responsável por armazenar o estado do jogo
 * (quantidade de acertos, quantidade de erros e a pontuação atual a cada round).
 * @author Matheus Vieira de Assis
 */

public class Result {
    private int hits;
    private int errors;
    private int finalScore;

    public Result(){
        hits = 0;
        errors = 0;
        finalScore = 0;
    }
    public void saveRoundResults(boolean hit, int roundScore ){
        if ( hit ){
            hits++;
        }else{
            errors++;
        }
        finalScore += roundScore;
    }
    public int getHits() {
        return hits;
    }

    public int getErrors() {
        return errors;
    }

    public int getFinalScore() {
        return finalScore;
    }
}

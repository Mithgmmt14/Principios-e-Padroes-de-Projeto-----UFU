package quiz.framework;

import quiz.framework.calculopontuacao.StrategyScoreCalculation;
import quiz.framework.gerenciadorperguntas.Alternative;
import quiz.framework.gerenciadorperguntas.Question;
import quiz.framework.graphicaluserinterface.UserInterface;

import java.util.List;

/**
 * Classe abstrata que aplica o padrão Template Method, responsável pela lógica central do jogo.
 * Define o fluxo principal de execução da partida, gerenciando a inicialização, a iteração
 * sobre as questões válidas, a contagem de tempo, o cálculo da pontuação e o encerramento.
 * @author Matheus Vieira de Assis
 */

public abstract class GameTemplate {
    protected final StrategyScoreCalculation scoreCalculation;
    protected final UserInterface graphicalInterface;
    protected final List<Question> questions;
    protected final Result result;

    public GameTemplate(StrategyScoreCalculation scoreCalculation, UserInterface graphicalInterface, List<Question> questions, Result result) {
        this.scoreCalculation = scoreCalculation;
        this.graphicalInterface = graphicalInterface;
        this.questions = questions;
        this.result = result;
    }

    /**
     * Executa o fluxo principal do jogo.
     * O fluxo consiste em: inicializar o jogo, iterar pelas questões (exibindo-as,
     * lendo a resposta e cronometrando o tempo), calcular e salvar os pontos,
     * exibir o resultado final e, por fim, executar as rotinas de encerramento.
     */

    public void execute(){
        this.initialization();
        for ( int i = 0 ; i < questions.size(); i++ ){
            Question q = questions.get(i);
            if ( q.isValid() ){
                graphicalInterface.showQuestion( q.getStatement() );
                graphicalInterface.showAlternatives( q.getAlternatives());

                long startTime = System.currentTimeMillis();
                Alternative currentAlternative = graphicalInterface.readQuestion();
                long endTime = System.currentTimeMillis();

                int totalTime = ( int ) (( endTime - startTime) / 1000);

                int score = scoreCalculation.calculate(currentAlternative.value(), totalTime);
                result.saveRoundResults( currentAlternative.value(), score );
            }
        }
        graphicalInterface.showFinalResult(result);
        this.completion();
    }

    /**
     * Métodos gancho (hook) para a inicialização do jogo.
     * A serem implementados pelas subclasses para definir configurações de pré-jogo e pós-jogo, respectivamente.
     */

    public abstract void initialization();
    public abstract void completion();
}

package quiz.aplicacao.omori.jogo;

import quiz.framework.GameTemplate;
import quiz.framework.Result;
import quiz.framework.scorecalculation.StrategyScoreCalculation;
import quiz.framework.questionmanager.Question;
import quiz.framework.graphicaluserinterface.UserInterface;

import java.util.List;

/**
 * Classe concreta responsável por implementar os métodos gancho (hooks) da classe abstrata GameTemplate.
 * Define as mensagens específicas de inicialização e encerramento para o quiz com o tema Omori.
 * @author Matheus Vieira de Assis
 */

public class JogoOmori extends GameTemplate {

    public JogoOmori(StrategyScoreCalculation scoreCalculation, UserInterface graphicalInterface, List<Question> questions, Result result) {
        super(scoreCalculation, graphicalInterface, questions, result);
    }

    @Override
    public void initialization() {
        System.out.println("**************************************************");
        System.out.println("                 BEM-VINDO AO QUIZ           ");
        System.out.println("**************************************************");
        System.out.println(" Regras do Jogo:");
        System.out.println(" 1. Uma pergunta será exibida por vez com suas alternativas.");
        System.out.println(" 2. Escolha a resposta correta digitando o número correspondente.");
        System.out.println(" 3. Seja rápido! O tempo de resposta influencia seus pontos.");
        System.out.println("**************************************************\n");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.err.println("Aviso: A pausa de inicialização foi interrompida.");
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void completion() {
        System.out.println("\n**************************************************");
        System.out.println("             PARTIDA FINALIZADA!                  ");
        System.out.println("**************************************************");
        System.out.println(" Obrigado por jogar!");
        System.out.println("**************************************************");
    }
}

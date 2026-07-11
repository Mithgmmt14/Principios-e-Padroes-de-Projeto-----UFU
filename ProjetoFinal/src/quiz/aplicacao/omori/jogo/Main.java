package quiz.aplicacao.omori.jogo;

import quiz.aplicacao.omori.fabrica.CalculoPontuacaoOmoriFactory;
import quiz.aplicacao.omori.fabrica.InterfaceGraficaConsoleFactory;
import quiz.aplicacao.omori.fabrica.PerguntasOmoriFactory;
import quiz.framework.GameTemplate;
import quiz.framework.Result;
import quiz.framework.calculopontuacao.StrategyScoreCalculation;
import quiz.framework.fabrica.QuestionsFactory;
import quiz.framework.fabrica.ResultFactory;
import quiz.framework.fabrica.ScoreCalculationFactory;
import quiz.framework.fabrica.UserInterfaceFactory;
import quiz.framework.gerenciadorperguntas.Question;
import quiz.framework.graphicaluserinterface.UserInterface;

import java.util.List;

public class Main {
    public static void main ( String[] args ){
        ScoreCalculationFactory calculoPontuacaoFactory = new CalculoPontuacaoOmoriFactory();
        UserInterfaceFactory intefaceUsuarioFactory = new InterfaceGraficaConsoleFactory();
        QuestionsFactory perguntasFactory = new PerguntasOmoriFactory();

        StrategyScoreCalculation estregiaPontuacao= calculoPontuacaoFactory.create();
        UserInterface interfaceUsuario = intefaceUsuarioFactory.create();
        List<Question> perguntas = perguntasFactory.create();
        Result resultado = ResultFactory.create();

        GameTemplate jogo = new JogoOmori(estregiaPontuacao, interfaceUsuario, perguntas, resultado);
        jogo.execute();
    }
}

package quiz.aplicacao.omori.jogo;

import quiz.aplicacao.omori.fabrica.CalculoPontuacaoOmoriFactory;
import quiz.aplicacao.omori.fabrica.InterfaceGraficaConsoleFactory;
import quiz.aplicacao.omori.fabrica.PerguntasOmoriFactory;
import quiz.framework.GameTemplate;
import quiz.framework.Result;
import quiz.framework.scorecalculation.StrategyScoreCalculation;
import quiz.framework.factory.QuestionsFactory;
import quiz.framework.factory.ResultFactory;
import quiz.framework.factory.ScoreCalculationFactory;
import quiz.framework.factory.UserInterfaceFactory;
import quiz.framework.questionmanager.Question;
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

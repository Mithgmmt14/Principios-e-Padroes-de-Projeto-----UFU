package quiz.aplicacao.programacao.jogo;

import quiz.aplicacao.programacao.fabrica.CalculoPontuacaoProgramacaoFactory;
import quiz.aplicacao.programacao.fabrica.InterfaceGraficaSwingFactory;
import quiz.aplicacao.programacao.fabrica.PerguntasProgramacaoFactory;
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
    public static void main ( String[] args){
        ScoreCalculationFactory calcPontuacaoFactory = new CalculoPontuacaoProgramacaoFactory();
        UserInterfaceFactory interfaceFactory = new InterfaceGraficaSwingFactory();
        QuestionsFactory questoesFactory = new PerguntasProgramacaoFactory();

        StrategyScoreCalculation estregiaPontuacao= calcPontuacaoFactory.create();
        UserInterface interfaceUsuario = interfaceFactory.create();
        List<Question> perguntas = questoesFactory.create();
        Result resultado = ResultFactory.create();

        GameTemplate jogo = new JogoProgramacao( estregiaPontuacao, interfaceUsuario, perguntas,resultado);
        jogo.execute();
    }
}

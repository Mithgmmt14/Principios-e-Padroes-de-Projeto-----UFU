package quiz.aplicacao.programacao.jogo;

import quiz.aplicacao.programacao.fabrica.CalculoPontuacaoProgramacaoFactory;
import quiz.aplicacao.programacao.fabrica.InterfaceGraficaSwingFactory;
import quiz.aplicacao.programacao.fabrica.PerguntasProgramacaoFactory;
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

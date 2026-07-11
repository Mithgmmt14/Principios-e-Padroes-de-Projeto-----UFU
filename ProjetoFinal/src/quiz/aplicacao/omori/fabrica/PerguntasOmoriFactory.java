package quiz.aplicacao.omori.fabrica;

import quiz.framework.fabrica.QuestionsFactory;
import quiz.framework.gerenciadorperguntas.Alternative;
import quiz.framework.gerenciadorperguntas.Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PerguntasOmoriFactory implements QuestionsFactory {

    /**
     * Classe concreta responsável por implementar QuestionsFactory e a instanciar
     * as questões e alternativas para o Quiz sobre Omori.
     * @author Matheus Vieira de Assis
     */

    @Override
    public List<Question> create() {
        List<Question> questions = new ArrayList<>();

        Question p1 = new Question( "Qual é o nome do quarto do Omori?", new ArrayList<>());
            p1.addAlternative( new Alternative("White Space.", true ));
            p1.addAlternative( new Alternative("Head Space.", false ));
            p1.addAlternative( new Alternative("Black Space.", false ));
            p1.addAlternative( new Alternative("Red Space.", false ));
            p1.shuffleAlternatives();
        questions.add(p1);
        Question p2 = new Question( "Qual é o nome do amigo do Sunny que sabe da verdade?", new ArrayList<>());
            p2.addAlternative( new Alternative("Kel.", false ));
            p2.addAlternative( new Alternative("Hero.", false ));
            p2.addAlternative( new Alternative("Basil.", true ));
            p2.addAlternative( new Alternative("Mari.", false ));
            p2.shuffleAlternatives();
        questions.add(p2);
        Question p3 = new Question( "Para qual objetivo Sunny criou o Omori?", new ArrayList<>());
            p3.addAlternative( new Alternative("Para passar o tempo.", false ));
            p3.addAlternative( new Alternative("Para investigar a própria mente.", false ));
            p3.addAlternative( new Alternative("Para evitar enfrentar a realidade.", true));
            p3.addAlternative( new Alternative("Para se aproximar dos amigos.", false ));
            p3.shuffleAlternatives();
        questions.add(p3);
        Question p4 = new Question( "No que Omori se tornou para Sunny?", new ArrayList<>());
            p4.addAlternative( new Alternative("Seu melhor amigo.", false ));
            p4.addAlternative( new Alternative("A representação de sua depressão.", true ));
            p4.addAlternative( new Alternative("Seu amigo imaginário.", false ));
            p4.addAlternative( new Alternative("Sua segunda personalidade.", false ));
            p4.shuffleAlternatives();
        questions.add(p4);
        Question p5 = new Question( "Como é chamada a representação da culpa de Sunny?", new ArrayList<>());
            p5.addAlternative( new Alternative("Something.", true));
            p5.addAlternative( new Alternative("Hellmari.", false ));
            p5.addAlternative( new Alternative("Hikikomori.", false ));
            p5.addAlternative( new Alternative("ABBI.", false ));
            p5.shuffleAlternatives();
        questions.add(p5);
        Question p6 = new Question( "Qual instrumento Sunny tocava?", new ArrayList<>());
            p6.addAlternative( new Alternative("Piano.", false ));
            p6.addAlternative( new Alternative("Órgão.", false ));
            p6.addAlternative( new Alternative("Guitarra.", false ));
            p6.addAlternative( new Alternative("Violino.", true));
            p6.shuffleAlternatives();
        questions.add(p6);
        Question p7 = new Question( "Como a irmã de Sunny 'se matou'?", new ArrayList<>());
            p7.addAlternative( new Alternative("Com remédios.", false ));
            p7.addAlternative( new Alternative("Com uma faca.", false ));
            p7.addAlternative( new Alternative("Com uma corda.", true ));
            p7.addAlternative( new Alternative("Pulando de um lugar alto.", false ));
            p7.shuffleAlternatives();
        questions.add(p7);
        Question p8 = new Question( "Quais são os medos de Sunny?", new ArrayList<>());
            p8.addAlternative( new Alternative("Altura, fogo e escuro.", false ));
            p8.addAlternative( new Alternative("Altura, aranhas e água.", true ));
            p8.addAlternative( new Alternative("Fogo, escuro e aranhas.", false ));
            p8.addAlternative( new Alternative("Água, fogo e altura.", false ));
            p8.shuffleAlternatives();
        questions.add(p8);
        Question p9 = new Question( "Qual é o nome do gato da Mari?", new ArrayList<>());
            p9.addAlternative( new Alternative("Mewo.", true ));
            p9.addAlternative( new Alternative("Meowth.", false ));
            p9.addAlternative( new Alternative("Aubrey.", false ));
            p9.addAlternative( new Alternative("Kim.", false ));
            p9.shuffleAlternatives();
        questions.add(p9);
        Question p10 = new Question( "Qual é a verdade que Sunny tenta esconder?", new ArrayList<>());
            p10.addAlternative( new Alternative("Ele tem bipolaridade.", false ));
            p10.addAlternative( new Alternative("Ele matou seu amigo.", false ));
            p10.addAlternative( new Alternative("Ele matou sua irmã.", true ));
            p10.addAlternative( new Alternative("Ele odeia seus amigos.", false ));
            p10.shuffleAlternatives();
        questions.add(p10);

        Collections.shuffle(questions);
        return questions;
    }
}

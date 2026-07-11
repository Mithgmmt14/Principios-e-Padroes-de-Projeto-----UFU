package quiz.aplicacao.programacao.fabrica;

import quiz.framework.factory.QuestionsFactory;
import quiz.framework.questionmanager.Alternative;
import quiz.framework.questionmanager.Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Classe concreta responsável por implementar QuestionsFactory e a instanciar
 * as questões e alternativas para o Quiz sobre Programação.
 * @author Matheus Vieira de Assis
 */

public class PerguntasProgramacaoFactory implements QuestionsFactory {

    @Override
    public List<Question> create() {
        List<Question> questions = new ArrayList<>();
        Question p1 = new Question( "Qual das seguintes linguagens de programação é considerada o símbolo do paradigma funcional", new ArrayList<>());
        p1.addAlternative( new Alternative("C.", false));
        p1.addAlternative( new Alternative("Python.", false ));
        p1.addAlternative( new Alternative("LISP.", true ));
        p1.addAlternative( new Alternative("Java.", false ));
        p1.shuffleAlternatives();
        questions.add(p1);
        Question p2 = new Question( "O que é uma linguagem de programação?", new ArrayList<>());
        p2.addAlternative( new Alternative("Hardware que processa e armazena dados.", false ));
        p2.addAlternative( new Alternative("Regras e símbolos para dar instruções ao computador.", true));
        p2.addAlternative( new Alternative("Um programa utilizado para acessar a internet.", false ));
        p2.addAlternative( new Alternative("O sistema operativo que gerencia a máquina.", false ));
        p2.shuffleAlternatives();
        questions.add(p2);
        Question p3 = new Question( "Na programação orientada a objetos, qual é a definição mais precisa para uma 'classe'?", new ArrayList<>());
        p3.addAlternative( new Alternative("Um objeto já instanciado e ativo na memória.", false ));
        p3.addAlternative( new Alternative("Um molde ou projeto utilizado para criar objetos.", true ));
        p3.addAlternative( new Alternative("Uma função específica que executa uma tarefa isolada.", false));
        p3.addAlternative( new Alternative("Um espaço reservado para armazenar variáveis globais", false ));
        p3.shuffleAlternatives();
        questions.add(p3);
        Question p4 = new Question( "Quais são as duas estruturas de dados fundamentais utilizadas para representar um grafo em código?", new ArrayList<>());
        p4.addAlternative( new Alternative("Pilhas e Filas.", false ));
        p4.addAlternative( new Alternative("Matriz de Adjacência e Lista de Adjacência.", true ));
        p4.addAlternative( new Alternative("Árvores Binárias e Tabelas Hash.", false ));
        p4.addAlternative( new Alternative("Variáveis Globais e Ponteiros Duplos.", false ));
        p4.shuffleAlternatives();
        questions.add(p4);
        Question p5 = new Question( "Qual foi a primeira linguagem de programação a introduzir o conceito de herança na sua estrutura?", new ArrayList<>());
        p5.addAlternative( new Alternative("C++.", false));
        p5.addAlternative( new Alternative("Smalltalk.", false ));
        p5.addAlternative( new Alternative("Java.", false ));
        p5.addAlternative( new Alternative("Simula.", true ));
        p5.shuffleAlternatives();
        questions.add(p5);
        Question p6 = new Question( "Qual é a função principal de uma interface na programação orientada a objetos?", new ArrayList<>());
        p6.addAlternative( new Alternative("Fornecer a implementação detalhada de todas as funções do sistema.", false ));
        p6.addAlternative( new Alternative("Definir um contrato de métodos que outras classes devem obrigatoriamente implementar.", true ));
        p6.addAlternative( new Alternative("Armazenar de forma persistente os dados e configurações do utilizador.", false ));
        p6.addAlternative( new Alternative("Criar instâncias de objetos diretamente na memória da máquina.", false));
        p6.shuffleAlternatives();
        questions.add(p6);
        Question p7 = new Question( "O que representa a letra 'D' no acrónimo SOLID ?", new ArrayList<>());
        p7.addAlternative( new Alternative("Delegação de Dados (Data Delegation).", false ));
        p7.addAlternative( new Alternative("Inversão de Dependência (Dependency Inversion).", true ));
        p7.addAlternative( new Alternative("Design Dirigido (Driven Design).", false ));
        p7.addAlternative( new Alternative("Distribuição de Domínio (Domain Distribution).", false ));
        p7.shuffleAlternatives();
        questions.add(p7);
        Question p8 = new Question( "Qual padrão de projeto tem como principal responsabilidade a instanciação de outras classes?", new ArrayList<>());
        p8.addAlternative( new Alternative("Singleton.", false ));
        p8.addAlternative( new Alternative("Observer.", false ));
        p8.addAlternative( new Alternative("Factory.", true));
        p8.addAlternative( new Alternative("Decorator.", false ));
        p8.shuffleAlternatives();
        questions.add(p8);

        Collections.shuffle(questions);
        return questions;
    }
}

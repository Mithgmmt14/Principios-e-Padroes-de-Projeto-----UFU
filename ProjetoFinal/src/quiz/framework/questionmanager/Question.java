package quiz.framework.questionmanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Representa uma questão concreta, contendo um enunciado e opções de resposta.
 * Esta classe é responsável por gerenciar suas próprias alternativas, validando
 * regras de negócio e permitindo operações como o embaralhamento das opções.
 * @author Matheus Vieira de Assis
 */

public class Question {

    private final String statement;
    private final List<Alternative> alternatives;

    public Question(String statement, List<Alternative> alternatives) {
        this.statement = statement;
        this.alternatives = new ArrayList<>(alternatives);
    }

    public String getStatement() {
        return statement;
    }

    public List<Alternative> getAlternatives() {
        return alternatives;
    }

    public void addAlternative(Alternative a) {
        this.alternatives.add(a);
    }

    public boolean isValid() {
        if (this.alternatives.size() < 2) {
            return false;
        }
        for (Alternative a : this.alternatives) {
            if (a.value()) {
                return true;
            }
        }
        return false;
    }
    public void shuffleAlternatives() {
        Collections.shuffle(this.alternatives);
    }
}

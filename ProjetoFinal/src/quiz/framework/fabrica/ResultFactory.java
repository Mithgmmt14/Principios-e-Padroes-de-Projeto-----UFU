package quiz.framework.fabrica;

import quiz.framework.Result;

/**
 * Factory responsável por instanciar objetos do tipo result.
 * @author Matheus Vieira de Assis
 */

public class ResultFactory {
    public static Result create(){
        return new Result();
    }
}

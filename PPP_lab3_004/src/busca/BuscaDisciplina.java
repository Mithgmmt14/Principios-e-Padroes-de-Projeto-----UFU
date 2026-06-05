package busca;

import disciplina.*;

/**
 * >> Interface comum entre o objeto base e o proxy;
 */

public interface BuscaDisciplina {
    Disciplina buscar(String termo);
}

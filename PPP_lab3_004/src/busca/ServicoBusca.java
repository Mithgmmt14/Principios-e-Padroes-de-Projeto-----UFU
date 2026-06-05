package busca;

import java.util.ArrayList;
import disciplina.*;

/**
 * >> Objeto base;
 * Contém a lista real de disciplinas;
 */

public class ServicoBusca implements BuscaDisciplina {
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();
    public void adicionarDisciplina ( int id, String nome, String descricao ){
        Disciplina disciplina = new Disciplina(id,nome,descricao);
        disciplinas.add (disciplina);
    }
    @Override
    public Disciplina buscar(String termo) {
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getNome().equalsIgnoreCase(termo)) {
                return disciplina;
            }
        }
        return null;
    }
}

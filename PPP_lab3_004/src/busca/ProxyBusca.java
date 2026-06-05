package busca;

import java.util.HashMap;
import java.util.Map;
import disciplina.*;

/**
 * >> Proxy
 * Objeto intermediário entre o objeto base e o cliente, responsável pela lógica de busca.
 * Se a busca já tiver sido feita antes, ele entrega o resultado do Cache sem acionar o Objeto Base lento;
 */

public class ProxyBusca implements BuscaDisciplina {
    private ServicoBusca servicoReal;
    private Map<String, Disciplina> cache = new HashMap<>();

    public ProxyBusca ( ServicoBusca servicoreal ){
        this.servicoReal = servicoreal;
    }

    public Disciplina buscar (String termo ){
        // Padronização da chave de busca;
        String termoChave = termo.toLowerCase().trim();
        System.out.println("\n[Proxy] busca pelo termo: '" + termo + "'");

        // Verifica se está mapeado no cache;
        if (cache.containsKey(termoChave)) {
            System.out.println("[Proxy] Termo encontrado no CACHE!");
            return cache.get(termoChave);
        }

        // Se não estiver no cache, repassa o trabalho para o Objeto Base;
        Disciplina disciplinaEncontrada = servicoReal.buscar(termo);

        // Guarda o resultado no cache;
        cache.put(termoChave, disciplinaEncontrada);

        return disciplinaEncontrada;
    }
}

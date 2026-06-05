import busca.BuscaDisciplina;
import busca.ProxyBusca;
import busca.ServicoBusca;
import disciplina.Disciplina;

/**
 * >> Classe cliente que solicita um serviço da classe proxy.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("SISTEMA ACADÊMICO - BUSCA DE DISCIPLINAS (PROXY)");

        // Instancia e popula o Objeto Base;
        ServicoBusca servicoReal = new ServicoBusca();
        servicoReal.adicionarDisciplina(1, "Estruturas de Dados", "Estudo de listas, pilhas, filas e árvores.");
        servicoReal.adicionarDisciplina(2, "Programacao Orientada a Objetos", "Pilares de POO e Padrões de Projeto.");

        // Proxy intermediário;
        BuscaDisciplina buscador = new ProxyBusca(servicoReal);

        // Realização de buscas;
        System.out.println("\n--- busca 'Estruturas de Dados' ---");
        Disciplina d1 = buscador.buscar("Estruturas de Dados");
        imprimirResultado (d1);

        System.out.println("\n--- busca 'Estruturas de Dados' ---");
        Disciplina d2 = buscador.buscar("Estruturas de Dados");
        imprimirResultado (d2);

        System.out.println("\n--- busca por termo inexistente  ---");
        Disciplina d3 = buscador.buscar("Calculo I");
        imprimirResultado(d3);

        System.out.println("==================================================");
    }
    private static void imprimirResultado(Disciplina d) {
        if (d != null) {
            System.out.print(d);
        } else {
            System.out.println("Não há disciplinas com esse nome");
        }
    }
}

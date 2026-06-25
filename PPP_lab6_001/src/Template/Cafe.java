package Template;

public class Cafe extends ProdutoTemplate {
    @Override
    public void preparaBebida() {
        System.out.println("-> Preparando coador com pó de café.");
        System.out.println("-> Colocando coador na garrafa.");
        System.out.println("-> Despejando água quente no coador");
    }
    @Override
    public void adicionaCondimentos() {
        System.out.println("-> Adicionando açúcar ao café pronto.");
    }
}

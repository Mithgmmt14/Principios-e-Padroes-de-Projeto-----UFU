package Template;

public class Cha extends ProdutoTemplate {

    @Override
    public void preparaBebida() {
        System.out.println("-> Colocando uma erva na xícara.");
    }

    @Override
    public void adicionaCondimentos() {
        System.out.println("-> Adicionando canela.");
        System.out.println("-> Adicionando alecrim.");
    }
}

package Template;

public abstract class ProdutoTemplate {
    public void aqueceAgua(){
        System.out.println("-> Aquecendo a água. ");
    }
    public void colocaXicara(){
        System.out.println("-> Colocando a bebida na xícara ...");
    }

    public abstract void preparaBebida();
    public abstract void adicionaCondimentos();

    public final void preparoCompleto(){
        this.aqueceAgua();
        this.preparaBebida();
        this.colocaXicara();
        this.adicionaCondimentos();
    }

}

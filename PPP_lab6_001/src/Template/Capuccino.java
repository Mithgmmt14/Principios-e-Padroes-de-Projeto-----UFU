package Template;

public class Capuccino extends Cafe {
    @Override
    public void adicionaCondimentos(){
        super.adicionaCondimentos();
        System.out.println("-> Adicionando leite.");
    }
}

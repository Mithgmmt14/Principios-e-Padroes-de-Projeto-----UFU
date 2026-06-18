package observers;

public class PrefeituraUberlandia implements Observer {

    @Override
    public void atualizar(float temperatura, float umidade, float velocidadeVento) {
        System.out.println("PREFEITURA DE UBERLÂNDIA: Alerta! A umidade relativa do ar atual é de " + umidade + "%.");
    }
}

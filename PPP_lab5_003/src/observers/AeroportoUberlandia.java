package observers;

public class AeroportoUberlandia implements Observer {
    @Override
    public void atualizar(float temperatura, float umidade, float velocidadeVento) {
        System.out.println("AEROPORTO DE UBERLÂNDIA : Rajadas de vento registradas a " + velocidadeVento + " km/h.");
    }
}

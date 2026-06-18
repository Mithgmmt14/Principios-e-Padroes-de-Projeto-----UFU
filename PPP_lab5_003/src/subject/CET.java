package subject;

import observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class CET implements Subject {
    private List<Observer> observadores;
    private float temperatura;
    private float umidade;
    private float velocidadeVento;

    public CET() {
        this.observadores = new ArrayList<>();
    }

    @Override
    public void addObservers(Observer o) {
        observadores.add(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observadores) {
            o.atualizar(temperatura, umidade, velocidadeVento);
        }
    }

    public void mudarMetricas(float temperatura, float umidade, float velocidadeVento) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.velocidadeVento = velocidadeVento;
        notifyObservers();
    }
}

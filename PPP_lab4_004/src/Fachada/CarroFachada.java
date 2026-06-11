package Fachada;

public class CarroFachada {
    private final Motor motor = new Motor();
    private final CintoSeguranca cinto = new CintoSeguranca();
    private final Porta porta = new Porta();
    private final Farol farol = new Farol();
    private final Radio radio = new Radio();

    public void dirigirCarro(String estacao) {
        System.out.println("\n=== INICIO ===");
        motor.ligar();
        porta.trancar();
        cinto.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizarEstacao(estacao);
    }

    public void finalizarCorrida() {
        System.out.println("\n=== FIM ===");
        motor.desligar();
        porta.destrancar();
        cinto.destravar();
        farol.apagar();
        radio.desligar();
    }
}


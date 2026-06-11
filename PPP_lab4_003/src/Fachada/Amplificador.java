package Fachada;

public class Amplificador {
    public void ligar() { System.out.println("Amplificador: Ligado"); }
    public void desligar() { System.out.println("Amplificador: Desligado"); }
    public void ajustarVolume(int volume) { System.out.println("Amplificador: Volume ajustado para " + volume); }
}

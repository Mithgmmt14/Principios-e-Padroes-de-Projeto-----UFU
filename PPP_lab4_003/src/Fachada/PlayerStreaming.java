package Fachada;

public class PlayerStreaming {
    public void ligar() { System.out.println("Player de Streaming: Ligado"); }
    public void desligar() { System.out.println("Player de Streaming: Desligado"); }
    public void play(String filme) { System.out.println("Player de Streaming: Reproduzindo o filme '" + filme + "'"); }
}

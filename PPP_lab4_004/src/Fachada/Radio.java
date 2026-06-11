package Fachada;

public class Radio {
    public void ligar() { System.out.println("Rádio: Ligado."); }
    public void desligar() { System.out.println("Rádio: Desligado."); }
    public void sintonizarEstacao(String estacao) {
        System.out.println("Rádio: estação " + estacao);
    }
}

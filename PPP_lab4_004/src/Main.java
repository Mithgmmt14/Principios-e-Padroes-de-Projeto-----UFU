import Fachada.CarroFachada;

public class Main{
    public static void main ( String[] args ){
        CarroFachada Carro = new CarroFachada();
        Carro.dirigirCarro("101.2");
        Carro.finalizarCorrida();

    }
}

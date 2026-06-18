package freteStrategy;

public class FreteSedex implements FreteStrategy{
    @Override
    public double calcularfrete(double distanciaKM) {
        return ( 5 + 0.012 * distanciaKM);
    }
}

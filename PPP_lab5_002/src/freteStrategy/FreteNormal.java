package freteStrategy;

public class FreteNormal implements FreteStrategy{
    @Override
    public double calcularfrete(double distanciaKM) {
        return ( 5 + 0.006*distanciaKM);
    }
}

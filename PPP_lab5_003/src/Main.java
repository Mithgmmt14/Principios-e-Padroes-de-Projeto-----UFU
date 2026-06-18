import observers.*;
import subject.*;

public class Main {
    public static void main(String[] args) {
        CET estacaoTempo = new CET();

        PrefeituraUberlandia prefeitura = new PrefeituraUberlandia();
        AeroportoUberlandia aeroporto = new AeroportoUberlandia();

        estacaoTempo.addObservers(prefeitura);
        estacaoTempo.addObservers(aeroporto);

        System.out.println("--- ATUALIZAÇÃO METEOROLÓGICA 01 ---");
        estacaoTempo.mudarMetricas(28.5f, 45.0f, 15.5f);

        System.out.println("\n--- ATUALIZAÇÃO METEOROLÓGICA 02 ---");
        estacaoTempo.mudarMetricas(32.0f, 20.0f, 75.0f);
    }
}
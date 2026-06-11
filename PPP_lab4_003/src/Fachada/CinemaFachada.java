package Fachada;

public class CinemaFachada {
    private final Amplificador amplificador = new Amplificador();
    private final Luzes luzes = new Luzes();
    private final Pipoqueira pipoqueira = new Pipoqueira();
    private final Projetor projetor = new Projetor();
    private final PlayerStreaming player = new PlayerStreaming();
    private final Telao telao = new Telao();

    public void assistirFilme(String filme) {
        System.out.println("\n=== PREPARANDO PARA ASSISTIR O FILME ===");
        pipoqueira.ligar();                     // 1. liga a pipoqueira
        pipoqueira.arrebentaPipoca();           // 2. rebenta pipoca
        luzes.desligar();                       // 3. desliga as luzes
        telao.abaixar();                        // 4. abaixa o telão
        projetor.ligar();                       // 5. liga o projetor
        amplificador.ligar();                   // 6. liga o amplificador
        amplificador.ajustarVolume(10);         // 7. ajusta o volume do som para 10 no amplificador
        player.ligar();                         // 8. liga o player
        player.play(filme);                     // 9. aperta o play indicando o filme que quer assistir
    }

    public void fimDoFilme() {
        System.out.println("\n=== FIM DO FILME ===");
        player.desligar();                      // Para o player
        amplificador.desligar();                // Desliga o sistema de som
        projetor.desligar();                    // Desliga o projetor
        telao.subir();                          // Recolhe a tela de projeção
        luzes.ligar();                          // Reacende as luzes
        pipoqueira.desligar();                  // Desliga a pipoqueira
    }
}

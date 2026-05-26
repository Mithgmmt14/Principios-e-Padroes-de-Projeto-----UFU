package Celular;

public class Galaxy8 implements Celular{

    @Override
    public void fazLigacao() {
        System.out.println("[Galaxy 8] Chamada de voz conectada.");
    }

    @Override
    public void tiraFoto() {
        System.out.println("[Galaxy 8] Foto tirada com a câmera de 12MP!");
    }

    @Override
    public void teste() {
        this.fazLigacao();
        this.tiraFoto();
    }
}

package Celular;

public class Galaxy20 implements Celular{
    @Override
    public void fazLigacao() {
        System.out.println("[Galaxy 20] Ligando via 5G e ativando cancelamento de ruído.");
    }

    @Override
    public void tiraFoto() {
        System.out.println("[Galaxy 20] Foto tirada com o Zoom de 64MP!");
    }

    @Override
    public void teste() {
        this.fazLigacao();
        this.tiraFoto();
    }
}

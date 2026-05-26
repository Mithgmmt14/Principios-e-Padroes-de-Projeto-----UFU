package Celular;

public class IPhoneS implements Celular{
    @Override
    public void fazLigacao() {
        System.out.println("[iPhone S] Iniciando chamada... Conectado via FaceTime.");
    }

    @Override
    public void tiraFoto() {
        System.out.println("[iPhone S] Foto tirada com o sensor iSight clássico.");
    }

    @Override
    public void teste() {
        this.fazLigacao();
        this.tiraFoto();
    }
}

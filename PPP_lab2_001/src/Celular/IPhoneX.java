package Celular;

public class IPhoneX implements Celular{
    @Override
    public void fazLigacao() {
        System.out.println("[iPhone X] Chamada iniciada. Viva-voz digital ativado.");
    }

    @Override
    public void tiraFoto() {
        System.out.println("[iPhone X] Foto tirada usando o Modo Retrato com desfoque de fundo!");
    }

    @Override
    public void teste() {
        this.fazLigacao();
        this.tiraFoto();
    }

}

package adapters;

import ave.*;
import pavao.Pavao;

public class AdapterPavaoAve implements Ave{
    private Pavao pavao;
    public AdapterPavaoAve(Pavao pavao){
        this.pavao = pavao;
    }
    @Override
    public void voar() {
        System.out.println("Pavao e incapaz de voar !!! ");
    }

    @Override
    public void emitirSom() {
        pavao.cantar();
    }
}

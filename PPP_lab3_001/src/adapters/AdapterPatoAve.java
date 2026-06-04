package adapters;

import ave.*;
import pato.Pato;

public class AdapterPatoAve implements Ave{
    private Pato pato;

    public AdapterPatoAve ( Pato pato ){
        this.pato = pato;
    }

    @Override
    public void voar() {
        pato.voar();
    }

    @Override
    public void emitirSom() {
        pato.grasnar();
    }
}

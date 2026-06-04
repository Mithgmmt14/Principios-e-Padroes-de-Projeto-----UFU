package adapters;

import notificador.*;
import email.*;

public class AdapterEmail implements Notificador {
    private Email email;
    public AdapterEmail ( Email email ){
        this.email = email;
    }
    @Override
    public void enviar(String destinatario, String conteudo) {
        String assuntoPadrao = "Alerta do Sistema";
        email.enviarEmail(destinatario, assuntoPadrao, conteudo);
    }
}

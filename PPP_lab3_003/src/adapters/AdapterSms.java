package adapters;

import notificador.*;
import sms.*;

public class AdapterSms implements Notificador {
    private ServicoSms sms;
    public AdapterSms ( ServicoSms sms ){
        this.sms = sms;
    }
    @Override
    public void enviar(String destinatario, String conteudo) {
        int numeroConvertido = Integer.parseInt(destinatario);
        sms.enviarMensagemTexto(numeroConvertido, conteudo);
    }
}

package sms;

public class ServicoSms implements Sms{
    @Override
    public void enviarMensagemTexto(int numeroCelular, String texto) {
        System.out.println("[SMS] Conectando à antena...");
        System.out.println("[SMS] Destinatário : " + numeroCelular);
        System.out.println("[SMS] Texto : " + texto);
    }
}

package email;

public class ServicoEmail implements Email {
    @Override
    public void enviarEmail(String enderecoEmail, String assunto, String corpo) {
        System.out.println("[EMAIL] Conectando ao servidor... ");
        System.out.println("[EMAIL] Destinatário: " + enderecoEmail);
        System.out.println("[EMAIL] Assunto: " + assunto);
        System.out.println("[EMAIL] Conteúdo: " + corpo);
    }
}

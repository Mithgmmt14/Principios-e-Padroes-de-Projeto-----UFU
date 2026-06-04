import adapters.*;
import email.*;
import notificador.*;
import sms.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("SISTEMA CENTRAL DE NOTIFICAÇÕES ");

        Notificador canalEmail = new AdapterEmail(new ServicoEmail());
        Notificador canalSms = new AdapterSms(new ServicoSms());

        System.out.println("=== Teste email.ServicoEmail.Email ===");
        canalEmail.enviar("cliente@provedor.com", "A sua compra foi aprovada!");

        System.out.println("\n--------------------------------------------------\n");

        System.out.println("=== Teste SMS ===");
        canalSms.enviar("999991234", "O seu código de verificação é 4829.");

        System.out.println("\n--------------------------------------------------\n");
    }
}

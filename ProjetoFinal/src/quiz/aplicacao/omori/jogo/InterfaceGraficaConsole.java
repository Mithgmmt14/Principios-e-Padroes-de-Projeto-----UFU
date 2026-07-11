package quiz.aplicacao.omori.jogo;

import quiz.framework.Result;
import quiz.framework.questionmanager.Alternative;
import quiz.framework.graphicaluserinterface.UserInterface;
import java.util.Scanner;
import java.util.List;

/**
 * Classe concreta responsável por definir a interface do usuário via console.
 * Faz uso da saída padrão (System.out) e leitura de dados (Scanner) para
 * gerenciar a interação do jogador com o jogo.
 * @author Matheus Vieira de Assis
 */

public class InterfaceGraficaConsole implements UserInterface {

    private final Scanner scanner = new Scanner(System.in);
    private List<Alternative> alternativasAtuais;

    @Override
    public void showQuestion(String statement) {
        System.out.println("\n=============================================");
        System.out.println("PERGUNTA: " + statement);
        System.out.println("=============================================");
    }

    @Override
    public void showAlternatives(List<Alternative> alternatives) {
        this.alternativasAtuais = alternatives;
        for (int i = 0; i < alternatives.size(); i++) {
            System.out.println((i + 1) + ") " + alternatives.get(i).text());
        }
    }

    @Override
    public Alternative readQuestion() {
        while (true) {
            System.out.print("Digite o número da resposta: ");
            String input = scanner.nextLine().trim();

            try {
                int escolha = Integer.parseInt(input);
                if (escolha > 0 && alternativasAtuais != null && escolha <= alternativasAtuais.size()) {
                    return alternativasAtuais.get(escolha - 1);
                }
            } catch (NumberFormatException e) {
                // Ignorado intencionalmente. A mensagem de erro padrão será exibida abaixo.
            }
            System.out.println("Opção inválida! Por favor, digite um número válido.");
        }
    }

    @Override
    public void showFinalResult(Result result) {
        System.out.println("\n=============================================");
        System.out.println("               RESULTADO FINAL               ");
        System.out.println("=============================================");
        System.out.println(" Acertos:         " + result.getHits());
        System.out.println(" Erros:           " + result.getErrors());
        System.out.println(" Pontuação Total: " + result.getFinalScore() + " pts");
        System.out.println("=============================================\n");
    }
}

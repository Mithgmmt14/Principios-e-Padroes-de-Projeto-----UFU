package quiz.aplicacao.programacao.jogo;

import quiz.framework.Result;
import quiz.framework.gerenciadorperguntas.Alternative;
import quiz.framework.graphicaluserinterface.UserInterface;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Classe concreta responsável por definir a interface do usuário via Java Swing.
 * Utiliza uma fila de bloqueio (LinkedBlockingQueue) para sincronizar os eventos
 * assíncronos de clique dos botões com o fluxo de execução síncrono do jogo.
 * @author Matheus Vieira de Assis
 */

public class InterfaceGraficaSwing implements UserInterface {
    private JFrame frame;
    private JLabel labelPergunta;
    private JPanel painelBotoes;
    private final LinkedBlockingQueue<Alternative> respostaSelecionada = new LinkedBlockingQueue<>(1);

    /**
     * Inicializa os componentes principais da janela gráfica.
     */
    public InterfaceGraficaSwing (){
        frame = new JFrame("Framework Quiz - Programação");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout(20, 20));
        frame.setLocationRelativeTo(null);

        labelPergunta = new JLabel("", SwingConstants.CENTER);
        frame.add(labelPergunta, BorderLayout.NORTH);

        painelBotoes = new JPanel();
        frame.add(painelBotoes, BorderLayout.CENTER);

        frame.setVisible(true);
    }
    @Override
    public void showQuestion(String statement) {
        SwingUtilities.invokeLater(() -> {
            labelPergunta.setText(statement);
            painelBotoes.removeAll();
            painelBotoes.revalidate();
            painelBotoes.repaint();
        });
    }

    @Override
    public void showAlternatives(List<Alternative> alternatives) {
        SwingUtilities.invokeLater(() -> {
            painelBotoes.removeAll();
            for (Alternative alt : alternatives) {
                JButton botao = new JButton(alt.text());
                botao.setFocusPainted(false);
                botao.addActionListener(e -> respostaSelecionada.offer(alt));

                painelBotoes.add(botao);
            }
            painelBotoes.revalidate();
            painelBotoes.repaint();
        });
    }

    @Override
    public Alternative readQuestion() {
        try {
            // Bloqueia a thread do jogo até que o jogador clique em um botão
            return respostaSelecionada.take();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override
    public void showFinalResult(Result result) {
        String mensagem = String.format(
                "FIM DE JOGO!\n\nAcertos: %d\nErros: %d\nPontuação Total: %d pts",
                result.getHits(), result.getErrors(), result.getFinalScore()
        );

        JOptionPane.showMessageDialog(frame, mensagem, "Resultado Final", JOptionPane.INFORMATION_MESSAGE);
        frame.dispose();
    }
}

package quiz.framework.gerenciadorperguntas;

/**
 * Record para o armazenamento de dados de uma alternativa.
 * Contendo o texto da opção e um valor booleano que indica se ela é a resposta correta ou não.
 * @author Matheus Vieira de Assis
 */

public record Alternative(String text, boolean value ) {}

package disciplina;

public class Disciplina {
    private int id;
    private String nome;
    private String descricao;

    public Disciplina (int id, String nome, String descricao){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome (){
        return this.nome;
    }
    public String toString (){
        return "[id]: " + id + "\n" + "[Nome]: " + nome + "\n" + "[Descrição]: " + descricao + "\n";
    }
}

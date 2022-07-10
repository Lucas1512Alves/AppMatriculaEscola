package appmatriculaescola;

public class Disciplina {
    public String nome;
    public String descricao;


    public Disciplina(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }


    @Override
    public String toString() {
        return "Disciplina{" + " Nome: " + nome + ", descrição: " + descricao + "}";
        }
}

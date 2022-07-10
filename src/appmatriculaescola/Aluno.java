package appmatriculaescola;

public class Aluno {
    public String nome;
    public String cpf;

    public Aluno(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString(){
        return "Aluno{" + "nome: " + nome + ", CPF" + cpf + "}";
    }
}
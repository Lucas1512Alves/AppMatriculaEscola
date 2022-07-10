package appmatriculaescola;

public class Matricula {
    public Aluno aluno;
    public Disciplina disciplina;
    public String status;

    public Matricula(Aluno aluno, Disciplina disciplina, String status) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.status = status;
    }

    public boolean alteraAluno(Aluno aluno) {

        if(this.status.equals("Finalizada")){
            System.out.println("A matricula já foi finalizada");
            return false;
        }

        this.aluno = aluno;
        return true;
    }

    public boolean alteraDisciplina(Disciplina disciplina) {

        if(this.status.equals("Finalizada")){
            System.out.println("A matrícula já foi finalizada.");
            return false;
        }

        this.disciplina = disciplina;
        return true;
    }

    public void finalizaMatricula(){
        this.status = "Finalizada";
    }

    @Override
    public String toString() {
        return "Matrícula{" + "Aluno: " + aluno + ", Disciplina: " + disciplina + ", Status: " + status + "}";
    }
}

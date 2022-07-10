package appmatriculaescola;

public class AppMatriculaEscola {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Lucas Alves", "111.222.333-45");
        Disciplina disciplina1 = new Disciplina("ESW", "Engenharia de Software");

        Matricula mat = new Matricula(aluno1, disciplina1, "Em aberto");

        System.out.println(mat.toString());

        /*Finaliza a Matrícula */
        mat.finalizaMatricula();

        Aluno aluno2 = new Aluno("teste", "555.444.333-21");

        /*Alteração de aluno */
        mat.alteraAluno(aluno2);

        System.out.println(mat.toString());
    }
}

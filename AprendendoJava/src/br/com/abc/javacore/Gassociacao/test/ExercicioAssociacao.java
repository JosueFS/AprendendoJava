package br.com.abc.javacore.Gassociacao.test;

import br.com.abc.javacore.Gassociacao.classes.Aluno;
import br.com.abc.javacore.Gassociacao.classes.Local;
import br.com.abc.javacore.Gassociacao.classes.Professor;
import br.com.abc.javacore.Gassociacao.classes.Seminario;

public class ExercicioAssociacao {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("TaelDev", 26);
        Aluno aluno2 = new Aluno("Juju", 24);
        Seminario seminario = new Seminario("Java - DevDojo");
        Professor prof = new Professor("William Suane", "Java");
        Local local = new Local("Rua Bertioga", "Xavantes");

        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);

        seminario.setLocal(local);
        seminario.setProfessor(prof);
        seminario.setAlunos(new Aluno[]{aluno, aluno2});

        Seminario semArray[] = new Seminario[1];
        semArray[0] = seminario;
        prof.setSeminario(semArray);

        seminario.print();
        prof.print();
        aluno.print();
        aluno2.print();
    }
}

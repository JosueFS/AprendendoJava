package br.com.abc.javacore.Bintrometodos.test;

import br.com.abc.javacore.Bintrometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante aluno = new Estudante();

        aluno.setNome("Josue F");
        aluno.setIdade(-1);
        aluno.setNotas(new double[]{9,9,9});

        aluno.dadosAluno();
        aluno.media();

        System.out.println(aluno.getNome());
        System.out.println(aluno.getIdade());
        System.out.println(aluno.isResultado());


    }
}
package br.com.abc.javacore.Bintrometodos.test;

import br.com.abc.javacore.Bintrometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "111.222.333-44";
        prof.matricula = "11122";
        prof.nome = "Marcos";
        prof.rg = "22222-0";

        Professor prof2 = new Professor();
        prof2.cpf = "111.222.333-11";
        prof2.matricula = "999";
        prof2.nome = "Antonio";
        prof2.rg = "7777-0";

        System.out.println("Professor 2: ");
        System.out.println();
        prof.imprimeProf();
        System.out.println();
        System.out.println("Professor 1: ");
        System.out.println();
        prof2.imprimeProf();
    }
}

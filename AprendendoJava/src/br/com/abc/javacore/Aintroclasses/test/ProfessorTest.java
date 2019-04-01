package br.com.abc.javacore.Aintroclasses.test;

import br.com.abc.javacore.Aintroclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor wSuane = new Professor();
        wSuane.nome = "William Suane";
        wSuane.matricula = "20180701";
        wSuane.rg = "22.260.910-9";
        wSuane.cpf = "123.456.789-01";
        wSuane.discp = "Java";

        Professor prof2 = new Professor();
        prof2.nome = "Marco Antonio";
        prof2.matricula = "20180702";
        prof2.rg = "11.151.801-8";
        prof2.cpf = "323.456.789-01";
        prof2.discp = "Arquitetura";

        wSuane = prof2;

        System.out.println("Dados do Professor");
        System.out.println("Nome: "+wSuane.nome);
        System.out.println("Matricula: "+wSuane.matricula);
        System.out.println("RG: "+wSuane.rg);
        System.out.println("CPF: "+wSuane.cpf);
        System.out.println("Disciplina: "+wSuane.discp);
        System.out.println("___________________________");
        System.out.println("Dados do Professor");
        System.out.println("Nome: "+prof2.nome);
        System.out.println("Matricula: "+prof2.matricula);
        System.out.println("RG: "+prof2.rg);
        System.out.println("CPF: "+prof2.cpf);
        System.out.println("Disciplina: "+prof2.discp);



    }
}

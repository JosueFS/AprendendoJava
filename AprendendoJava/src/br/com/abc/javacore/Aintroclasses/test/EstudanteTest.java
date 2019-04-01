package br.com.abc.javacore.Aintroclasses.test;

import br.com.abc.javacore.Aintroclasses.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante joao = new Estudante();
        joao.nome   = "Joao";
        joao.matricula = "1212";
        joao.idade = 15;

        System.out.println("Dados do Estudante");
        System.out.println("Nome: " + joao.nome);
        System.out.println("Matricula: "+joao.matricula);
        System.out.println("Idade: "+joao.idade);
    }
}

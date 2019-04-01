package br.com.abc.javacore.Bintrometodos.classes;

// Crie os seguintes atributos para essa classe
//Nome
//Matricula
//RG
//CPF
//Disciplina
//Crie uma classe de teste para preencher e imprimir os dados desse professor
public class Professor {
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;


    public void imprimeProf() {
        System.out.println(this.nome);
        System.out.println(this.matricula);
        System.out.println(this.rg);
        System.out.println(this.cpf);
    }
}
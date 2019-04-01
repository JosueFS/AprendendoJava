package br.com.abc.javacore.Isobrescrita.classes;

public class Pessoa {
    private String nome;
    private int idade;

    @Override
    public String toString(){
//        System.out.println("Nome: "+ this.nome + ", " +this.idade + " anos.");
        return "Nome: "+ this.nome + ", " +this.idade + " anos.";
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

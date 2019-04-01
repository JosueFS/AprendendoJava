package br.com.abc.javacore.Bintrometodos.classes;

public class Estudante {
    private String nome;
    private int idade;
    private double notas[];
    private boolean resultado;

    public void dadosAluno() {
        System.out.println("Nome: " + this.nome + ", " + this.idade + "Anos.");
        System.out.print("Notas: ");
        for (double num : this.notas) {
            System.out.print("[ " + num + " ]");
        }

    }

    public void media() {
        double med = 0;
        for (double num : this.notas) {
            med += num;
        }
        med = med / this.notas.length;
        System.out.println("\n----------------------");
        System.out.println("Média: " + med);
        if (med >= 6) {
            this.resultado = true;
            System.out.println("Aprovado");
        } else {
            this.resultado = false;
            System.out.println("Reprovado");
        }
    }
    //Getters and Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getNotas() {
        return notas;
    }

    public boolean isResultado(){
        return this.resultado;
    }

}
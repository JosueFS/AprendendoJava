package br.com.abc.javacore.Gassociacao.classes;

public class Professor {
    //Associações
    private Seminario[] seminarios;

    //Atributos de classe
    private String nome;
    private String especialidade;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor() {
    }

    public void print() {
        System.out.println("\n------------ Relatório de Professores ------------");
        System.out.println("Palestrante: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.print("Seminários participantes: ");
        if (seminarios != null && seminarios.length != 0) {
            for (Seminario title : seminarios) {
                System.out.println(title.getTitulo() + " ");
            }
            return;
        }
        System.out.println("Professor não vinculado a nenhum seminário.");
    }

    public Seminario[] getSeminario() {
        return seminarios;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminarios = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}

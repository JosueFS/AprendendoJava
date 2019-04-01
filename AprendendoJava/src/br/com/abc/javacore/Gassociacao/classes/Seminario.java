package br.com.abc.javacore.Gassociacao.classes;

public class Seminario {
    //Associações
    private Professor professor;
    private Aluno[] alunos;
    private Local local;

    //Atributos de classe
    private String titulo;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario() {
    }

    public void print() {
        System.out.println("\n------------ Relatório de Seminarios ------------");
        System.out.println("Titulo: " + this.titulo);
        if (this.professor != null) {
            System.out.println("Professor palestrante: " + this.professor.getNome());
        }else{
            System.out.println("Nenhum professor cadastrado para este seminario.");
        }

        if (this.local != null) {
            System.out.println("Local: " + this.local.getRua() + " No Bairro " + this.local.getBairro());
        } else {
            System.out.println("Nenhum local cadastrado para este seminario.");
        }
        if (alunos != null && alunos.length != 0) {
            System.out.println("Alunos Participantes:");
            for (Aluno pub : alunos) {
                System.out.println(pub.getNome());
            }
            return;
        }
        System.out.println("Nenhum aluno cadastrado.");
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}

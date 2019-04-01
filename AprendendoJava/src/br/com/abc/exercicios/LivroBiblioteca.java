package br.com.abc.exercicios;

import java.util.Date;

public class LivroBiblioteca extends Livro{
    int codigo;
    boolean disponibilidade = true;
    String aluno;
    Date dataEntrega;

    @Override
    public String toString() {
        return "LivroBiblioteca{" +
                "codigo=" + codigo +
                ", disponibilidade=" + disponibilidade +
                ", aluno='" + aluno + '\'' +
                ", dataEntrega=" + dataEntrega +
                ", nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginas +
                ", anoLancamento=" + anoLancamento +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}

package br.com.abc.exercicios;

public class Livro {
    String nome;
    String autor;
    int paginas;
    int anoLancamento;
    String isbn;

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginas +
                ", anoLancamento=" + anoLancamento +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}

package br.com.abc.exercicios;

public class LivroDeLivraria extends  Livro {
    int codigoLivro;
    String genero;
    double preco;

    @Override
    public String toString() {
        return "LivroDeLivraria{" +
                "codigoLivro=" + codigoLivro +
                ", genero='" + genero + '\'' +
                ", preco=" + preco +
                ", nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginas +
                ", anoLancamento=" + anoLancamento +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}

package br.com.abc.exercicios;

public class Exe013 {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;
        livro.paginas = 200;
        livro.isbn = "NB1111-200";

        System.out.println(livro);
    }
}

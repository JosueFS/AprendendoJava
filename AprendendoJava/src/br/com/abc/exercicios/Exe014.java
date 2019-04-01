package br.com.abc.exercicios;

public class Exe014 {
    public static void main(String[] args) {
        LivroDeLivraria l = new LivroDeLivraria();

        l.nome = "Mastering ExtJS";
        l.autor = "Loiane Groner";
        l.anoLancamento = 2015;
        l.paginas = 200;
        l.isbn = "NB1111-200";
        l.codigoLivro = 998;
        l.preco = 63.39;
        l.genero = "Didatico";

        System.out.println(l);
    }
}

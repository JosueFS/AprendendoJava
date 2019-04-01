package br.com.abc.exercicios;

import java.util.Date;

public class Exe015 {
    public static void main(String[] args) {
        LivroBiblioteca l = new LivroBiblioteca();

        l.nome = "Mastering ExtJS";
        l.autor = "Loiane Groner";
        l.anoLancamento = 2015;
        l.paginas = 200;
        l.isbn = "NB1111-200";
        l.disponibilidade = false;
        l.codigo = 998;
        l.dataEntrega = new Date();
        l.aluno = "Me";

        System.out.println(l);
    }
}

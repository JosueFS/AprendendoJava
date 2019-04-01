package br.com.abc.javacore.Isobrescrita.test;

import br.com.abc.javacore.Isobrescrita.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Yoda Fon");
        p.setIdade(222);
        System.out.println(p);

        Pessoa p2 = new Pessoa();
        p2.setNome("Lango Lango");
        p2.setIdade(999);
        System.out.println(p2);
    }
}

package br.com.abc.javacore.Hheranca.test;

import br.com.abc.javacore.Hheranca.classes.Endereco;
import br.com.abc.javacore.Hheranca.classes.Funcionario;
import br.com.abc.javacore.Hheranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
//        Pessoa p = new Pessoa("Gina");
        Endereco end = new Endereco();
        System.out.println("-----------------------------");
        Funcionario f = new Funcionario("Augusto");

        end.setBairro("Bairro 1");
        end.setRua("Rua 25");

//        p.setCpf("123.456.789-10");
//        p.setEndereco(end);

        f.setCpf("123.456.789-10");
        f.setSalario(15000);
        f.setEndereco(end);

//        p.imprime();
        System.out.println("-----------------------------");
//        f.imprime();
    }
}

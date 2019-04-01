package br.com.abc.javacore.Lclassesabstratas.test;

import br.com.abc.javacore.Lclassesabstratas.classes.Funcionario;
import br.com.abc.javacore.Lclassesabstratas.classes.Gerente;
import br.com.abc.javacore.Lclassesabstratas.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Vendedor v = new Vendedor("Marcos", "20102-2", 1500, 5000);
        Gerente g = new Gerente("Ana", "201202-2", 20000);
        v.calculaSalario();
        g.calculaSalario();
        System.out.println(v);
        System.out.println(g);

    }
}

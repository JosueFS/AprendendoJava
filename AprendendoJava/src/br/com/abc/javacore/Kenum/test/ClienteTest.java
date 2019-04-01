package br.com.abc.javacore.Kenum.test;

import br.com.abc.javacore.Kenum.classes.Cliente;
import br.com.abc.javacore.Kenum.classes.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente("Anna", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.APRAZO);
        System.out.println(TipoCliente.PESSOA_FISICA.getId());
        System.out.println(c);

    }
}

package br.com.abc.javacore.Eblocodeinicializacao.test;

import br.com.abc.javacore.Eblocodeinicializacao.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c= new Cliente();
        System.out.println("Quantidade de Parcelas possiveis: ");

        for(int parcela : c.getParcelas()){
            System.out.print(parcela + " ");
        }
    }
}

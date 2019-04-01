package br.com.abc.exercicios;

public class Exe016 {
    public static void main(String[] args) {
        ContaCorrente c = new ContaCorrente();
        c.numConta = 7777;
        c.Status = "Especial";
        c.saldo = 2000;
        c.limite = 50000;

        System.out.println(c);

    }
}

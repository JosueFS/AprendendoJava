package br.com.abc.exercicios;

public class ContaCorrente {
    int numConta;
    double saldo;
    String Status;
    double limite;

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numConta=" + numConta +
                ", saldo=" + saldo +
                ", Status='" + Status + '\'' +
                ", limite=" + limite +
                '}';
    }
}

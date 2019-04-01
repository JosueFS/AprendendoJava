package br.com.abc.javacore.Lclassesabstratas.classes;

public class Vendedor extends Funcionario {
    private double totalVendas;

    @Override
    public void imprime() {
        System.out.println("Dentro do metodo imprime Vendedor");

    }

    @Override
    public void calculaSalario() {
        this.salario = salario + (totalVendas * 0.05);
    }

    public Vendedor() {
    }

    public Vendedor(String nome, String clt, double salario, double totalVendas) {
        super(nome, clt, salario);
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
}

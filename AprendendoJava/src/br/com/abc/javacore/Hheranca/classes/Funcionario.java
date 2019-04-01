package br.com.abc.javacore.Hheranca.classes;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }

    static {
        System.out.println("Bloco de init. Estatico Funcionario");
    }

    {
        System.out.println("Bloco de init. de funcionario 1");
    }

    {
        System.out.println("Bloco de init. de funcionario 2");
    }

    public void imprime(){
        super.imprime();
        System.out.println("Salário: "+ this.salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento(){
        System.out.println("Eu, "+super.nome+" recebi o pagamento de R$"+this.salario);
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

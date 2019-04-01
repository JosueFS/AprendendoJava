package br.com.abc.cursoemvideo.Aula10;

public class Teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");

        p1.setIdade(20);
        p2.setIdade(23);
        p3.setIdade(38);
        p4.setIdade(19);

        p1.setSexo('M');
        p2.setSexo('F');
        p3.setSexo('M');
        p4.setSexo('F');

        p3.setSalario(2000.00f);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3.getSalario());
        System.out.println(p4);


//        p2.setCurso("Informática");
//        p3.setSalario(2500.75);
//        p4.setSetor("Estoque");



    }
}

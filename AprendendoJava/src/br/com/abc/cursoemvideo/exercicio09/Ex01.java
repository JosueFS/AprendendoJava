package br.com.abc.cursoemvideo.exercicio09;

public class Ex01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Josué F.", 27, 'M');
        Livro l1 = new Livro("O Monge e o Executivo", "James C. Hunter", 190, 1, false, p1);

        l1.detalhes();
        l1.getLeitor();

        l1.folhear();
                l1.avancarPag();
                l1.folhear();
                l1.fechar();
                l1.folhear();


    }
}

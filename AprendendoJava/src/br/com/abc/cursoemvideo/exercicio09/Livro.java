package br.com.abc.cursoemvideo.exercicio09;

import java.util.Random;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, int pagAtual, boolean aberto, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = pagAtual;
        this.aberto = aberto;
        this.leitor = leitor;
    }

    public void detalhes() {
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Páginas: " + this.getTotPaginas());
        System.out.println("Leitor: "+ this.getLeitor().getNome());
    }

    @Override
    public void abrir() {
        this.setAberto(true);
        System.out.println("Abrindo o Livro..");
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        System.out.println("Fechando o Livro..");
    }

    @Override
    public void folhear() {
        if (getAberto()==false) {
            setAberto(true);
        Random num = new Random();
        this.setPagAtual(num.nextInt(this.getTotPaginas()) + 1);
        System.out.println("Após folhear parou na página: "+this.getPagAtual());
        }else{
            System.out.println("Livro Aberto");
        }
    }

    @Override
    public void avancarPag() {
        if (getAberto()) {
            this.setPagAtual(this.getPagAtual() + 1);
            System.out.println("Página atual: " + this.getPagAtual());
        }else{
            System.out.println("Livro Fechado");
        }
    }

    @Override
    public void voltarPag() {
        if (getAberto()) {
        this.setPagAtual(this.getPagAtual() - 1);
        System.out.println("Página atual: "+this.getPagAtual());
    }else{
        System.out.println("Livro Fechado");
    }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
}

package br.com.abc.cursoemvideo.Aula11;

public class Bolsista extends Aluno {
    private int bolsa;

    public void renovarBolsa(){

    }

    @Override
    public void pagarMensalidade() {
        super.pagarMensalidade();
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}

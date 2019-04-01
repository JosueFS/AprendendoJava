package br.com.abc.javacore.Kenum.classes;

public class Cliente {
    public enum TipoPagamento {
        AVISTA, APRAZO
    }

    private String nome;
    private TipoCliente tipo;
    private TipoPagamento pgmto;

    public Cliente(String nome, TipoCliente tipo, TipoPagamento pgmto) {
        this.nome = nome;
        this.tipo = tipo;
        this.pgmto = pgmto;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo.getNome() +
                ", pgmto=" + pgmto +
                ", numero= "+ tipo.getTipo()+
                '}';
    }

    public TipoPagamento getPgmto() {
        return pgmto;
    }

    public void setPgmto(TipoPagamento pgmto) {
        this.pgmto = pgmto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }
}
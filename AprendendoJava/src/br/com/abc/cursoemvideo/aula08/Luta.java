package br.com.abc.cursoemvideo.aula08;

import java.sql.SQLOutput;
import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Métodos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            setAprovada(true);
            this.desafiado = l1;
            this.desafiante = l2;
            System.out.println("Luta marcada com sucesso.");
            System.out.println(this.desafiado.getNome() + " X " + this.desafiante.getNome());
        } else {
            setAprovada(false);
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();

            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();

            int vencedor = aleatorio.nextInt(3);
            System.out.println("==========# RESULTADO DA LUTA #==========");
            switch (vencedor) {
                case 0: //Empate
                    System.out.println("A luta empatou!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Desafiado vence
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //Desafiante vence
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }

            System.out.println("===============================================");
            this.desafiado.status();
            System.out.println("-----------------------------------------------");
            this.desafiante.status();
            System.out.println("===============================================");


        } else {
            System.out.println("A luta não pode acontecer!");
        }



    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}

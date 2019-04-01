package br.com.abc.cursoemvideo.Aula14;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[5];
        Gafanhoto g[] = new Gafanhoto[2];


        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        g[0] = new Gafanhoto("Josue F.", 27, "M", "Tael");
        g[1] = new Gafanhoto("Levi F.", 24, "M", "xlRuush");

        Visualizacao vis[] = new Visualizacao [3];
        vis[0] = new Visualizacao(g[0], v[0]);
        vis[1] = new Visualizacao(g[0], v[0]);
        vis[2] = new Visualizacao(g[0], v[2]);

        vis[0].avaliar(8);
        vis[1].avaliar(90.0f);
        vis[2].avaliar(9);

        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
        System.out.println(vis[2].toString());

        System.out.println(g[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println(v[0].toString());
    }


}

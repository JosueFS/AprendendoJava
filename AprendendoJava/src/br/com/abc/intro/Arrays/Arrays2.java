package br.com.abc.intro.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        //byte, short, int, long, float, double = 0
        //chat = '\u0000' ' ' (Espaço em branco)
        //boolean = false
        //reference = null
        String[] nomes = new String[4];
        nomes[0] =  "Naruto";
        nomes[1] =  "Goku";
        nomes[2] =  "Luffy";
        nomes[2] =  "Killua";

        for (int i=0; i<nomes.length; i++){
            System.out.println((i + 1) + ". Nome: " + nomes[i]);

        }


    }
}

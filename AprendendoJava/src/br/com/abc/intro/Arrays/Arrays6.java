package br.com.abc.intro.Arrays;

public class Arrays6 {
    public static void main(String[] args) {
        //int[] numeros1 = new int[5];
        //int[] numeros2 = {1,2,3,4,5};
        //int[] numeros3 = new int[]{1,2,3,4,5};

/*        int [][] dias = new int[3][];
        dias[0] = new int[2];
        dias[1] = new int[]{1,2,3};
        dias[2] = new int[4];*/

        int [][] dias = {{0,0},{1,2,3},{0,0,0,0}};

        for (int[] primeira : dias) {
            //System.out.println(primeira);

            for (int segunda : primeira) {
                System.out.println(segunda);


            }

        }

    }
}

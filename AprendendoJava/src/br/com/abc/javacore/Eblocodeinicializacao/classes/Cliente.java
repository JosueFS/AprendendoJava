package br.com.abc.javacore.Eblocodeinicializacao.classes;

public class Cliente {
    // 1 - Alocado espaço na memória para o objeto que será criado
    // 2 - Cada Atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    // 3 - Bloco de inicializacao é executado
    // 4 - Construtor é executado

    private int[] parcelas ;
    {
        parcelas = new int[100];
       for(int i = 1; i<=100; i++){
           parcelas[i-1] = i;
       }
    }

    public Cliente(){
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}

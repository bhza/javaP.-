package co.brunozanchietta;

public class Visibility {

    //PADRAO (DEFAULT)
    //variáveis aqui podem ser lidas por todo o programa
    public static int x;

    // public (visibilidade publica p/ os todos package)

    // private (visibilidade privada p/ todos os package)
    // somente a classe atual pode acessar essa variavel

    // PUBLIC PARA TODOS PODEREM ACESSAR

    public static void main(String[] args){
        // VISIBILIDADE PUBLIC = ESCOPO DO PROJETO
    }

    public static void sum(int a, int b){
        System.out.println(x);
    }
}

public class Main {
    public static void main(String[] args) {
        sum(10,15); // < argumentos
        sum(23,5);
        sum(43,3);
    }

    static void sum(int x , int y){

        //static void > declaração padrão ( falaremos depois sobre isso , mas precisa!)
        //sum > NOME DA FUNÇÃO , GERALMENTE USAMOS VERBOS PARA DEFINIR OQUE A FUNÇÃO FAZ!
        //() > PARENTESES USAMOS PARA DEFINIR O QUE CHEGARÁ NAQUELA FUNÇÃO
        //(tipo nomeDaVariavel)
        //{} > bloco de código que sera executado

        System.out.println("adição");
        System.out.println(x+y);
        System.out.println("subtração");
        System.out.println(x-y);
        System.out.println("Multiplicação");
        System.out.println(x*y);
        System.out.println("Divisão");
        System.out.println(x/y);
        System.out.println("Próximo bloco de código .");
        System.out.println("========######=======");
    }
}
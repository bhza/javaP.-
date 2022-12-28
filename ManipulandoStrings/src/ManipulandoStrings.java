public class ManipulandoStrings {
    public static void main(String[] args){
        String x = "Hellow world , This is a new World ! ";
        System.out.println(x.length()); // imprimi o tanto de caracteres;
        System.out.println(x + "concatenada"); // concatenar strings ;
        System.out.println(x.contains("new")); // ver se tem ocrrencia da palavra;
        System.out.println(x.indexOf("new")); // mostra o indice da ocorrencia;
        System.out.println(x.lastIndexOf("new"));// indice de quando ocorreu a ultima ocorrencia da palavra;
        System.out.println(x.toUpperCase()); // colocar em caixa alta
        System.out.println(x.toLowerCase()); // colocar em caixa baixa
        System.out.println(x.trim()); // tira o espaços
        System.out.println(x.substring(9)); // corta a string a partir do caractere número 9
        System.out.println(x.equals()); // comparar string
    }
}

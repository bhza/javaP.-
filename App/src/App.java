public class App {
    public static void main(String[] args){
        //ESCOPO DE VARIAVEIS

        if(true){
            int x= 10;//variavel local
        }else {
            x = 2;
        }
        System.out.println(x);
    }
}

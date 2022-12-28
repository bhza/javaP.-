// CONVERTENDO TIPOS

import java.util.Scanner;

public class Casting {
    public static void main(String[] args){
        // CONVERSAO DE TIPOS == CASTING

        double dd = 10.10;
        short ss = 32;

        Scanner scanner = new Scanner(System.in);
        /*int z = scanner.nextDouble();*/ // irá gerar um erro por que estou mandando pegar um valor double em uma variavel inteira;
        int z = (int) scanner.nextDouble(); // agora da certo porque fiz o (casting) e o programa foi obrigado a armazenar como int ****(int);

        System.out.println(z);

        /*float x = dd / ss;*/ // isso vai gerar um erro porque double é maior que float ;

        float x = (float) dd / ss ; // agora ira funcionar por causa do (casting) ****(float) colocado ali ;
        int y = (int) dd / ss; // convertendo para inteiro o resultado; *******(int);

        System.out.println(x);
        System.out.println(y);
    }
}

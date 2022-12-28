import java.util.Scanner;

public class ComprandoStrings {
    public static void main(String[] args){
        String password = "123456"; // 0010 // espaco de memoria
        System.out.println("Digite a sua senha:  ");

        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine(); //0100 espaço de memoria

        // == nao compara o conteudo , ele compara a referencia dos objetos

        /*System.out.println(password == pass);

        String x = "123456";
        String y = "123456";

        System.out.println(x == y);*/

        System.out.println(password.equals(pass));

    }
}

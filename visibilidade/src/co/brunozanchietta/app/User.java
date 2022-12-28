package co.brunozanchietta.app;

import co.brunozanchietta.Visibility; // agora conseguimos pegar a variavel
public class User {
    public static void print(){
        System.out.println(Visibility.x);// não conseguimos acessar porque ela esta no escopo padrão (default) somente classes ou arquivos que estejam na mesma estrutura de pacotes vao poder acessar essa propriedade

    }
}

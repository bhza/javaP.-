package co.brunozanchietta;

import co.brunozanchietta.Visibility;

public class House {
    public static void print(){
        System.out.println(Visibility.x);// conseguiu acessar porque a varialve x foi declarada como escopo de visibilidade padrão , quando nao escrevemos nada o escopo dele é escopo padrão.
    }
}

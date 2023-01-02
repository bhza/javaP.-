import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        // String[] = > Fixo
        // new ArrayList<String>() => Dinâmicos

        List<String> names = new ArrayList<>();
        // como adicionar elementos no array ?

        names.add("Nome 1");
        names.add("Nome 2");
        names.add("Nome 3");
        names.add("Nome 4");

        // como buscar elemento específico pelo indice get()
        for(int i=0;i< names.size(); i++){
            System.out.println(names.get(i));
        }

        // como buscar o indice a partir de um elemento
        int index = names.indexOf("Nome 2");
        System.out.println(index);

       System.out.println(names.indexOf("Nome 2"));

       // verifica se a lista esta vazia
       System.out.println(names.isEmpty());

       // verifica se a lista contém algum elemento
        System.out.println(names.contains("Nome 14"));

        // verifica o tamanho da lista
        System.out.println(names.size());

        // limpar de vez a lista ( remover todos os elementos )
        names.clear();


    }
}

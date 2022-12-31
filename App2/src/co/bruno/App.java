package co.bruno;

import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        /*User userA = new User();
        userA.firstName  = "Bruno";
        userA.lastName = "Henrique";
        userA.setLogged(true);

        String fullName = userA.getFullName();

        System.out.println(fullName);*/

        /*User userA = new User();
        userA.setFirstName("Bruno");

        System.out.println(userA.getFirstName());*/

        /*User[] users = new User[]{
                new User ("Bruno","Henrique"),
                new User ("Joao","Antonio"),
                new User ("Flavia","Silva")
        };*/

        /*for(int i=0;i< users.length;i++){
            User actual = new User();
            actual.setFirstName("Nome" + i);
            actual.setLastName("Sobrenome" + i);
            users[i] = actual;
        }*/

        ArrayList<User> users = new ArrayList<>();

        int i=0;
        while(i <10 ){
            User actual = new User ("Nome " + i, "Sobrenome " + i);
            users.add(actual);
            i++;
        }


        System.out.println(users.get(2).getFirstName());
        System.out.println(users.get(2).getLastName());

        User user11 = new User("Nome 11", "Sobrenome 11");
        users.add(user11);

        System.out.println(users.get(10).getFirstName());
        System.out.println(users.get(10).getLastName());


    }
}

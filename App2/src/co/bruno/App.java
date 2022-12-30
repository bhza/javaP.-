package co.bruno;

public class App {
    public static void main(String[] args){
        /*User userA = new User();
        userA.firstName  = "Bruno";
        userA.lastName = "Henrique";
        userA.setLogged(true);

        String fullName = userA.getFullName();

        System.out.println(fullName);*/

        User userA = new User();
        userA.setFirstName("Bruno");

        System.out.println(userA.getFirstName());


    }
}

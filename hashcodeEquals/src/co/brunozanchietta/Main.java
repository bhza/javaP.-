package co.brunozanchietta;

public class Main {
    public static void main(String[] args){
        User userA = new User ("Bruno","Henrique");
        User userB = new User ("Henrique","Bruno");

        System.out.println(userA);
        System.out.println(userA.hashCode());
        System.out.println(userB);
        System.out.println(userB.hashCode());
        System.out.println(userA.equals(userB));
    }
}

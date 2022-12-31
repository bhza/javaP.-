package co.bruno;

public class User {
    /*public String firstName;
    public String lastName;
    public String fullName;

    public Address address;

    public String getFullName(){
        return firstName + " " + lastName;
    }
    public boolean isLogeed;

    public void setLogged(boolean logged){
        isLogeed = logged;
    }*/


    //SETTER

    // GETTER :::

    // PROPRIEDADES CAMPO ( OBJETO)
    private String firstName;
    private String lastName;

    // CONSTRUTOR
    public User(String firstName, String lastName){
        this.firstName = firstName.toUpperCase();
        this.lastName = lastName;

    }
    public void setFirstName(String firstName){
        this.firstName = firstName.toUpperCase();
    }

    public void setLastName(String lasstName){
        this.lastName = lasstName.toUpperCase();
    }
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

}

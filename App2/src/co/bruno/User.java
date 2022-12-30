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
    private String firstName;
    private String lastName;

    public void setFirstName(String firstName){
        this.firstName = firstName.toUpperCase();
    }

    public String getFirstName(){
        return this.firstName;
    }
}

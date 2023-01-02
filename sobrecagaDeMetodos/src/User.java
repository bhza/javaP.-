public class User {
    private String firstname;
    private String lastname;

    public User(String firstname,String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public void setLastname(String lastname){
        this.firstname = lastname;
    }
    public String getLastname(){
        return lastname;
    }
    public String getFirstname(){
        return firstname;
    }

    public String output(){
        return firstname.toUpperCase() + " " + lastname.toUpperCase();
    }

    public String output(boolean showLastName){
        if(showLastName){
            return output();
        }

        return firstname;
    }
}

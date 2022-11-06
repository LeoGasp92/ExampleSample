package advanced.tasks.phone;

public class Contact {

    //Fields
    private String name;
    private String phoneNumber;

    //Constructor for creating new contact, but it will not give me something to work with straight away, that way the other methods coming bellow...

    public Contact(String name,String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    //Methods
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact (String name, String phoneNumber){
        return new Contact(name,phoneNumber);
    }
}








/*
public class Contact {

    //Fields
    private String name;
    private String phoneNumber;

    //Constructor
    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    //Methods
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    }

}
*/
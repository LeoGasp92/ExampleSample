package patterns.creational.builder;

public class User {
    private final String firstName; //required
    private final String lastName;//required
    private final int age;     //optional
    private final String phone; //optional
    private final String address; //optional

    private User(UserBuilder builder){ // we take in here class object +builder ex: if its Car class, then it will be CarBuilder
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.age = builder.age;
    this.phone = builder.phone;
    this.address = builder.address;
    }

    public String toString(){
        return "User : " + this.firstName + ", " + this.lastName + ", " + this.age + ", " + this.phone + "," + this.address;
    }


    //Creating Builder pattern class
    //Inner Class
    public static class UserBuilder{ // this is an inner class , class def inside another class
        private final String firstName;//required
        private final String lastName;//required
        private  int age;    //optional
        private  String phone; //optional//optional
        private  String address; //optional


        // Before the setter method withoud prefix we are going to build a constructor
        // Constructor
        //whenever we want to use user object we have to pass the required fields inside
        public UserBuilder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }
        //In this Builder pattern , the setter method has to return something
        public UserBuilder age(int age ){
            this.age = age;
            return this; // this is how it looks like
        }
        public UserBuilder phone(String phone){
            this.phone = phone;
            return this;
        }
        public UserBuilder address(String address){
            this.address = address;
            return this;
        }

        // method built that we call to create object of the user class
        public User build(){
            User user = new User(this);
            return user;
        }


    }

}






/*
public class User
{
    private final String firstName; // required
    private final String lastName;  // required
    private final int age;         // optional
    private final String phone;    // optional
    private final String address;  // optional

    private User(UserBuilder builder)
    {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }
    public String toString()
    {
        return "User : " + this.firstName + ", " + this.lastName + ", " +  this.age + ", " + this.phone + ", " + this.address;
    }

    //Inner Class
    // Creating builder pattern class
    public static class UserBuilder
    {
        private final String firstName; // required
        private final String lastName;  // required
        private  int age;         // optional
        private  String phone;    // optional
        private  String address;  // optional


        //Constructor
        public UserBuilder(String firstName,String lastName)
        {
            this.firstName = firstName; this.lastName = lastName;
        }
        public UserBuilder age(int age)
        {
            this.age = age;
            return this;
        }
        public UserBuilder phone(String phone)
        {
            this.phone = phone;
            return this;
        }
        public UserBuilder address(String address)
        {
            this.address = address;
            return this;
        }
        public User build ()
        {
            User user = new User (this);
            return user;
        }
    }

}
*/
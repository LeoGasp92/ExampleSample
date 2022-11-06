package patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Marco","Anconi")
                .age(40)
                .phone("+3912345")
                .address("Lago di Como")
                .build();
        System.out.println(user1);

        User user2 = new User.UserBuilder("Antonio","Banderas")
                .age(62)
                .phone("+398765432")
                //No address
                .build();
        System.out.println(user2);

        User user3 = new User.UserBuilder("Franco", "Prova").build();
        System.out.println(user3);




    }
}



/*
public class Main
{
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Robert","DeNiro")
                .age(79)
                .phone("+39340331122")
                .address("Lago di Como")
                .build();
        System.out.println(user1);

        User user2 = new User.UserBuilder("Antonio","Banderas")
                .age(62)
                .phone("912837645")
                //No address
                .build();
        System.out.println(user2);

        User user3 = new User.UserBuilder("Bob","test")
                .build();
        System.out.println(user3);
    }
}
*/
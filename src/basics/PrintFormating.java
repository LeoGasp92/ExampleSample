package basics;

public class PrintFormating {
    public static void main(String[] args) {


        // s - String
        // d - integers/decimals
        // f - float/double
        // c - char
        // b - boolean
        String name = "Bob";
        int age = 34 ;
        System.out.println("Hello " + name + " your age is " + age);
        System.out.printf("Hello %s your age is %d.\n",name,age);
        System.out.printf("Hello %1$s your age is %2$d, nice to meet you %1$s.\n",name,age);
        double height = 192.436534d;
        System.out.printf("%s is %.2fcm tall.\n", name,height);
    }
}

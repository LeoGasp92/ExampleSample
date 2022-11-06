package basics;

public class Methods {
    public static void main(String[] args) {
        printName("Leonardo");
        printName("Bob");
        System.out.println(returnName("Franco"));

        String introText = returnName("Luca");
        System.out.println(introText);

        personInfo("Simone",33);

        System.out.println(sum(15,5,50));
    }
    public static void printName(String name){
        System.out.println("Hello your name is " + name + ".");
    }

    public static String returnName(String name){
        String response = "Hello your name is " + name + ".";
        return response;
    }
    public static void personInfo (String name, int age){
        System.out.printf("Your name is %s and your age is %d years old.\n",name,age);
    }
    public static int sum (int num1,int num2, int num3){
        return num1+num2+num3;

    }
}

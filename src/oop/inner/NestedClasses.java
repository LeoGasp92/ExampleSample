package oop.inner;

class OuterClass{
    int num = 10;

    class InnerClass{
        int num = 5;
    }
}


public class NestedClasses {
    public static void main(String[] args) {

        OuterClass outerclass = new OuterClass();
        System.out.println("OuterClass Value : " + outerclass.num);

        OuterClass.InnerClass innerClass = outerclass.new InnerClass();
        System.out.println("InnerClass Value : " + innerClass.num );

    }
}










/*
class  OuterClass{
    int num = 10;

    class InnerClass{
        int num = 5;
    }
}
public class NestedClasses {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        System.out.println("OuterClass Value : " + outerClass.num );

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        // to use the inner class we create that sort of object like in the example below.
        System.out.println("InnerClass Value : " + innerClass.num);
    }
}
*/

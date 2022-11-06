package advanced.threads.firstExample;

public class main
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new Bread("One"));
        Thread t2 = new Thread(new Bread("Two"));
        Thread t3 = new Thread(new Bread("Three"));
        Thread t4 = new Thread(new Bread("Four"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

}













/*
public class main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Bread("one"));
        Thread t2 = new Thread(new Bread("two"));
        Thread t3 = new Thread(new Bread("Three"));
        Thread t4 = new Thread(new Bread("Four"));


        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
*/
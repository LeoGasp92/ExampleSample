package advanced.threads.secondexample;

public class Main
{
    public static void main(String[] args)
    {
        MyRunnable myRunnable = new MyRunnable();
        MyThread myThread = new MyThread();

        // Creating Thread Class Objects

        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myRunnable);

        t1.start();
        t2.start();
        try
        {
            t1.join();
            t2.join();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("ALl Done !");

    }
}


/*
public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        MyThread myThread = new MyThread();

        // Creating Thread class object

        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myRunnable);

        t1.start();
        t2.start();

        // wait to workers to die -lol-
        try{
            t1.join();
            t2.join();
        }catch(Exception e){
            e.printStackTrace();
        }

    System.out.println("All Done.");
    }
}
*/
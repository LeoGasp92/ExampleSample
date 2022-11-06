package advanced.threads.firstExample;

import java.util.Random;


public class Bread implements Runnable
{
    private String name;
    int time;
    Random r = new Random();

    public Bread(String name)
    {
        this.name = name;
        time = r.nextInt(10000);
    }

    @Override
    public void run()
    {
        try
        {
            System.out.printf("%s is a sleeping for %d\n",name,time );
            Thread.sleep(time);
            System.out.printf("%s is done\n", name);
        }
        catch(Exception e )
        {
            System.out.println("Test");
            e.printStackTrace();
        }
    }
}

/*
public class Bread implements Runnable{

    private String name;
    int time;
    Random r = new Random();

    public Bread(String name){
        this.name=name;
        time = r.nextInt(2000);
    }


    @Override
    public void run() {
        try{
            System.out.printf("%s is sleeping for %d.\n",name,time);
            Thread.sleep(time);// preferable to use while try/catch to give time for the threads to sleep then start working and excuting the code avoidning error or unfinished transaction.
            System.out.printf("%s is done.\n",name);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
*/
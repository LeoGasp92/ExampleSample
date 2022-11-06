package patterns.creational.singleton;



//Static Block handles exceptions,
//yet both the Eager and the static block sometimes are not the best practice as
// create the instance before its being used


public class StaticBlockSingleton
{
    private static StaticBlockSingleton instance;
    private StaticBlockSingleton(){}

    //Static block: Will allow us to execute the code without creating an object from the outside world ,
    // while the try catch inside of it to look for any kind of exception.
    static {
        try
        {
            instance = new StaticBlockSingleton();
        }
        catch (Exception e)
            {
            System.out.println(e);
        }
    }

    public static StaticBlockSingleton getInstance(){ // that the method to reach outside world
        return instance;
    }
}



/*
public class StaticBlockSingleton
{
    private static StaticBlockSingleton instance ;
    private StaticBlockSingleton() {}

    static // that's called static block as we are trying to catch the exception
    {
        try
        {
            instance = new StaticBlockSingleton();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public static StaticBlockSingleton getInstance()
    {
        return instance;
    }
}
*/
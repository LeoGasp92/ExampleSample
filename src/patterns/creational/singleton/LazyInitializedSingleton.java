package patterns.creational.singleton;

public class LazyInitializedSingleton
{
    private static LazyInitializedSingleton instance;
    private LazyInitializedSingleton(){}
    public static LazyInitializedSingleton getInstance() // we will create the instance in here instead
    {
        if(instance == null)
        {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

}
/*
public class LazyInitializedSingleton
{
    private static LazyInitializedSingleton instance ;
    private LazyInitializedSingleton(){}
    public static LazyInitializedSingleton getInstance()
    {
        if( instance == null)
        {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
*/

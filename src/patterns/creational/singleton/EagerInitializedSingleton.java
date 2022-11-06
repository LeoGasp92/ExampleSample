package patterns.creational.singleton;

public class EagerInitializedSingleton
{
    //Creating field that represents an instance of this class
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //Create private constructor to avoid calling it outside the class defination
    private EagerInitializedSingleton(){}

    //Create a method to get a class instance
    public static EagerInitializedSingleton getInstance(){
        return instance;
    }

}
/*
public class EagerInitializedSingleton
{
    // Creating field that represent instance of this class
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //Creating private constructor to avoid calling it outside the class definition
    private EagerInitializedSingleton(){}

    // Creating a method to get a class instance
    public static EagerInitializedSingleton getInstance()
    {
        return instance;
    }
}
*/
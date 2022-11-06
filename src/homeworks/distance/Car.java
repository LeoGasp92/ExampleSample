package homeworks.distance;

public class Car extends Vehicle
{
    boolean airCon ;
    public Car(float fuel, float fuelUsage, int passengers,boolean airCon)
    {
        super(fuel,fuelUsage,passengers);
        this.airCon = airCon;
    }

    public float maxDistance()
    {
        float airConAdd;
        if(airCon)
        {
            airConAdd =1.1f;
        }
        else
        {
            airConAdd = 1f;
        }
        float usage = fuelUsage * ( 1 + passengers * 0.05f);
        float maxDistance = fuel / (usage * airConAdd) * 100;
        return maxDistance;

    }
}








/*
public class Car extends Vehicle{

    boolean airConditioner;

    public Car(float fuel, float fuelUsage, int passenger,boolean airConditioner){
        super(fuel,fuelUsage,passenger); // passing the values of the Vehicle constructor
        this.airConditioner=airConditioner;
    }
    public float maxDistance (){ // using the 2nd constructor
        float airConditionerAdd;
        if(airConditioner){airConditionerAdd= 1.1f;}else{airConditionerAdd= 1f;}
        float usage = fuelUsage * (1 + passenger * 0.05f);
        float maxDistance = fuel / (usage*airConditionerAdd)*100;
        return maxDistance;

    }
}
*/
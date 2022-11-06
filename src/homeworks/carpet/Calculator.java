package homeworks.carpet;

//Composition example

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }
}









/*

public class Calculator {


    //creating logical data structor similar to String floor or String Carpet...
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }

}
*/
package basics;

public class ArrayExamples {
    public static void main(String[] args) {
        //Declare array that will store 3 elements of type String
        String[] names = new String[5];

        //Setting element values using each element's index
        names[0] = "Ben";
        names[1] = "Tom";
        names[2] = "Bob";
        names[3] ="Giovanni";
        names[4] = "Laura";

        //Getting values from array
        //System.out.println(names[4]);

        //Length
        //System.out.println(names.length);

        String [] dreamCars = new String[]{"Tesla","Lexus","Ferrari","GWagon"};

        for (int i=0 ; i < dreamCars.length; i++){
            //System.out.print(dreamCars[i] + " ");
        }
        for(String car : dreamCars){
            System.out.print("I Love ");
            System.out.println( car + " ");

        }

    }
}

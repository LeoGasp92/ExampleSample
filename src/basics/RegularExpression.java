package basics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {



        Pattern pattern = Pattern.compile("a+bcd");
        Matcher matcher = pattern.matcher("rab3cd");

        System.out.println(matcher.matches());
        System.out.println(matcher.find());



        // Any 3 lowercase letter or any number between 5-9
        System.out.println(Pattern.matches("[a-z5-9]{3}","8787"));

        // Example : 344-FDF
        //         : 531-FG
        //         : 879-FEFD

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Car Plate Number :");
        String inputCarPlate = scanner.nextLine();

        Pattern pattern1 = Pattern.compile("[0-9]{3}-[A-Z]{2,4}");
        Matcher matcher1 = pattern1.matcher(inputCarPlate);

        boolean correctPlateNumber = matcher1.matches();

        if(correctPlateNumber){
            System.out.println("Your inputted plate number is correct.");
        }else {
            System.out.println("Your inputted plate number is incorrect.");
        }
    }
}












/*
        System.out.println("Enter your car's plate number : ");
        String plateNumber = scanner.nextLine();

        Pattern pattern1 = Pattern.compile("[0-9]{3}-[A-Z]{2,4}");
        Matcher matcher1 = pattern1.matcher(plateNumber);

        boolean correctPlateNumber = matcher1.matches();

        if(correctPlateNumber){
            System.out.println("Your inputted plate number is correct.");
        } else {
            System.out.println("Your inputted plate number is incorrect");
        }

    }
}*/

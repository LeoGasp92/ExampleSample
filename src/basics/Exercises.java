package basics;//package com.company;

import java.util.Scanner;

public class Exercises {

    // 20 mins
    // Create a method that takes a series of input from the user and
    // returns the number of even numbers that were entered by the user.

    public static Scanner scanner = new Scanner(System.in); // Field


    public static int[] getArrayDataFromUser() {
        System.out.print("How many numbers do you want to enter =  ");
        int numOfNums = scanner.nextInt();
        int[] numbers = new int[numOfNums];

        //int[] numbers = new int[5]; // Use the number to create an array
        // or we can use this line in case we want to determine the lenght in advance.

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number : ");
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }


    public static String[] getStringArrayDataFromUser() {
        System.out.print("How many strings do you want to enter?: ");
        int numOfNums = scanner.nextInt(); //

        String[] words = new String[numOfNums]; // Use the number to create an array

        for (int i = 0; i < words.length; i++) {
            System.out.print("Enter a string: ");
            words[i] = scanner.next();
        }

        return words;
    }

    public static int getEvenNumberFromUser() {

        int[] numbers = getArrayDataFromUser(); // get data from the user
        int evenCounter = 0; // Initialize even counter
        for (int i = 0; i < numbers.length; i++) { // Loop through to filter the even numbers out.
            if (numbers[i] % 2 == 0) {
                evenCounter++;
            }
            // if the current number is divisible by 2, then increase
            // the evenCounter;
        }
        System.out.print("Even numbers count = ");


        return evenCounter;
    }

    //------------------------------------------------------------

    public static int getOddNumberFromUser() {
        int[] numbers = getArrayDataFromUser();
        int oddNumbers = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0)
                oddNumbers++;
        }
        System.out.print("Odd numbers count = ");
        return oddNumbers;
    }

    //------------------------------------------------------------

    public static int getSmallestNumber() {
        int[] numbers = getArrayDataFromUser();
        int smallestNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (smallestNumber > numbers[i]) {
                smallestNumber = numbers[i];
            }
        }
        System.out.print("\nSmallest Number is = ");
        return smallestNumber;
    }
    //------------------------------------------------------------

    public static int getVowelsCount() {
        System.out.print("Enter a String : ");
        String userInput = scanner.nextLine();
        int vowelCount = 0;
        char[] userStringArr = userInput.toLowerCase().toCharArray();
        // take string convert to lowercase then to char array.
        for (int i = 0; i < userStringArr.length; i++) {
            char currentChar = userStringArr[i];
            switch (currentChar) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelCount++;
                    break;
            }
        }
        return vowelCount;
    }
    // Next is a wrong answer while I was trying to solve it...

    /*
    public static int getVowelLetters() {

        int [] letters = getArrayDataFromUser();
        char vowelLetters = letters [0] ;

        for ( char v = 0 ; v < letters.length; v++ ){
            if ( char Letters != letters{'a','e','i','o','u'} ){
                System.out.println(vowelLetters);

            }

        }
        return vowelLetters;
        */
//------------------------------------------------------------
// Write 2 methods:
    // - that accepts a series of strings from the user and returns it as a string array
    // - Returns the average length from an array of strings passed into it.
    //??????????????????????

    /*
    public static int averageArrayLength() {
        String [] ....= getStringArrayFromUser();
        ???
        }
        */

    //------------------------------------------------------------

// Write a method to search through a series of strings entered by the user
    // and return true or a similar output if the string 'pancake' is found in the array.


    public static String[] getStringArrayMealOptionsDataFromUser() {
        System.out.print("How many meal options do you have ? ");

        int numOfNums = scanner.nextInt(); //

        String[] words = new String[numOfNums]; // Use the number to create an array

        for (int i = 0; i < words.length; i++) {
            System.out.print("Enter meal option: ");
            words[i] = scanner.next();
        }

        return words;
    }

    public static boolean getPancake() {
        String[] words = getStringArrayMealOptionsDataFromUser();
        for (String i : words) {
            if (i.equalsIgnoreCase("pancake")) {
                return true;
            }
        }
        return false;
    }


    /* public static Scanner getScanner() {
        int numOfStrings = scanner.nextInt();
        int[] numbers = new int[numOfStrings];

        return scanner;*/

    /*public static boolean  getBreakfastOptions(){
        System.out.println(" What do we have for breakfast for today ? ");
        int numOfNums = scanner.nextInt();
        String [] words = getStringArrayFromUser();
        String

       // String  dish = String.valueOf(scanner.nextInt());

        for ( int i = 0 ; i < words.length ; i++){

        if ( boolean boodish = String ["pancake"] );{
            System.out.println("True");

        } else {System.out.println( "Not Available" );};

        return breakfastOptions;
        */

    //------------------------------------------------------------


    // Write a method to return the percentage of odd numbers present in a dataset
    // entered by the user.

    // Get Input from the user - Scanner
    // Store the numbers somewhere - Array
    // I need to count the number of odd integers(numbers) - for Loop
    // Find out percentage of odd numbers
    // return the value

    public static double getOddNumberPercentage() {

        int[] numbers = getArrayDataFromUser();
        double oddNumbers = 0.0;
        //double percent = 0.0; // or we can add this variable here

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0)
                oddNumbers++;
        }
        double percent = (100 * oddNumbers / numbers.length);

        System.out.print("Odd numbers Percentage = ");
        return percent;
    }


//------------------------------------------------------------
    // Write a method that takes the length and width of a rectangle
    // from the user and finds and returns the perimeter

    // Get the values of the length and width from the user
    // find the perimeter of the rectangle, formula = 2(l+w)
    // return the perimeter


    public static double getRectanglePerimeter() {

        System.out.print("Enter length of basics.Rectangle = ");
        double length = scanner.nextDouble();

        System.out.print("Enter width of basics.Rectangle = ");
        double width = scanner.nextDouble();

        double perimeter = 2 * (length + width);
        System.out.print("Perimeter of basics.Rectangle = ");

        return perimeter;
    }

    // My old answer : Da Fuck is That !

//    public static int Perimeter () {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Provide length: ");
//        int length = scanner.nextInt();
//        System.out.print("Provide width: ");
//        int width = scanner.nextInt();
//
//        int perimeter =2*(length+width);
//
//        return perimeter;
//    }}

    // Another shitty answer of mine , fuck it !

//    public static String getWordorStringFromUser(){
//        Scanner scanner = new Scanner (System.in);
//
//        System.out.println("Type a word or a String"  );
//        String line = scanner.nextLine();
//        for (int i=0; i<line.length(); i++)
//        i--;
//        {
//        return line ;

//------------------------------------------------------------


    // Write a method to find the area of a circle with the radius received from a user.

    public static double getAreaOfCircle() {
        System.out.println("Enter Radius of Circle :");
        double radius = scanner.nextDouble();

        double areaOfCircle = Math.PI * radius * radius;


        return areaOfCircle;
    }

//------------------------------------------------------------
// Write a program that takes a word or a string from the user
    // and returns its reverse [9, 4, 9, 5]

    public static String getReverseWordOrString() {
        System.out.print("Enter a String : ");
        String word = scanner.next();
        String reverse = " ";


        char[] wordArray = word.toCharArray();
        for (int i = wordArray.length - 1; i > -1; i--) {
            reverse += wordArray[i];
        }
        return reverse;
    }


    //------------------------------------------------------------

    // Write a method to return 3rd smallest number from a set of 5 numbers entered
    // by the user. N.B: Do not use Arrays.sort()

    // Get data from the user
    // Store in an array
    // sort the array
    // Get the third item in the array
    // return it.


    public static int getThirdSmallestNumber() {

        int[] numbers = getArrayDataFromUser();

        int temp;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;

                }
            }
        }
        return numbers[2];
    }

//------------------------------------------------------------

    // Write a method that takes a set of 3 numbers from the user and returns true if
    // the addition of all three numbers is less than 100, else it returns false.

    // my answer vs Uche's
    public static boolean getSumOfThree() {
        int[] numbers = getArrayDataFromUser();
        int sumOfNumbers = 0;
        //int sumOfThree = 0 ;

        for (int i = 0; i < numbers.length; i++) {
            sumOfNumbers += numbers[i];

        }


        if (sumOfNumbers < 100) {
            System.out.println("Is the sum of numbers is less than 100 ?");
            return true;
        } else {
            System.out.println("Is the sum of numbers is less than 100 ?");
            return false;

        }
    }
    //Uche's answer


    public static boolean sumLessThan100() {
        System.out.println(" Enter the 3 numbers : ");

        int[] numbers = getArrayDataFromUser();
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            // System.out.print("Enter a number: ");
            sum += numbers[i];

        }
        if (sum < 100) {
            return true;
        } else {
            return false;
        }
    }

    //------------------------------------------------------------

// Write a method to find the square and square root of a sum of
    // 4 numbers entered by the user and return the difference
    // between the square and the square root

    // Get user input - array of 4 numbers
    // sum the numbers
    // Find the square and square root of the sum - Math.pow, Math.sqrt
    // return the difference

// ASK KARLIS WHY IT ASKS ME TO INSERT THE 4 DIGITS TWICE !!!

    /*public static double getSumOfNumbers (){

       int [] inputNumbers = getArrayDataFromUser();
       double sumOfInput = 0 ;

       for (int i = 0 ; i < inputNumbers.length ; i++){
       sumOfInput += inputNumbers[i];
       }
       return sumOfInput;
    }

    public static double getSquareSumOfNumbers () {
        double squareSumOfNumbers = Math.pow( getSumOfNumbers(),2);
        return squareSumOfNumbers;
    }

    public static double getSquareRootSumOfNumbers () {
        double SquareRootSumOfNumbers = Math.sqrt(getSumOfNumbers());
        return SquareRootSumOfNumbers;
    }

    public static double getDifferenceSqSqRt (){
        double differenceSqSqRt = getSquareSumOfNumbers() - getSquareRootSumOfNumbers();
        return differenceSqSqRt;
    }*/

    // Another Answer :
    public static double getSquareSquareRootSum() {

        int[] numbers = getArrayDataFromUser();
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double square = Math.pow(sum, 2);
        System.out.println("Square of Sum = " + square);

        double squareRoot = Math.sqrt(sum);
        System.out.println("Square root of Sum = " + squareRoot);

        double diffSqSqRt = Math.abs(square - squareRoot);


        return diffSqSqRt;
    }
//-------------------------------------------------------------------
    // Write 2 methods:
    // - that accepts a series of strings from the user and returns it as a string array
    // - Returns the average length from an array of strings passed into it.


    public static double getAverageLength() {
        String[] words = getStringArrayDataFromUser();
        double sum = 0;
        double averageLength = 0;
        // double averageLength = sumOfStringElements or frase.length of Strings/No of Strings
        for (String i : words) {
            sum += i.length();
        }
        averageLength = sum / words.length;
        return averageLength;
    }


//-------------------------------------------------------------------
//Write a method that takes a string from the user and returns true when
    // it is checked that the string entered by the user reads the same forwards and
    // backwards, in other words, it is a PALINDROME. N.B: Your method should not be case-sensitive
    // mama -> amam -> false
    // madam -> madam -> true
    // papa -> apap

// Answer 1

    public static String getPalindromeCheck() {

        System.out.print("Enter a String : ");
        String userInput = scanner.nextLine();

        String checkForward = " ";
        String checkBackwards = " ";
        char[] userStringArr = userInput.toLowerCase().toCharArray();

        for (int i = 0; i < userStringArr.length; i++) {
            checkForward += userStringArr[i];
        }
        for (int j = userStringArr.length - 1; j > -1; j--) {
            checkBackwards += userStringArr[j];
        }
        if (checkForward == checkBackwards) {
            System.out.print("This is a Palindrome");
        } else {
            System.out.print("This is not a Palindrome.");
        }

        System.out.print("\nThe Reverse of your string is : ");
        return checkBackwards;
    }

    // Answer 2
    public static boolean checkPalindrome() {
        System.out.print("Enter String : ");
        String word = scanner.nextLine();


        String reverseWord = new StringBuilder(word).reverse().toString();
        {
            System.out.println("The Reverse is : " + reverseWord);
        }

        if (word.equalsIgnoreCase(reverseWord)) {
            System.out.print("Reverse Matching - ");
        } else {
            System.out.print("Reverse Not Matching - ");
        }

        boolean comparison = word.equalsIgnoreCase(reverseWord);
        return comparison;

    }
    //Uche's Answer

    public static boolean palindrome() {

        // take user input
        System.out.print("Enter your word: ");
        String word = scanner.next();

        //changes user word to reverse
        String reverseWord = new StringBuilder(word).reverse().toString();
        {
            System.out.println("Word in reverse: " + reverseWord);
        }

        //checks if reverse string equals to the original input
        boolean compareWords = word.equalsIgnoreCase(reverseWord);
        {
            return compareWords;
        }
    }

    //----------------------------------------------------------------------
    //Write a method that accepts a year from the user and returns a result
    // informing the user if the year is a leap or not.
    // N.B: A leap year is a year that divisible by 4, or 400 but not necessarily just 100.
    // Year, 2016 => 2016 is a leap year.
    // Year, 2000 => 2000 is a leap
    // Year, 2200 => 2200 is not a leap year.

    // Answer 1

    public static boolean leapYearCheck() {

        System.out.print("Enter Year : ");
        int year = scanner.nextInt();

        boolean leapYear = (year % 4 == 0 || year % 400 == 0 || year % 100 == 0);
        //if (int year %4 == 0 && year%400 == 0 && year%100 == 0){}
        return leapYear;
    }


//Uche's Answer

    public static void getYearFromUser() {
        System.out.println("Enter year : ");
        int year = scanner.nextInt();
        //int leap = 0;
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println("This is a leap year");
        } else {
            System.out.println("This is not a leap year");
        }
        //return year;
    }

//    public static void int enteredYearFromUser () {
//        System.out.println("Enter year : ");
//        int year = scanner.nextInt();
//        if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
//            System.out.println("This is a leap year");
//        } else {
//            System.out.println("This is not a leap year");
//        }
//
//    }


    //---------------------------------------------------------

    // Task 1 from InteliJ //DONE
    //Task 2
//---------------------------------------------------------












}











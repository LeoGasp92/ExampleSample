package advanced.tasks.grocery;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

// TODO :
//  1. Deleting all items (GroceryList.java) - extra choice in menu
//  2. Add 5 default items to the list when running the program.
//  3. optional - Fix problem with option when entering any of the none mentioned numbers options (print "enter valid option.")
//  4. Use Regex validate that item you are adding , not to start with numbers and to consists only of any number of letters followed by numbers that can be followed by text again.
//

public class Main {
    private static Scanner scanner =new Scanner(System.in);

    public static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        System.out.println();
        groceryList.printGroceryList();

        while(!quit) {
            System.out.print("Enter your choice : ");

            try{
                choice = scanner.nextInt();

                scanner.nextLine(); // bug fix

                switch (choice){
                    case 0 :
                        printInstructions();
                        break;
                    case 1 :
                        groceryList.printGroceryList();
                        break;
                    case 2 :
                        addItem();
                        break;
                    case 3 :
                        modifyItem();
                        break;
                    case 4 :
                        removeItem();
                        break;
                    case 5:
                        searchForItem();
                        break;
                    case 6:
                        groceryList.deletAllItems();
                        break;
                    case 7:
                        quit = true;
                        break;
                    default:
                        //choice != Pattern.matches();
                        System.out.println("This is an invalid input, please try again. ");;
                        break;
                }
            }
        catch(InputMismatchException e) {
                System.err.println("Wrong input ! Please use Integers only !");
                scanner.nextLine(); //bug fix
            }
        }

    }

    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To delete all items from the list");
        System.out.println("\t 7 - To quit the application");
    }

    public static void addItem(){
        System.out.println("Please enter new grocery item : ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static  void modifyItem(){
        System.out.println("Enter item number : ");
        int itemNo = scanner.nextInt();
        scanner.nextLine(); // fixing input bug
        System.out.println("Enter replacement item : ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo-1,newItem);
    }

    public static void removeItem(){
        System.out.println("Enter Item Name : ");
        String itemName = scanner.nextLine();
        groceryList.removeGroceryItem(itemName);
    }

    public static void searchForItem(){
        System.out.println("Enter item to search for : ");
        String searchItem = scanner.nextLine();
        if(groceryList.searchItem(searchItem)){
            System.out.println(searchItem + " found in our grocery list.");
        }else{
            System.out.println(searchItem + " is not in the shopping list.");
        }
    }



}










/*
public class Main {

        private static Scanner scanner = new Scanner(System.in);
        private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();

        while (!quit){
            System.out.println("Enter your choice : ");
            choice = scanner.nextInt(); // bug fix
            scanner.nextLine();

            switch (choice){
                // print all options
                case 0: printInstructions();
                    break; // print all options
                case 1 : groceryList.printGroceryList();
                    break; // print grocery list
                case 2: addItem();
                    break; // add item
                case 3 : modifyItem();
                    break; // modify item
                case 4 : removeItem();
                    break; // remove item
                case 5 : searchForItem();
                    break; // search item
                case 6 : quit = true;
                    break; // quit
                default:
                    System.out.println("Input not valid. ");
            }

        }

    }


    public static void printInstructions(){
            System.out.println("\nPress");
            System.out.println("\t 0 - To print choice options");
            System.out.println("\t 1 - To print the list of grocery items");
            System.out.println("\t 2 - To add an item to the list");
            System.out.println("\t 3 - To modify an item in the list");
            System.out.println("\t 4 - To remove an item from the list");
            System.out.println("\t 5 - To search for an item in the list");
            System.out.println("\t 6 - To quit the application");
        }
        public static void addItem(){
            System.out.println("Please enter the grocery item : ");
            groceryList.addGroceryItem(scanner.nextLine());
        }

        public static void modifyItem(){
            System.out.println("Enter item number : ");
            int itemNo = scanner.nextInt();
            // fixing input bug
            scanner.nextLine();
            System.out.println("Enter Replacement item : ");
            String newItem = scanner.nextLine();
            groceryList.modifyGroceryItem(itemNo-1,newItem);
        }

        public static void removeItem (){
            System.out.println("Enter Item name : ");
            String itemName = scanner.nextLine();
            groceryList.removeGroceryItem(itemName);
        }

        public static void searchForItem(){
            System.out.println("Enter item to search for : ");
            String searchItem = scanner.nextLine();
            if(groceryList.searchItem(searchItem)){
                System.out.println("Found " + searchItem + " in our grocery list. ");
            }else {
                System.out.println(searchItem + " is not in the grocery list. ");
            }
        }
    }

*/

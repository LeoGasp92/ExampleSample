package advanced.tasks.grocery;

//TODO:
// 1. addGroceryItem
// 2. printGroceryList
// 3. removeGroceryItem
// 4. modifyGroceryItem
// 5. searchItem

import java.util.ArrayList;
import java.util.regex.Pattern;

public class GroceryList {

    // Field
    private ArrayList<String> groceryList = new ArrayList<>();

    //Constructor to print default grocery list items
    public GroceryList(){
        groceryList.add("Oats");
        groceryList.add("Milk");
        groceryList.add("Honey");
        groceryList.add("Berries");
        groceryList.add("Banana");

    }

    //Methods
    public void addGroceryItem (String item){
        if(checkIfValid(item)){
            groceryList.add(item);
        }else{
            System.out.println("Item name is not valid. please try again.");
        }
    }

    public void printGroceryList (){
        System.out.println("You have " + groceryList.size()+ " items in the shopping list.");
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + "." + groceryList.get(i) );
        }
    }

    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public void removeGroceryItem (String item){
        int position = findItem(item);
        if(position >= 0 ){
            groceryList.remove(position);
            System.out.println(item + " removed. ");
        }else {
            System.out.println("Item is not in the list. ");
        }
    }

    public void modifyGroceryItem(int position , String newItem){
        if(checkIfValid(newItem)){
            if(position >= 0 && position < groceryList.size()){
                System.out.println("Grocery item " + groceryList.get(position) + " was modified.");
                groceryList.set(position,newItem);
            }else {
                System.out.println("Item number is not valid. ");
            }
        }else{
            System.out.println("Item name format is not valid! please try again.");
        }
    }

    public boolean searchItem(String searchItem){
        if(findItem(searchItem) >= 0 ){
            return true;
        }else{
            return false;
        }
    }

    public void deletAllItems(){
        groceryList.clear();
        System.out.println("All items in the list deleted. ");
    }

    private boolean checkIfValid(String input){
        return Pattern.matches("[a-zA-Z ]+[0-9 ]*[a-zA-Z ]*",input); // the + means that it should have at least one or more as a start
    }





}

/*
public class GroceryList {
    //Field
    private ArrayList<String> groceryList = new ArrayList<>();

    //Methods
    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery List.");
        for (int i = 0 ; i < groceryList.size(); i++ ){
            System.out.println((i+1) + "." + groceryList.get(i));
        }
    }

    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public void removeGroceryItem (String item){
        int position = findItem(item);
        if ( position >= 0){
            groceryList.remove(position);
            System.out.println(item + "Removed.");
        }else {
            System.out.println(item + " is not in the list. ");
        }
    }

    public void modifyGroceryItem(int position, String newItem){
        if(position >= 0 && position < groceryList.size()){
            System.out.println("Grocery item " + groceryList.get(position)+ " was modified.");
            groceryList.set(position,newItem);
        }else{
            System.out.println("Item number is not valid. ");
        }
    }

    public boolean searchItem(String searchItem){
        if(findItem(searchItem) >= 0){
            return true;
        }else {
            return false;
        }
    }
}


*/
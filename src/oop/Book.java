package oop;

public class Book {

    //Fields
    public String title;       // Public Fields
    public String author;      // Public Fields
    private int numberOfPages; // Private Fields



    // basics.Methods


    public void setNumberOfPages(int numberOfPages) {
        if(isNumberOfPagesCorrect(numberOfPages)){
            this.numberOfPages = numberOfPages;

        } else{
            System.out.println("The provided number of " + numberOfPages + " pages is incorrect.");
        }
    }

    public int getNumberOfPages() {

        return numberOfPages;
    }

    private boolean isNumberOfPagesCorrect (int numberOfPages){
        // here numberOfPages is just a variable name
        // not related with numberOfPages mentioned up in the same page.

        return numberOfPages > 0;
    }

    public void printBookInfo(){
        System.out.println("Book Title :" + title);
        System.out.println("Auther : " + author);
        System.out.println("Number of pages : " + numberOfPages);
    }


}

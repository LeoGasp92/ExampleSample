package oop;

public class CallingBook {
    public static void main(String[] args) {

        //Create book Class object.
        Book book1= new Book();

        // Setting Fields values

        book1.title = "Sam's Letters to Jennifer.";
        book1.author = "James Patterson";
        book1.setNumberOfPages(350);


        // Calling fields values

        System.out.println("Book Title :" + book1.title);
        System.out.println("Auther : " + book1.author);
        System.out.println("Number of pages : " + book1.getNumberOfPages());

        // Another Printing example
        book1.printBookInfo();

        //Creating new instance of book class
        Book book2 = new Book();

        book2.title = "Macbeth";
        book2.author = "Shakspear";
        book2.setNumberOfPages(457);

        // Calling methods for the book2
        book2.printBookInfo();


    }
}

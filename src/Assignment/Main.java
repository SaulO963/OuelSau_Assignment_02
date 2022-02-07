/**
 * Name: Saul Ouellet
 * Date: Feb 7th 2022
 * Description: Program simulates a small library using custom Library and Book objects
 */

package Assignment;

/***
 * Main class
 */
public class Main {

    /***
     * It's a main, what else is there to say?
     * @param args supplies args to main
     */
    public static void main(String[] args){

        Library lib1 = new Library("120 Queen St.");
        Library lib2 = new Library("228 College St.");

        lib1.openHours();
        lib2.openHours();

        System.out.println("");

        lib1.printAddress();
        lib2.printAddress();

        System.out.println("");

        lib1.addBook(new Book("The DaVinci Code"));
        lib1.addBook(new Book("Le Petit Prince"));
        lib1.addBook(new Book("A Tale of Two Cities"));
        lib1.addBook(new Book("The Lord of the Rings"));

        lib1.borrow("The Lord of the Rings");
        lib1.borrow("The Lord of the Rings");

        System.out.println("");

        lib2.borrow("The Lord of the Rings");

        System.out.println("");

        lib1.allBooks();

        System.out.println("");

        lib2.allBooks();

        System.out.println("");

        lib1.returned("The Lord of the Rings");

        System.out.println("");

        lib1.allBooks();

        System.out.println("");

        lib2.allBooks();

    }

}

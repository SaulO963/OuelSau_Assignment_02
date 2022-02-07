package Assignment;

import java.util.ArrayList;

/***
 * Class functions as a Library, holding an address variable and an ArrayList object holding Book objects.
 */
public class Library {

    private String address;
    private ArrayList<Book> bookCollection;

    /***
     * Constructor for Library object. Requires string argument for construction. It also creates an
     * empty ArrayList
     * for Book objects.
     * @param address supplies Library object with String address
     */
    public Library(String address){
        this.address = address;
        bookCollection = new ArrayList<Book>();
    }

    /***
     * function is a setter for new library address
     * @param address supplies new address to library object
     */
    public void newAddress(String address){
        this.address = address;
    }

    /***
     * Function prints open hours of library. Isn't static since I include the address
     * of the library as well.
     */
    public void openHours(){
        System.out.println("Here are the open hours for " + address + ":");
        System.out.println("================================ OPEN HOURS =================================");
        System.out.println("=== Mon ====== Tue ====== Wed ====== Thu ====== Fri ====== Sat ====== Sun ===");
        System.out.println("| 9AM-5PM || 9AM-5PM || 9AM-5PM || 9AM-5PM || 9AM-5PM || 9AM-5PM || 9AM-5PM |");
        System.out.println("=============================================================================");
    }

    /***
     * String getter for address, also prints it
     * @return returns the address string
     */
    public String printAddress(){
        System.out.println("We are located at: " + address);
        return this.address;
    }

    /***
     * function adds a Book object to our Library's ArrayList object
     * @param book supplies function with Book object
     */
    public void addBook(Book book){
        this.bookCollection.add(book);
    }

    /***
     * function will search ArrayList object for a Book object with a name variable equal to the user
     * given name. If a match is found, it will check the Book's boolean available variable
     * and will either check out the book or print that it's not available.
     * @param name supplies function with name of book to look for
     */
    public void borrow(String name){
        for(Book b:bookCollection){     //Iterate thru collection of books, do we even have it?
            if(b.getName() == name){        //if find book with given name
                if(b.isAvailable()) {           //check availability, then proceed accordingly
                    b.borrow();
                    System.out.println(b.getName() + " has been checked out.");
                    return;
                }
                else{
                    System.out.println(b.getName() + " is not currently available.");
                    return;
                }
            }
        }
        System.out.println("No book in our collection matches that title"); //name not found
    }

    /***
     * function will search ArrayList object for a Book object with a name variable equal to the user
     * given name. If a match is found, it will check the Book's boolean available variable
     * and will either check it back in, or do nothing and suggest that its not their book.
     * @param name supplies function with name of book to look for
     */
    public void returned(String name){

        for(Book b:bookCollection){     //Iterate thru collection of books, do we even have it?
            if(b.getName() == name){        //if find book with given name
                if(b.isAvailable()) {           //check availability, then proceed accordingly
                    System.out.println("This book was not checked out, it is not ours.");
                    return;
                }
                else{
                    b.returned();
                    System.out.print(b.getName() + " has been returned.");
                    return;
                }
            }
        }
        System.out.println("No book in our collection matches that title"); //not found.
    }

    /***
     * function will iterate through ArrayList object and print list of available Books.
     */
    public void allBooks(){
        System.out.println("Here is a list of all available books at " + address + ":");
        for(Book b: bookCollection){
            if(b.isAvailable())
                System.out.println(b.getName());
        }
        if(bookCollection.isEmpty()){
            System.out.println("No books in this library what the heck.");
        }
    }

}

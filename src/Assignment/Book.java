package Assignment;

/***
 * Class functions as a Book with a name and an availability check.
 */
public class Book {

    private String name;
    private boolean available = true;

    /***
     * Constructor for Book object. Requires String name argument for construction. Assumes
     * book is available from the get go.
     * @param name supplies Book object with name of book.
     */
    public Book(String name){
        this.name = name;
        //this.available = true;
    }

    /**
     * function is a getter for name
     * @return returns the current String name of Book.
     */
    public String getName(){    //getter for name
        return this.name;
    }

    /***
     * function is a getter for availability of book.
     * @return returns boolean of the status of the availability of the book
     */
    public boolean isAvailable(){  //getter for available
        return this.available;
    }

    /***
     * function is a setter for available variable (checks out book from library)
     */
    public void borrow(){
        this.available = false;
    }

    /***
     * function is a setter for available variable (returns book to library)
     */
    public void returned(){
        this.available = true;
    }

}

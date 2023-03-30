
import java.util.*; 

/**
 * The Library class is a subclass of the Building class, and it adds specifics about the building concerning it being a library. 
 */
public class Library extends Building {

  private Hashtable<String, Boolean> collection; 

  /**
   * Constructor for the Library Class and clarifies that building is the super class.
   * @param name The name of the building.
   * @param address The address. 
   * @param nFloors How many floors there are. 
   */
    public Library(String name, String address, int nFloors) {
      super(name, address,nFloors); 
      this.collection = new Hashtable<String, Boolean>(); 
      System.out.println("You have built a library: 📖");
    }

    /**
     * Updates the hashtable of the book collection when a title is put on.
     * @param title The title of the book. 
     */
    public void addTitle(String title) {
      this.collection.put(title, true); 
    }

    /**
     * Updates the hashtable of the book collection when a book is checked out of the library.
     * @param title The title of the book. 
     * @return The String version of the updated hashtable of the book collection when a book is removed permanently from the collection. 
     */
    public String removeTitle(String title) {
       this.collection.remove(title); 
       return(this.collection.toString())
       ; 

    }

    /**
     * Updates the value to false for the corresponding key to signify that a book has been checked out of the collection.
     * @param title The book being checked out. 
     */
    public void checkOut(String title){
      this.collection.replace(title, true, false); 
    }

    /**
     * Updates the value to true for the corresponding key to signify that a book has been returned to the collection.
     * @param title The title of the book being returned.
     */
    public void returnBook(String title){
      this.collection.replace(title, false, true); 
    }

    /**
     * Checks to see if the book is in the library collection.
     * @param title The title of the book. 
     * @return The boolean value if the title is in the collection at all (checked out or currently in the collection). 
     */
    public boolean containsTitle(String title){
      return(this.collection.contains(title)); 
    }

    /**
     * Checks to see if a book is checked out or not. 
     * @param title The title of the book. 
     * @return The boolean value for the key.
     */
    public boolean isAvailable(String title) {
      return(this.collection.get(title)); 
    }

    /**
     * Prints out the collection list.
     */
    public void printCollection(){
      System.out.println(this.collection); 
    }


    /**
     * Main method/creates new instance of the Library class. 
     * @param args
     */
    public static void main(String[] args) {
      new Library("Public Lib", "Happy Street", 3);
    }
  
  }
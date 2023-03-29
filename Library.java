/* This is a stub for the Library class */
import java.util.*; 

public class Library extends Building {

  private Hashtable<String, Boolean> collection; 


    public Library(String name, String address, int nFloors) {
      super(name, address,nFloors); 
      this.collection = new Hashtable<String, Boolean>(); 
      System.out.println("You have built a library: 📖");
    }

    public void addTitle(String title) {
      this.collection.put(title, true); 
    }

    public String removeTitle(String title) {
       this.collection.remove(title); 
       return(this.collection.toString()); 

    }

    public void checkOut(String title){
      this.collection.replace(title, true, false); 
    }

    public void returnBook(String title){
      this.collection.replace(title, false, true); 
    }

    public boolean containsTitle(String title){
      return(this.collection.contains(title)); 
    }

    public boolean isAvailable(String title) {
      return(this.collection.get(title)); 
    }

    public void printCollection(){
      System.out.println(this.collection); 
    }


  
    public static void main(String[] args) {
      new Library();
    }
  
  }
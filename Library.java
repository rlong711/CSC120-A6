/* This is a stub for the Library class */
import java.util.*; 

public class Library extends Building {

  private Hashtable<String, Boolean> collection; 


    public Library(String name, String address, int nFloors) {
      super(name, address,nFloors); 
      this.collection = new Hashtable<String, Boolean>(); 
      System.out.println("You have built a library: 📖");
    }

  
    public static void main(String[] args) {
      new Library();
    }
  
  }
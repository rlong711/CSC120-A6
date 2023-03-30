
import java.util.*; 

/**
 * The class House is a subclass of the Building class, and it adds specfics to the building that it would uniquely have a house. 
 */
public class House extends Building {
  
  private ArrayList<String> residents; 
  private boolean hasDiningRoom; 

  /**
   * Constructor for the House Class. 
   * @param name Name of the building (from the super class Building).
   * @param address The address of the building (from the super class Building.)
   * @param hasDiningRoom Boolean value for wheter the house has a dining room or not.
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name,address,nFloors); 
    this.hasDiningRoom = hasDiningRoom; 
    this.residents = new ArrayList<String>();
    System.out.println("You have built a house: 🏠");
  }

  /**
   * Accessor for wheter or not the house has a dining room or not. 
   * @return Boolean Value for if there is a dining room or not. 
   */
  public boolean hasDiningRoom() {
    return(this.hasDiningRoom); 
  }; 

  /**
   * Accessor for the number of residents in the house. 
   * @return Integer for the number of residents. 
   */
  public int nResidents() {
    return(this.residents.size()); 
  }; 

  /**
   * Adds the resident's name to the Array List of residents. 
   * @param name The name of the resident moving in. 
   */
  public void moveIn(String name) {
    this.residents.add(name); 
  }

  /**
   * Removes the resident's name from the Array List of residents. 
   * @param name The name of the resident moving out. 
   * @return The updated Array List of current residents after one is removed. 
   */
  public String moveOut(String name) {
    this.residents.remove(name);
    StringBuffer sb = new StringBuffer(); 
    for (String s : residents) {
      sb.append(s); 
      sb.append(" ");
    }
    String residentsString = sb.toString();  
    return (residentsString); 
  }

  /**
   * Returns boolean value for wheter or not the person is a resident and in the Array List of residents.
   * @param person The person who is either a resident or not. 
   * @return The boolean value for if the resident's name is in the Array List of residents.
   */
  public boolean isResident(String person){
    return(this.residents.contains(person)); 
  } 

  /**
   * Main method that calls a new instance of the House Class. 
   * @param args The name of the building, the address of the building, and how many floors there are. 
   */
  public static void main(String[] args) {
    new House("The Plaza", "161 21st", 8, true);
  }

}
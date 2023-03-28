/* This is a stub for the House class */
import java.util.*; 

public class House extends Building {

  private ArrayList<String> residents; 
  private boolean hasDiningRoom; 

  public House(String name, String address, int nFloors) {
    super(name,address,nFloors); 
    this.hasDiningRoom = hasDiningRoom; 
    this.residents = new ArrayList<String>();
    System.out.println("You have built a house: 🏠");
  }

  public boolean hasDiningRoom() {
    return(this.hasDiningRoom); 
  }; 
  public int nResidents() {
    return(this.residents.size()); 
  }; 

  public void moveIn(String name) {
    this.residents.add(name); 
  }

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

  public boolean isResident(String person){
    return(this.residents.contains(person)); 
  } 


  public static void main(String[] args) {
    new House();
  }

}
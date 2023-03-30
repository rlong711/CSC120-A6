/**
 * This class is the superclass for the House, Cafe, and Library class. Adds details about the building that are not specific to the type of building it is. 
 */
public class Building {

    protected String name = "<Name Unknown>";
    protected String address = "<Address Unknown>";
    protected int nFloors = 1;

    /**
     * Constructor for the building class. 
     * @param name The name of the building. 
     * @param address The address of the building. 
     * @param nFloors The number of floors in the building. 
     */
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }
    /**
     * Acessor for the name of the building. 
     * @return The ane of the building. 
     */
    public String getName() {
        return this.name;
    }

    /**
     * Accessor for the address of the building. 
     * @return The address of the building. 
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Acessor for the number of floors 
     * @return The number of floors. 
     */
    public int getFloors() {
        return this.nFloors;
    }

    /**
     * Converts the inforamtion about the building (name/address/number of floors) to one string that reads like a sentence. 
     * @return A string of the information about the building. 
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    /**
     * The main method/creates new instances of Building Class. 
     * @param args Name of the building, the address, and the number of floors. 
     */
    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}

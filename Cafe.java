/* This is a stub for the Cafe class */
public class Cafe extends Building {

    private int nCoffeeOunces; 
    private int nSugarPackets; 
    private int nCreams;
    private int nCups; 

    public Cafe(String name, String address, int nFloors) {
        super(name,address,nFloors); 
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets; 
        this.nCreams = nCreams; 
        this.nCups = nCups;  

        System.out.println("You have built a cafe: ☕");
    }

    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        this.nCoffeeOunces -= size; 
        this.nSugarPackets -= nSugarPackets; 
        this.nCreams -= nCreams; 
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCups){
        this.nCoffeeOunces += nCoffeeOunces; 
        this.nSugarPackets += nSugarPackets; 
        this.nCups += nCups; 
    }
    
    public static void main(String[] args) {
        new Cafe();
    }
    
}

public class Ship extends Vehicle implements Sailing {

    // Properties with getters and setters
    private double fuelNeeds;
    private double distance;

    // constructor
    public Ship(String name) {
        super(name);
    }


    // getters and setters

    public double getFuelNeeds() {
        return fuelNeeds;
    }

    public void setFuelNeeds(double fuelNeeds) {
        this.fuelNeeds = fuelNeeds;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

        // Method: Stop() void

    public void Stop(){
        System.out.println("ship has stopped");
    }

    // Fuelconsumption method as declared by superclass Vehicle
    public double calculateFuelConsumption() {

        System.out.println( "The fuel consumption for this ship is: " + this.fuelNeeds);
        return (this.getFuelNeeds());

    }

// implementing the Moving - Vehicle implements interface moving so all its children must too

    public void go() {
        System.out.println("Ship is ready to go SwoooOOOshhhh!");

    }

    public void stop(){
        System.out.println("Ship is coming to a stop...");
    }


    // implementing interface Sailing

    public void dock() {

        System.out.println("The ship has arrived at the dock, begin loading");

    }
}




public class Plane extends Vehicle implements Flying{

    // properties

   protected double fuelNeeds;
   protected double distance;

// constructor for plane
    public Plane(String name) {
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



// implementing the Moving - Vehicle implements interface Moving so all its children must too

    @Override
    public void go() {
        System.out.println("Plane is ready to go, reach for the sky!");

    }

    public void stop(){
        System.out.println("Plane has stopped...");
    }

    // Methods specific to plane

    @Override
    public void takeOff() {
        System.out.println("3,2,1...The plane has taken off");

    }

    @Override
    public void land() {
        System.out.println("The plane has landed");
    }

    @Override
    public void callAirControl() {
        System.out.println("Plane has called air control");

    }


    // implementing fuel  interface commanded by superclass Vehicle
    @Override
    public double calculateFuelConsumption() {

        System.out.println( "The fuel consumption for this plane is: " + this.fuelNeeds);
        return (this.getFuelNeeds());
    }
}

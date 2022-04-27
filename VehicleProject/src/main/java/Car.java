public  class Car extends Vehicle {

    // properties

    private double fuelNeeds;
    private double distance;

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

    // constructor - how to create a car
    public Car(String name) {
        super(name);}

        // getters and setters



// implementing fuel interface commanded by superclass Vehicle

        public double calculateFuelConsumption() {
            System.out.println( "The fuel consumption for this car is: " + this.fuelNeeds);
            return (this.getFuelNeeds());}



     // implementing Moving interface commanded by superclass Vehicle
//     Vehicle implements interface moving so all its children must too

    @Override
    public void go() {
        System.out.println("The car is ready to go vroooooom!");
    }

    @Override
    public void stop() {
        System.out.println("The car has come to a stop...");

    }

}


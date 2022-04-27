public class RaceCar extends Car {

   private double fuelNeeds;

    //Method-- constructor

    public RaceCar(String name) {
        super(name);
    }



    // getters and setters

    @Override
    public double getFuelNeeds() {
        return fuelNeeds;
    }

    @Override
    public void setFuelNeeds(double fuelNeeds) {
        this.fuelNeeds = fuelNeeds;
    }
}

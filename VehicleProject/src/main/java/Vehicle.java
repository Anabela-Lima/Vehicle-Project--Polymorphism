public abstract class Vehicle implements Fuel, Moving {

    // UML part 2 Properties ------------------------------------------------------------------------------------------

    protected String name;


    // UML part 3 Behaviours/ Methods --------------------------------------------------------------------------------


    // constructor  Method 1 - Vehicle(String) - vehicle

    public Vehicle(String name) {
        this.name = name;
    }

    // getters and setters


    public void setName(String name) {
        this.name = name;
    }


    // Method 2 toString() String

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}

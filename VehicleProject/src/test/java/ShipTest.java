import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {

    // declaring variable to be used;
    private Ship ship1;


@BeforeEach
    void setup() { ship1 = new Ship("Ana's Ship");}


    @Test
    void fuelConsumptionShip() {
        ship1.setFuelNeeds(100000.0);
        assertEquals(100000.0, ship1.calculateFuelConsumption());
    }


    @Test
    void goShip() {

        // call the method
        ship1.go();
    }

    @Test
    void stopShip() {
        // call the method
        ship1.stop();
    }

    @Test
    void dockShip() {
        // call the method
        ship1.dock();
    }


}

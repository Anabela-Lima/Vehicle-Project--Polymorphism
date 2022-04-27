import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {


    // declare the variable
    private Car car1;

    @BeforeEach

    void setup (){car1 = new Car( "Ana's Mercedes");}

    @Test
    void calculateFuelConsumption() {
        car1.setFuelNeeds(274643.0);
        assertEquals(274643.0, car1.calculateFuelConsumption());
    }

    @Test
    void go() {
        car1.go();
    }

    @Test
    void stop() {
        car1.stop();
    }
}
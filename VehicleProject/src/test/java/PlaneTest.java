import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlaneTest {

//    declare object
    private Plane plane;

//    @BeforeEach
//    // Before each test add this line in - so we do not have to repeat creating plane object
//    Plane plane1 = new Plane("Ana's plane");

//
//     creating first test for Plane:
//
//     1. testing that the Plane can go

    @Test

    public void planeGo(){
        Plane plane1 = new Plane("Ana's plane");
        plane1.go();
    }
//     2. testing that the Plane can fly- interface methods
    @Test
    public void planeFlying(){
        Plane plane1 = new Plane("Ana's plane");
        plane1.land();
        plane1.takeOff();
        plane1.callAirControl();
    }

    //  3. testing that the plane can call method of fuel consumption

    @Test
    public void planeFuelNeeds(){
        Plane plane1 = new Plane("Ana's plane");
        plane1.setFuelNeeds(36000);         // setting value for fuel needs
        assertEquals(36000.0, plane1.calculateFuelConsumption());  //plane1 calls for
                                                                            // calculateFuelConsumption() method

    }






    }

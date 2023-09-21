package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionalTest {
    @Test
    public void testThatIHaveAnAirConditionalTest(){
        AirConditional lgAirConditional = new AirConditional();
        lgAirConditional.turnOn(false);

        lgAirConditional.turnOn(true);

        boolean inUse = lgAirConditional.getIsOn();
        assertTrue(inUse);
    }

    @Test
    public void testThatAirConditionalCanBeTurnedOffTest(){
        AirConditional lgAirConditional = new AirConditional();
        lgAirConditional.turnOn(true);
        assertTrue(true);

        lgAirConditional.turnOn(false);

        boolean newUse = lgAirConditional.getIsOn();
        assertFalse(newUse);
    }


    @Test
    public void testThatAirConditionalCanIncreaseTemperatureTest(){
        AirConditional lgAirConditional = new AirConditional();
        lgAirConditional.turnOn(false);
        lgAirConditional.turnOn(true);
        assertTrue(true);

      lgAirConditional.increaseTemperature();
      lgAirConditional.increaseTemperature();
      lgAirConditional.increaseTemperature();
      lgAirConditional.increaseTemperature();
      lgAirConditional.increaseTemperature();
      lgAirConditional.increaseTemperature();
      lgAirConditional.increaseTemperature();
      lgAirConditional.increaseTemperature();
      lgAirConditional.increaseTemperature();
      lgAirConditional.increaseTemperature();
      lgAirConditional.increaseTemperature();
      lgAirConditional.increaseTemperature();
      lgAirConditional.increaseTemperature();
      lgAirConditional.increaseTemperature();
      lgAirConditional.increaseTemperature();
      lgAirConditional.increaseTemperature();

        assertEquals(16, lgAirConditional.getTemperature());
    }

    @Test
    public void testThatAirConditionalCanDecreaseTemperatureTest(){
        AirConditional lgAirConditional = new AirConditional();
        lgAirConditional.turnOn(false);
        lgAirConditional.turnOn(true);
        assertTrue(true);

        lgAirConditional.increaseTemperature();
        lgAirConditional.increaseTemperature();
        assertEquals(2, lgAirConditional.getTemperature());

        lgAirConditional.decreaseTemperature();
        assertEquals(1, lgAirConditional.getTemperature());

    }

}

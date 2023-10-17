package chp6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureConversionTest {

    @Test
    public void testThatTemperatureConversionCanCalculateAKelvinTemperatureTest(){
         double number = 100;
         double numberKelvin = TemperatureConversion.CalculateKelvinTemperature(number);
         assertEquals(373.15, numberKelvin);
    }

    @Test
    public void testThatTemperatureConversionCanCalculateACelsiusTemperatureTest(){
        double number = 310.15;
        double numberToCelsius = TemperatureConversion.CalculateCelsiusTemperature(number);
        assertEquals(37, numberToCelsius);
    }
}

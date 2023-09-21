package chp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HeartRateTest {
    private HeartRate heartRate;
    @BeforeEach
    public void setUp(){
        heartRate = new HeartRate("Danny", "Adeyemi", 5,9,2000);
    }

    @Test
    public void testThatHeartRateExitsTest(){
      HeartRate heartRate = new HeartRate("Danny", "Adeyemi", 9,9,2000);
      assertNotNull(heartRate);
    }

    @Test
    public void testThatHeartRateCanSetFirstNameTest(){
        heartRate.setFirstName("Danny");
        assertEquals("Danny", heartRate.getFirstName());
    }

    @Test
    public void testThatHeartRateCanSetLastNameTest() {
        heartRate.setLastName("Adeyemi");
        assertEquals("Adeyemi", heartRate.getLastName());
    }

    @Test
    public void testThatHeartRateHasDateOfBirthTest(){
        heartRate.setDateOfBirth(5,9,2000);
        assertEquals("5/9/2000",heartRate.getDateOfBirth());
    }

    @Test
    public void testThatHeartRateCanCalculatePersonAgeTest(){
        heartRate.setDateOfBirth(5,9,2000);
        assertEquals(23, heartRate.getCalculateAge());
    }

    @Test
    public void testThatHeartRateCanCalculatePersonMaximumHeartRateTest(){
        heartRate.setDateOfBirth(5,9,2000);
        assertEquals(197, heartRate.MaximumHRT());
    }

    @Test
    public void testThatHeartRateCanCalculatePersonTargetHeartRateTest(){
        heartRate.setDateOfBirth(5,9,2000);
        assertEquals(98.5, heartRate.TargetHRT());
    }

    @Test
    public void testThatHeartRateCanCalculatePersonTargetHeartRate2Test() {
        heartRate.setDateOfBirth(5, 9, 2000);
        assertEquals(167.45, heartRate.TargetHRT1());
    }

}


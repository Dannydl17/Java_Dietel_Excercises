package chp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HealthProfileTest {
    private HealthProfile healthProfile;
    @BeforeEach
    public void setUp(){
        healthProfile = new HealthProfile("Danny","Adeyemi","Male",5, 9,2000,54,2.205);
    }

    @Test
    public  void testThatHealthProfileExistTest(){
        HealthProfile healthProfile = new HealthProfile("Danny","Adeyemi","Male",5, 9,2000,54,2.205);
        assertNotNull(healthProfile);
    }

    @Test
    public  void testThatHealthProfileCanSetFirstNameTest(){
        healthProfile.setFirstName("Danny");
        assertEquals("Danny", healthProfile.getFirstName());
    }

    @Test
    public void testThatHealthProfileCanSetLastNameTest(){
        healthProfile.setLastName("Adeyemi");
        assertEquals("Adeyemi", healthProfile.getLastName());
    }

    @Test
    public void testThatHealthProfileCanSetGenderTest(){
        healthProfile.setGender("Male");
        assertEquals("Male", healthProfile.getGender());
    }


    @Test
    public void testThatHealthProfileHasDateOfBirthTest(){
        healthProfile.setDateOfBirth(5,9,2000);
        assertEquals("5/9/2000",healthProfile.getDateOfBirth());
    }


    @Test
    public void testThatHealthProfileCanSetHeightInInchesTest(){
        healthProfile.setHeightInInches(54);
        assertEquals(54,healthProfile.getHeightInInches());
    }


    @Test
    public void testThatHealthProfileCanSetWeightInPoundsTest(){
        healthProfile.setWeightInPound(2.205);
        assertEquals(2.205,healthProfile.getWeightInPound());
    }

    @Test
    public void testThatHealthProfileCanCalculatePersonAgeTest(){
        healthProfile.setDateOfBirth(5,9,2000);
        assertEquals(23, healthProfile.getCalculateAge());
    }

    @Test
    public void testThatHealthProfileCanCalculatePersonMaximumHeartRateTest(){
        healthProfile.setDateOfBirth(5,9,2000);
        assertEquals(197, healthProfile.MaximumHRT());
    }

    @Test
    public void testThatHealthProfileCanCalculatePersonTargetHeartRateTest(){
        healthProfile.setDateOfBirth(5,9,2000);
        assertEquals(98.5, healthProfile.TargetHRT());
    }

    @Test
    public void testThatHealthProfileCanCalculatePersonTargetHeartRate2Test() {
        healthProfile.setDateOfBirth(5, 9, 2000);
        assertEquals(167.45, healthProfile.TargetHRT1());
    }

    @Test
    public void testThatHealthProfileCanCalculateBmiTest() {
        double bmi = healthProfile.CalculatedBmi(2.205,54);
        assertEquals(0.5315895061728395, bmi);
    }

}

package AssigmentNdClassWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    public void createTimeTest(){
        Time time = new Time(1,0,0);
        assertEquals(1, time.getHour());
        assertEquals(0, time.getMinute());
        assertEquals(0, time.getSecond());
    }

    @Test
    public void createTimeWithInvalidHourTest(){
       assertThrows(IllegalArgumentException.class, ()-> new Time(25,0,0));
    }

    @Test
    public void createTimeWithInvalidMinutesTest(){
       assertThrows(IllegalArgumentException.class, ()-> new Time(25,67,0));
    }

    @Test
    public void createTimeWithInvalidSecondTest(){
        assertThrows(IllegalArgumentException.class, ()-> new Time(25,67,99));
    }

    @Test
    public void testTryAndCatch(){
        Time time;
        try{
            // code that may misbehave
            time = new Time(56,32,23);
        }
        catch (IllegalArgumentException ex){
            // what to do if the specified error happens
            time = new Time(0,0,0);
        }
    }
}
package chp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ClockTest {
    private Clock clock;
    @BeforeEach
    public void setUp() {

        clock = new Clock(2,15,5);
    }

    @Test
    public void testThatClockCanBeCreated(){
        Clock clock = new Clock(2,15,5);
        assertNotNull(clock);
    }

    @Test
    public void testThatClockCanSetHour(){
         clock.setHour(2);
        assertEquals(2,clock.getHour());
    }

    @Test
    public void testThatClockCanSetMinutes(){
        clock.setMinutes(15);
        assertEquals(15,clock.getMinutes());
    }

    @Test
    public void testThatClockCanSetSecondTest(){
        clock.setSecond(5);
        assertEquals(5,clock.getSecond());
    }

    @Test
    public void testThatClockCanDisPlayTimeTest(){
        String timeDisplay;
        timeDisplay = clock.getDisplayTime(2,15,5);
        System.out.print(timeDisplay);
        assertEquals("02:15:05", timeDisplay);
    }
}
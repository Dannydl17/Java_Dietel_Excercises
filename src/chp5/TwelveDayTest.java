package chp5;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TwelveDayTest {
    @Test
    public void testThatTwelveDayOfChristmasHasATitleTest(){
        TwelveDay twelveDay = new TwelveDay();
        twelveDay.setTitle("The twelve day of christmas");
        String expected = "The twelve day of christmas";
        assertEquals(expected, twelveDay.getTitle());
    }

    @Test
    public void testThatTwelveDayOfChristmasCanReadVerseOneATest(){
        TwelveDay twelveDay = new TwelveDay();
        int number = Integer.parseInt(twelveDay.song(1));
        assertEquals(1, number);
    }
}















































//        TwelveDay.song()


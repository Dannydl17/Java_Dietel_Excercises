package tdd;

import chp6.GuessNumbers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessNumbersTest {
    GuessNumbers guessNumbers;
    @BeforeEach
    public void setUp(){
        guessNumbers = new GuessNumbers();
    }

    @Test
    public void testThatGuessingGameExist(){
        guessNumbers = new GuessNumbers();
        assertNotNull(guessNumbers);
    }

}
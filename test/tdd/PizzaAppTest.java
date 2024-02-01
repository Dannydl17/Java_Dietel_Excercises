
package tdd;

import assignments.PizzaApp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaAppTest {

    @Test
    public void testThatPizzaAppCanCollectTheNumberOfSuperHungryPeople(){
        int number = 4;
        assertEquals(16 , PizzaApp.collectNumberOfSuperPerson(number));
    }

    @Test
    public void testThatPizzaAppCanCollectTheNumberOfHungryPeople(){
        int number = 3;
//        int num = PizzaApp.collectNumberOfHungryPerson(number);
        assertEquals(6, PizzaApp.collectNumberOfHungryPerson(number));
    }

    @Test
    public void testThatPizzaAppCanCollectTheNumberOfClassicPeople(){
        int number = 5;
//        int num = PizzaApp.collectNumberOfClassicPerson(number);
        assertEquals(5, PizzaApp.collectNumberOfClassicPerson(number));
    }

    @Test
    public void testThatPizzaAppCanAddTheNumberOfSlices(){
        int numberOfSuper = 4;
        int numberOfHungry = 3;
        int numberOfClassic = 5;
        assertEquals(27, PizzaApp.calculateNumberOfSlices(numberOfSuper, numberOfHungry, numberOfClassic));
    }

    @Test
    public void testThatPizzaAppCanCountTheNumberOfBoxesTest(){
        int number = 27;
        assertEquals(4, PizzaApp.calculateNumberOfBoxes(number));
    }
}

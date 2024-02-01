package turtleGraphics;

import org.junit.jupiter.api.Test;
import turtleApp.Turtle;
import turtleApp.TurtlePosition;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TurtleTest {

    @Test
    public void test_That_Turtle_Position_Are_Zero_By_Default_Test(){
        Turtle turtle = new Turtle();
        TurtlePosition position = new TurtlePosition(0,0);
        TurtlePosition anotherPosition = new TurtlePosition(0,0);
        assertEquals(position, turtle.getCurrentPosition());
    }
}

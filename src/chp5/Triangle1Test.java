package chp5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Triangle1Test {
    @Test
    public void testThatTriangleCanBePrintedTest(){
        Triangle1 triangle1 = new Triangle1();
        int number = triangle1.printingTriangle(4);
        assertEquals(4, number);
    }
}

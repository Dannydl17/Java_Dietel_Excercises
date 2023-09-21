package chp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarTest {
    private Car car;
    private Car car1;
    @BeforeEach
    public void setUp() {
        car = new Car("ToyotaCamry",2000,5000.0);
        car1 = new Car("BMW",2001,4000.0);
    }

    @Test
    public void testThatCarCanBeCreated(){
        Car car = new Car("ToyotaCamry",2000,5000.0);
        assertNotNull(car);
        Car car1 = new Car("BMW",2001,4000.0);
        assertNotNull(car1);
    }

    @Test
    public void testThatCarHasAModel(){
        car.setModel("ToyotaCamry");
        assertEquals("ToyotaCamry", car.getModel());

        car1.setModel("BMW");
        assertEquals("BMW", car1.getModel());
    }

    @Test
    public void testThatCarHasAYear(){
        car.setYear(2000);
        assertEquals(2000, car.getYear());

        car1.setYear(2001);
        assertEquals(2001, car1.getYear());
    }

    @Test
    public void testThatCarYearCannotBeChange(){
        car.setYear(2000);
        car.setYear(2001);
        assertEquals(2000, car.getYear());

        car1.setYear(2001);
        car1.setYear(2002);
        assertEquals(2001, car1.getYear());
    }

    @Test
    public void testThatCarHasAPrice(){
        car.setPrice(5000.0);
        assertEquals(5000.0, car.getPrice());

        car1.setPrice(4000.0);
        assertEquals(4000.0, car1.getPrice());
    }

    @Test
    public void testThatCarCannotSetNegativePrice(){
        car.setPrice(5000.0);
        car.setPrice(-5000.0);
        assertEquals(5000.0, car.getPrice());

        car1.setPrice(4000.0);
        car1.setPrice(-4000.0);
        assertEquals(4000.0, car1.getPrice());
    }

    @Test
    public void testThatCarCanCalculateDiscountTest(){
        double discountCalculate = car.getDiscountCalculate(0.05,5000.0);
        assertEquals(4750.0, discountCalculate);

        double calculatedAmount = car1.getDiscountCalculate(0.07,4000.0);
        assertEquals(3720.0, calculatedAmount);
    }
}

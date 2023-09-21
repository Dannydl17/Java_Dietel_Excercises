package tdd;

import assignments.LogisticsService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogisticServiceTest {
   @Test
    public void testThatLogisticServiceCanCalculateWageForTheDayTest(){
       int delivery = 20;
       int amount = LogisticsService.calculateRiderPayment(delivery);
       assertEquals(8200, amount);
   }
}

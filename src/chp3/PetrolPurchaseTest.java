package chp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PetrolPurchaseTest {
    private PetrolPurchase petrolPurchase;
    @BeforeEach
    public void setUp(){
        petrolPurchase = new PetrolPurchase("Sabo", "petrol",500,10.0,0.05);
    }

    @Test
    public void testThatPetrolPurchaseCanBeCreated(){
        PetrolPurchase petrolPurchase = new PetrolPurchase("Sabo", "petrol",500,10.0,0.05);
        assertNotNull(petrolPurchase);
    }

    @Test
    public void testThatPetrolPurchaseHasALocation(){
        petrolPurchase.setLocation("Sabo");
        assertEquals("Sabo", petrolPurchase.getLocation());
    }

    @Test
    public void testThatPetrolPurchaseHasATypeTest(){
        petrolPurchase.setType("petrol");
        assertEquals("petrol", petrolPurchase.getType());
    }

    @Test
    public void testThatPetrolPurchaseHasManyType(){
        petrolPurchase.setType("diesel");
        assertEquals("diesel", petrolPurchase.getType());
    }

    @Test
    public void testThatPetrolPurchaseHasQuantity(){
        petrolPurchase.setQuantity(500);
        assertEquals(500, petrolPurchase.getQuantity());
    }

    @Test
    public void testThatPetrolPurchaseHasPerLitre(){
        petrolPurchase.setPricePerLitre(10.0);
        assertEquals(10.0, petrolPurchase.getPricePerLitre());
    }

    @Test
    public void testThatPetrolPurchaseCannotSetNegativePerLitre(){
        petrolPurchase.setPricePerLitre(10.0);
        petrolPurchase.setPricePerLitre(-10.0);
        petrolPurchase.setPricePerLitre(-20.0);
        assertEquals(10.0, petrolPurchase.getPricePerLitre());
    }

    @Test
    public void testThatPetrolPurchaseHasPercentageDiscount(){
        petrolPurchase.setPercentageDiscount(0.05);
        assertEquals(0.05, petrolPurchase.getPercentageDiscount());
    }

    @Test
    public void testThatPetrolPurchaseHasGetPurchaseAmount(){
        petrolPurchase.calPurchaseAmount(500,10.0,0.05);
        double netPurchaseAmount = petrolPurchase.calPurchaseAmount(500,10.0,0.05);
        assertEquals(4999.95, netPurchaseAmount);
    }
}

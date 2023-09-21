package chp5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ModifiedCompoundTest {
    @Test
    public void testThatModifiedCompoundCanCalculateInterestTest(){
        ModifiedCompound modifiedCompound = new ModifiedCompound();
        double newAmount = Double.parseDouble(String.valueOf(modifiedCompound.calculateModifiedInterest(1000.0,0.06)));
        assertEquals(1790.85, newAmount);
    }

    @Test
    public void testThatModifiedCompoundCanCalculateInterestTwiceTest(){
        ModifiedCompound modifiedCompound = new ModifiedCompound();
        double newAmount = Double.parseDouble(String.valueOf(modifiedCompound.calculateModifiedInterest(1000.0,0.07)));
        assertEquals(1967.15, newAmount);
    }
}

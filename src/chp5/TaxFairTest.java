package chp5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaxFairTest {
    @Test
    public void testThatTaxFairCanCalculateExpensesTest(){
        TaxFair taxFair = new TaxFair();
        double newTax = taxFair.calculateExpenses(100.0,100.0,100.0,100.0,100.0,100.0,100.0);
        assertEquals(700.0, newTax);
    }

    @Test
    public void testThatTaxFairCanCalculateTaxFairTest(){
        TaxFair taxFair = new TaxFair();
        double taxFairAmount = taxFair.calculateTaxFair(700.0);
        assertEquals(161.0, taxFairAmount);
    }

    @Test
    public void testThatTaxFairCanCalculateTaxTwiceTest(){
        TaxFair taxFair = new TaxFair();
        double taxFairAmount = taxFair.calculateTaxFair1(700.0);
        assertEquals(210.0, taxFairAmount);
    }
}

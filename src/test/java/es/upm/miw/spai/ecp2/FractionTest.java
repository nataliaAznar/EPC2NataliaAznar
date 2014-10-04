package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
	private Fraction fraction;
	private Fraction fraction2;

    @Before
    public void before() {
    	fraction = new Fraction(4, 2);
    	fraction2 = new Fraction();
    }

    @Test
    public void testGetNumerator() {
        assertEquals(4, fraction.getNumerator());
        assertEquals(1, fraction2.getNumerator());
    }
    
    @Test
    public void testGetDenominator() {
        assertEquals(2, fraction.getDenominator());
        assertEquals(1, fraction2.getDenominator());
    }
    
    @Test
    public void testDecimal() {
        assertEquals(2.0, fraction.decimal(), 10e-5);
        assertEquals(1.0, fraction2.decimal(), 10e-5);
    }

}

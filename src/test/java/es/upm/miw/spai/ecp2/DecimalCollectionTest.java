package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {
	private DecimalCollection dc;
	
	 @Before
	    public void before() {
	        dc = new DecimalCollection();
	        dc.add(1.1);
	        dc.add(2.2);
	    }

	    @Test
	    public void testSize() {
	        assertEquals(2, dc.size());
	    }
	    
	    @Test
	    public void testSum() {
	        assertEquals(3.3, dc.sum(), 10e-5);
	    }
	    
	    @Test
	    public void testHigher() {
	        assertEquals(2.2, dc.higher(), 10e-5);
	    }

}

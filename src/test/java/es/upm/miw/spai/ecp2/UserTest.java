package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	private User user;

    @Before
    public void before() {
        user = new User(1, "natalia", "aznar");
    }
    
    @Test
    public void testGetNumber(){
    	assertEquals(1, this.user.getNumber());
    }
    
    @Test
    public void testGetName(){
    	assertEquals("Natalia", this.user.getName());
    }
    
    @Test
    public void testGetFamilyName(){
    	assertEquals("Aznar", this.user.getFamilyName());
    }
    
    @Test
    public void testFullName(){
    	assertEquals("Natalia Aznar", this.user.fullName());
    }
    
    @Test
    public void testInitials(){
    	assertEquals("N.", this.user.initials());
    }
     
   @Test
   public void testGetUpperName (){
	   assertEquals("NATALIA", user.getUpperName());
   }

}

package GulaSidor.GulaSidor;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class ContactBookTest extends TestCase {
	
//	ContactBook cb = new ContactBook(); 
	
	
	@Test
	public void personIsSamePerson() {
	ContactBook cb1 = new ContactBook("Simon Södergren", "0721641288"), cb2 = new ContactBook("Simon Södergren", "0721641288"); 
	assertTrue(cb1.equals(cb2));
	}

}

package GulaSidor.GulaSidor;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactBookTest {
	
	private Person person; 
	private ContactBook contactBook;
	
	@BeforeEach 
	public void addPerson() {
	person = new Person("Simon Södergren", "0721641288"); 
	contactBook = new ContactBook(); 
	}
	@Test
	public void testContactBook() {
	contactBook.p.add(person); 
	assertEquals("Simon Södergren", "0721641288", person); 
		
	}

}


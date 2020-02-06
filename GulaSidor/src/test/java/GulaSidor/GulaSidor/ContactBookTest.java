package GulaSidor.GulaSidor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactBookTest  {
	
	private Person person; 
	private ContactBook contactBook;
	
	
	@BeforeEach 
	public void addPerson() {
	Person person = new Person(); 
	person.name = "Simon Södergren"; 
	person.number = "0721641288"; 
	contactBook = new ContactBook(); 
	}
	
	@Test
	public void testAddToContactBook() {
	contactBook.p.add(person); 
	assertEquals(person, contactBook.p.get(0)); 
		
	}
	@Test 
	public void testNotEqualPersonsInContactBook() {
		Person p2 = new Person(); 
		p2.name = "Peter Ihm"; 
		p2.number = "0721585813"; 
		contactBook.p.add(person); 
		assertNotEquals(person, p2);
	}
	@Test 
	public void testTwoEqualPersonsInContactBook() {
		Person p3 = new Person(); 
		p3.name="Simon Södergren"; 
		p3.name="0721641288"; 
		contactBook.p.add(p3); 
		assertEquals(p3, contactBook.p.get(0)); 
	}
	
	@Test 
	public void RemovePerson() {
	Person p2 = new Person(); 
	p2.name = "Erik Manfredsson"; 
	p2.number = "07521285959"; 
	contactBook = new ContactBook();
	contactBook.p.remove(p2); 
	assertNotEquals(0, contactBook.p.size()-1); 
		
	}
	

}
	


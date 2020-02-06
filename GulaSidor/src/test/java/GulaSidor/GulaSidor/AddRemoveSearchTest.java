package GulaSidor.GulaSidor;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class AddRemoveSearchTest {

	
	private Person person; 
	private ContactBook contactBook;
	private AddRemoveSearch ars; 
	
	
	@Test 
	public void testFindPerson() throws IndexOutOfBoundsException {
		Person p2 = new Person(); 
		p2.name="Simon Södergren"; 
		p2.number="0721641288"; 
		AddRemoveSearch ars1 = new AddRemoveSearch();
		ars1.foundpeople.add(p2);
		ars1.Search("Simon Södergren", "0721641288");
		System.out.println(ars1.foundpeople.get(0));
		assertEquals(ars1.foundpeople.get(0), p2);
	}
	
//	@Test
//	public void testFindPersonThatDoesntExist() throws IndexOutOfBoundsException {
//	Person p3 = new Person(); 
//	p3.name="Simon Södergren"; 
//	p3.number="0721641288"; 
//	AddRemoveSearch ars2 = new AddRemoveSearch(); 
//	ars2.foundpeople.add(p3); 
//	ars2.Search("Johannes Göranzon", "0725858585");
//	assertNotSame(ars2.foundpeople.get(0), p3); 
//	}
	
}


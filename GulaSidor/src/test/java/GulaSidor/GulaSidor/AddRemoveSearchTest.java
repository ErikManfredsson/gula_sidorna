package GulaSidor.GulaSidor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AddRemoveSearchTest {

	private Person person; 
	private ContactBook contactBook;

	@BeforeEach 
	public void addPerson() {
	Person person = new Person(); 
	person.name = "Simon Södergren"; 
	person.number = "0721641288"; 
	contactBook = new ContactBook(); 
	}


	
}

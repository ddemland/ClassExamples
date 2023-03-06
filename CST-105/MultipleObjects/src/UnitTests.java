import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UnitTests
{
	@Test
	void testName()
	{
		Name name = new Name("John", "Q", "Doe", "school@example.com", "(555) 555-2345");
		assertEquals("John", name.GetFirstName());
		assertEquals("Q", name.GetMiddleName());
		assertEquals("Doe", name.GetLastName());
		assertEquals("school@example.com", name.GetEMail());
		assertEquals("(555) 555-2345", name.GetPhone());
	}

	@Test
	void testAddress()
	{
		Address address = new Address("2149 E. Dunlap", "Phoenix", "AZ", "85214");
		assertEquals("2149 E. Dunlap", address.GetAddress());
		assertEquals("Phoenix", address.GetCity());
		assertEquals("AZ", address.GetState());
		assertEquals("85214", address.GetZip());
	}

	@Test
	void testPerson()
	{
		Name name = new Name("John", "Q", "Doe", "school@example.com", "(555) 555-2345");
		Address address = new Address("2149 E. Dunlap", "Phoenix", "AZ", "85214");
		Person person = new Person();
		person.SetName(name);
		person.SetAddress(address);
		String checkVal = "First: John\n"
				+ "Middle: Q\n"
				+ "Last: Doe\n"
				+ "E-Mail: school@example.com\n"
				+ "Phone: (555) 555-2345\n"
				+ "\n"
				+ "Address: 2149 E. Dunlap\n"
				+ "City: PHOENIX\n"
				+ "State: AZ\n"
				+ "Zip Code: 85214\n";

		assertEquals(checkVal, person.toString());
	}
}

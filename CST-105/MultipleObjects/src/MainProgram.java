
public class MainProgram
{
	public static void main(String[] args)
	{
		Name name = new Name("John", "Q", "Doe", "school@example.com", "(555) 555-2345");
		Address address = new Address("2149 E. Dunlap", "Phoenix", "AZ", "85214");
		Person person = new Person();
		person.SetName(name);
		person.SetAddress(address);
		System.out.print(person.toString());
	}

}

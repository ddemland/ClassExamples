
public class Name
{
	private String FirstName;
	private String MiddleName;
	private String LastName;
	private String EMail;
	private String Phone;

	public Name(String first, String middle, String last, String email, String phone)
	{
		FirstName = first;
		MiddleName = middle;
		LastName = last;
		EMail = email;
		Phone = phone;
	}
	
	public String GetFirstName()
	{
		return FirstName;
	}
	
	public String GetMiddleName()
	{
		return MiddleName;
	}
	
	public String GetLastName()
	{
		return LastName;
	}
	
	public String GetEMail()
	{
		return EMail;
	}
	
	public String GetPhone()
	{
		return Phone;
	}
	
	@Override
	public String toString()
	{
        String retVal = String.format("First: %s\nMiddle: %s\nLast: %s\nE-Mail: %s\nPhone: %s\n",
                FirstName, MiddleName, LastName, EMail, Phone);

      return(retVal);
	}
}


public class Person
{
	private Name m_name;
	private Address m_address;
	
	public void SetName(Name name)
	{
		m_name = name;
	}
	
	public void SetAddress(Address address)
	{
		m_address = address;
	}
	
	@Override
	public String toString()
	{
        String retVal = String.format("%s\n%s",
                m_name.toString(), m_address.toString());

        return(retVal);

	}
}

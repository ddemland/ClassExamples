
public class Address
{
	private String Address;
	private String City;
	private String State;
	private String ZipCode;
	
	public Address(String address, String city, String state, String zip)
	{
		Address = address;
		City = city;
		State = state;
		ZipCode = zip;
	}
	
	public String GetAddress()
	{
		return Address;
	}
	
	public String GetCity()
	{
		return City;
	}
	
	public String GetState()
	{
		return State;
	}
	
	public String GetZip()
	{
		return ZipCode;
	}
	
	@Override
	public String toString()
	{
        String retVal = String.format("Address: %s\nCity: %S\nState: %s\nZip Code: %s\n",
                Address, City, State, ZipCode);

        return(retVal);
	}
}

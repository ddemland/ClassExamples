
public class StackableString extends StackableObject
{
	private String Data;
	
	public StackableString(String data)
	{
		Data = data;
	}
	
	@Override
	public String GetData()
	{
		return Data;
	}

	@Override
    public Boolean HasData()
    {
        return(true);
    }
}

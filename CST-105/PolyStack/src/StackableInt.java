
public class StackableInt extends StackableObject
{
	private int Data;
	
	public StackableInt(int data)
	{
		Data = data;
	}

	@Override
	public String GetData()
	{
		return String.valueOf(Data);
	}

	@Override
    public Boolean HasData()
    {
        return(true);
    }
}

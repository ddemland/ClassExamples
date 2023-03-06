
public class StackableDouble extends StackableObject
{
	private double Data;

	public StackableDouble(double data)
	{
		Data = data;
	}
	
	@Override
	public String GetData()
	{
		return String.format("%.2f", Data);
	}

	@Override
    public Boolean HasData()
    {
        return(true);
    }
}

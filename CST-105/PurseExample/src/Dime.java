
public class Dime extends CoinBase
{
	public static final double DimeValue = 0.1;

	public Dime()
	{
		super(DimeValue);
	}
	
	@Override
	public double GetValue()
	{
		return Value;
	}

}


public class Quarter  extends CoinBase
{
	public static final double QuarterValue = 0.25;

	public Quarter()
	{
		super(QuarterValue);
	}
	
	@Override
	public double GetValue()
	{
		return Value;
	}
}

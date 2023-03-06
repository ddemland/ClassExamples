
public abstract class CoinBase
{
	protected double Value;

	public CoinBase(double value)
	{
		Value = value;
	}
	
	public abstract double GetValue();
}

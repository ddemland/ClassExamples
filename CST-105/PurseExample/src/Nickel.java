
public class Nickel extends CoinBase
{
	public static final double NickelValue = 0.05;

	public Nickel()
	{
		super(NickelValue);
	}

	@Override
	public double GetValue()
	{
		return Value;
	}
}

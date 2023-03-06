import java.util.ArrayList;

public class PolyPurse
{
	private ArrayList<CoinBase> Coins;
	
	public PolyPurse()
	{
		Coins = new ArrayList<CoinBase>();
	}
	
	public void AddCoin(CoinBase coin)
	{
		Coins.add(coin);
	}
	
	public double GetTotal()
	{
		double total = 0.0;
		for (int cnt = 0; cnt < Coins.size(); cnt ++)
		{
			CoinBase coin = Coins.get(cnt);
			total += coin.GetValue();
		}

		return total;
	}
}


import java.util.ArrayList;

public class SimpleStats
{
	public static long CalcArrayItemProduct(ArrayList<Integer> list)
	{
		long total = 1;
		for (int cnt = 0; cnt < list.size(); cnt ++)
		{
			int currValue = list.get(cnt);
			total *= currValue;
		}
		
		return  total;
	}
	
	public static double CalcAverageItemList(ArrayList<Integer> list)
	{
		double total = 0;
		int length = list.size();
		for (int cnt = 0; cnt < length; cnt ++)
		{
			int currValue = list.get(cnt);
			total += currValue;
		}
		
		return total / length;
	}
}

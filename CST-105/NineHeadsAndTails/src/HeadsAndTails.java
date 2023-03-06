
public class HeadsAndTails
{
	private static final int NineMaxBitValue = 511;
	private static final int NumBits = 9;
	
	public static String GetHeadsAndTailsStr(int num)
	{
		if ((num > NineMaxBitValue) || (num < 0))
		{
			return "";
		}
		
		var loopVal = num;
		var str = "";
		var loopCnt = 0;
		while (loopVal > 0)
		{
			var addStr = (loopVal & 0x01) == 1 ? "T" : "H";
			str = addStr + str;
			loopVal = (loopVal >> 1);
			loopCnt ++;
		}
		
		for (; loopCnt < NumBits; loopCnt ++)
		{
			str = "H" + str;
		}
		
		return str;
		
	}
}

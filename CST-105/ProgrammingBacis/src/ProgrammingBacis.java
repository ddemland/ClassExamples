
public class ProgrammingBacis
{
	public static boolean NumberIsEven(int num)
	{
		return num % 2 == 0 ? true : false;
	}
	
	public static double MilesToKilomters(int miles, int yards)
	{
		return 1.609 * ((double)miles + ((double)yards / 1760.0));
	}
	
	public static int FeetInFathom(int feet)
	{
		return feet * 7;
	}
}

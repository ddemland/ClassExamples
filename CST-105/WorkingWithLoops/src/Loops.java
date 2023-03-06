
public class Loops
{
	public static int GCD(int num1, int num2)
	{
		var gcd = 1;
		var possibleGcd = 2;
		
		while ((possibleGcd < num1) && (possibleGcd < num2))
		{
			if ((num1 % possibleGcd== 0) && (num2 % possibleGcd == 0))
			{
				gcd = possibleGcd;
			}
			
			possibleGcd ++;
		}
		
		return gcd;
	}
	
	public static boolean IsPalindrome(String str)
	{
		var verifyStr = str.toLowerCase();
		var lowIdx = 0;
		var highIdx = str.length() - 1;
		while (lowIdx < highIdx)
		{
			if (verifyStr.charAt(lowIdx) != verifyStr.charAt(highIdx))
			{
				return false;
			}
			
			lowIdx ++;
			highIdx --;
		}
		
		return true;
	}
	
	public static boolean IsPrime(int num)
	{
		var maxLoop = num / 2;
		for (var cnt = 2; cnt < maxLoop; cnt ++)
		{
			if (num % cnt == 0)
			{
				return false;
			}
		}
		
		return true;
	}

	public static int Factorial(int num)
	{
		var total = 1;
		for (var cnt = 1; cnt <= num; cnt ++)
		{
			total *= cnt;
		}
		
		return total;
	}
}

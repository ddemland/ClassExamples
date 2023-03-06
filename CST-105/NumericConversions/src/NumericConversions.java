
public class NumericConversions
{
	public int NumericStrToInt(String str)
	{
		int total = 0;
		int position = 1;
		for (int idx = str.length() - 1; idx >= 0 ; idx --)
		{
			int ch = str.charAt(idx) - '0';
			total += ch * Power(10, position - 1);
			position ++;
		}

		return total;
	}

	public int HexStrToInt(String str)
	{
		int total = 0;
		int position = 1;
		int value = 0;
		for (int idx = str.length() - 1; idx >= 0 ; idx --)
		{
			int rawCh = Character.toUpperCase(str.charAt(idx));
			if ((rawCh >= '0') && (rawCh <= '9'))
			{
				value = rawCh - '0';
			}
			else
			{
				switch (rawCh)
				{
					case 'A':
						value = 10;
						break;

					case 'B':
						value = 11;
						break;

					case 'C':
						value = 12;
						break;

					case 'D':
						value = 13;
						break;

					case 'E':
						value = 14;
						break;

					case 'F':
						value = 15;
						break;

				}
			}
			
			total += value * Power(16, position - 1);
			position ++;
		}

		return total;
	}

	public int BinaryStrToInt(String str)
	{
		int total = 0;
		int position = 1;
		for (int idx = str.length() - 1; idx >= 0 ; idx --)
		{
			int ch = str.charAt(idx) - '0';
			total += ch * Power(2, position - 1);
			position ++;
		}

		return total;
	}

	public long Power(int base, int power)
	{
		long total = 1;
		
		for (int cnt = 1; cnt <= power; cnt ++)
		{
			total *= base;
		}
		
		return total;
	}

	public boolean IsHexString(String str)
	{
		for (int idx = 0; idx < str.length(); idx ++)
		{
			char ch = Character.toUpperCase(str.charAt(idx));
			if (((ch >= '0') && (ch <= '9')) ||
					((ch >= 'A') && (ch <= 'F')))
			{
				continue;
			}
			
			return false;
		}

		return true;
	}

	public boolean IsBinaryString(String str)
	{
		for (int idx = 0; idx < str.length(); idx ++)
		{
			char ch = str.charAt(idx);
			if ((ch >= '0') && (ch <= '1'))
			{
				continue;
			}
			
			return false;
		}

		return true;
	}
}

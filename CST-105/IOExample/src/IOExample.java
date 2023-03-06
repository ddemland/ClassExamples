
public class IOExample
{
	public int XYBookTacoAndDrinks(int numDrinks, int numTacos)
	{
		int drinkTotal = numDrinks * 2;
		int tacoTotal = numTacos * 3;
		int total = drinkTotal + tacoTotal;
		return total;
	}
	
	public int CharacterCount(String str, char ch)
	{
		int charsSeen = 0;
		for (int idx = 0; idx < str.length(); idx ++)
		{
			if (str.charAt(idx) == ch)
			{
				charsSeen ++;
			}
		}

		return charsSeen;
	}
}

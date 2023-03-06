import java.util.Random;

public class ArrayIn2D
{
	final int maxRow = 4;
	final int maxColumn = 4;
	
	public int[][] CreateTable()
	{
		int[][] table = new int[maxColumn][maxRow];
		Random rand = new Random();
		for (int column = 0; column < maxColumn; column ++)
		{
			for (int row = 0; row < maxRow; row ++)
			{
				table[column][row] = rand.nextInt(100);
			}
		}
		
		return table;
	}
}

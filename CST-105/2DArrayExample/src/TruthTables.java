
public class TruthTables
{
	final int maxTruthTable = 2;
	
	public boolean[][] CreateAndTable()
	{
		boolean[][] table = new boolean[maxTruthTable][maxTruthTable];
		for (int row = 0; row < maxTruthTable; row ++)
		{
			for (int column = 0; column < maxTruthTable; column ++)
			{
				boolean rowFlag = row == 0 ? false : true;
				boolean columnFlag = column == 0 ? false : true;
				table[column][row] = rowFlag & columnFlag;
			}
		}

		return table;
	}

	public boolean[][] CreateOrTable()
	{
		boolean[][] table = new boolean[maxTruthTable][maxTruthTable];
		for (int row = 0; row < maxTruthTable; row ++)
		{
			for (int column = 0; column < maxTruthTable; column ++)
			{
				boolean rowFlag = row == 0 ? false : true;
				boolean columnFlag = column == 0 ? false : true;
				table[column][row] = rowFlag | columnFlag;
			}
		}

		return table;
	}

	public boolean[][] CreateXorTable()
	{
		boolean[][] table = new boolean[maxTruthTable][maxTruthTable];
		for (int row = 0; row < maxTruthTable; row ++)
		{
			for (int column = 0; column < maxTruthTable; column ++)
			{
				boolean rowFlag = row == 0 ? false : true;
				boolean columnFlag = column == 0 ? false : true;
				table[column][row] = rowFlag ^ columnFlag;
			}
		}

		return table;
	}
}

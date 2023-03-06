import java.util.Random;

public class LargestRowAndColumn
{
	public static final int GridSize = 4;
	
	private int[][] Grid;
	
	public LargestRowAndColumn()
	{
		Grid = new int[GridSize][GridSize];
		Random rand = new Random();
		for (var row = 0; row < GridSize; row ++)
		{
			for ( var column = 0; column < GridSize; column ++)
			{
				Grid[row][column] = rand.nextInt(2);
			}
		}
	}
	
	public int[][] GetGrid()
	{
		return Grid;
	}
	
	public int RowWithMostOnes()
	{
		var retIdx = 0;
		var mostRow = 0;
		for (var row = 0; row < GridSize; row ++)
		{
			var rowCnt = 0;
			for (var column = 0; column <GridSize; column ++)
			{
				if (Grid[row][column] == 1)
				{
					rowCnt ++;
				}
			}
			
			if (rowCnt > mostRow)
			{
				mostRow = rowCnt;
				retIdx = row;
			}
		}
		
		return retIdx;
	}

	public int ColumnWithMostOnes()
	{
		var retIdx = 0;
		var mostColumn = 0;
		for (var column = 0; column <GridSize; column ++)
		{
			var rowCnt = 0;
			for (var row = 0; row < GridSize; row ++)
			{
				if (Grid[row][column] == 1)
				{
					rowCnt ++;
				}
			}
			
			if (rowCnt > mostColumn)
			{
				mostColumn = rowCnt;
				retIdx = column;
			}
		}
		
		return retIdx;
	}
}

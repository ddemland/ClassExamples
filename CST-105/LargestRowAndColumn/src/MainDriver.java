
public class MainDriver {

	public static void main(String[] args)
	{
		var runner = new LargestRowAndColumn();
		var grid = runner.GetGrid();
		System.out.println("The grid looks like:");
		for (var row = 0; row < LargestRowAndColumn.GridSize; row ++)
		{
			for (var column = 0; column < LargestRowAndColumn.GridSize; column ++)
			{
				System.out.printf("%d  ", grid[row][column]);
			}
			
			System.out.println();
		}
		
		System.out.println();
		System.out.printf("Row with most ones has an index of: %d\n", runner.RowWithMostOnes());
		System.out.printf("Column with most ones has an index of: %d\n", runner.ColumnWithMostOnes());
	}

}

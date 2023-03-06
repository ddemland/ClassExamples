
public class MainProgram
{

	public static void main(String[] args)
	{
		ArrayIn2D array2d = new ArrayIn2D();
		int[][] table = array2d.CreateTable();
		for (int column = 0; column < array2d.maxColumn; column ++)
		{
			for (int row = 0; row < array2d.maxRow; row ++)
			{
				System.out.printf(" %02d ", table[column][row]);
			}
			
			System.out.println();
		}

		System.out.println();
		
		TruthTables tTables = new TruthTables();
		boolean[][] tTable = tTables.CreateAndTable();
		System.out.println("And Table:");
		System.out.printf("      |%-5s |%-5s |\n", "False", "True");
		System.out.println("---------------------");
		for (int row = 0; row < tTables.maxTruthTable; row ++)
		{
			boolean rowFlag = row == 0 ? false : true;
			System.out.printf("%-5s |", BoolString(rowFlag));
			for (int column = 0; column < tTables.maxTruthTable; column ++)
			{
				boolean columnFlag = tTable[row][column] ? true : false;
				System.out.printf("%-5s |", BoolString(columnFlag));
			}

			System.out.println();
			System.out.println("---------------------");
		}

		System.out.println();
		
		tTable = tTables.CreateOrTable();
		System.out.println("Or Table:");
		System.out.printf("      |%-5s |%-5s |\n", "False", "True");
		System.out.println("---------------------");
		for (int row = 0; row < tTables.maxTruthTable; row ++)
		{
			boolean rowFlag = row == 0 ? false : true;
			System.out.printf("%-5s |", BoolString(rowFlag));
			for (int column = 0; column < tTables.maxTruthTable; column ++)
			{
				boolean columnFlag = tTable[row][column] ? true : false;
				System.out.printf("%-5s |", BoolString(columnFlag));
			}

			System.out.println();
			System.out.println("---------------------");
		}

		System.out.println();
		
		tTable = tTables.CreateXorTable();
		System.out.println("Xor Table:");
		System.out.printf("      |%-5s |%-5s |\n", "False", "True");
		System.out.println("---------------------");
		for (int row = 0; row < tTables.maxTruthTable; row ++)
		{
			boolean rowFlag = row == 0 ? false : true;
			System.out.printf("%-5s |", BoolString(rowFlag));
			for (int column = 0; column < tTables.maxTruthTable; column ++)
			{
				boolean columnFlag = tTable[row][column] ? true : false;
				System.out.printf("%-5s |", BoolString(columnFlag));
			}

			System.out.println();
			System.out.println("---------------------");
		}
	}
	
	private static String BoolString(boolean flag)
	{
		return flag ? "True" : "False";
	}

}

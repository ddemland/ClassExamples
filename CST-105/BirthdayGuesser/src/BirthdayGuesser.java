
public class BirthdayGuesser
{
	public static final int GridSize = 4;
	private static final int MaxGuesses = 5;
	private int currDayGrid = 0;
	
	private int[][][] dates =
		{
			{
				{1, 3, 5, 7},
				{9, 11, 13, 15},
				{17, 19, 21, 23},
				{25, 27, 29, 31}
			},
			{
				{2, 3, 6, 7},
				{10, 11, 14, 15},
				{18, 19, 22, 23},
				{26, 27, 30, 31}
			},
			{
				{4, 5, 6, 7},
				{12, 13, 14, 15},
				{20, 21, 22, 23},
				{28, 29, 30, 31}
			},
			{
				{8, 9, 10, 11},
				{12, 13, 14, 15},
				{24, 25, 26, 27},
				{28, 29, 30, 31}
			},
			{
				{16, 17, 18, 19},
				{20, 21, 22, 23},
				{24, 25, 26, 27},
				{28, 29, 30, 31}
			}
		 };

	public BirthdayGuesser()
	{
	}
	
	public int[][] GetCurrentDayGrid()
	{
		return dates[currDayGrid];
	}
	
	public int GetAddDays()
	{
		return dates[currDayGrid][0][0];
	}
	
	public boolean NextGrid()
	{
		if (currDayGrid < MaxGuesses - 1)
		{
			currDayGrid ++;
			return true;
		}
		
		return false;
	}
}

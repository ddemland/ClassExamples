
public class Assignment
{
	private String Name;
	private int Score;
	
	public Assignment(String name)
	{
		Name = name;
		Score = 0;
	}
	
	public void SetScore(int score)
	{
		Score = score;
	}
	
	public int GetScore()
	{
		return Score;
	}
	
	public String GetName()
	{
		return Name;
	}
}

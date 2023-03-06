import java.util.ArrayList;

public class Runner
{
	public static ArrayList<String> ReverseLines(ArrayList<String> lines)
	{
		var reverseLines = new ArrayList<String>();
		for (var cnt = 0; cnt < lines.size(); cnt ++)
		{
			var buff = new StringBuilder();
			buff.append(lines.get(cnt));
			buff.reverse();
			reverseLines.add(buff.toString());
		}
		
		return reverseLines;
	}
}

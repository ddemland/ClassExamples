import java.io.*;

public class FileStats
{
	int WordCount;
	int LineCount;
	String FileName;
	
	public FileStats(String fileName)
	{
		WordCount = 0;
		LineCount = 0;
		FileName = fileName;
	}
	
	public void GetFileStats()
			throws FileNotFoundException, IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(FileName));
		String str;
		while ((str = br.readLine()) != null)
		{
			if (str.length() <= 0)
			{
				continue;
			}
			
			String[] parts = str.split(" ");
			WordCount += parts.length;
			LineCount ++;
		}

		br.close();
	}
}

import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainProgram
{

	public static void main(String[] args)
		throws URISyntaxException, IOException
	{
		String path = new File(MainProgram.class.getProtectionDomain().getCodeSource().getLocation()
			    .toURI()).getPath();
		Path fullPath = Paths.get(path, "InputData.txt");
		
		FileStats fileStats = new FileStats(fullPath.toString());
		fileStats.GetFileStats();

		Path outputfile = Paths.get(path, "OutputData.txt");
		FileWriter myWriter = new FileWriter(outputfile.toString());
		PrintWriter printLine = new PrintWriter(myWriter);

		printLine.printf("The file: %s has %d words and %d lines.\n", fileStats.FileName,
						fileStats.WordCount, fileStats.LineCount);
		printLine.close();
	}

}

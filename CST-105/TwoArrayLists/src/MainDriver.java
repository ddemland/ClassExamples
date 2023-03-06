import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args)
	{
		try
		{
			var data = new ArrayList<String>();
			var inFile = new File("src/Input.txt");
			var scanner = new Scanner(inFile);
			while (scanner.hasNext())
			{
				var line = scanner.nextLine();
				data.add(line);
			}
			
			var retList = Runner.ReverseLines(data);
			
			var outFile = new File("src/Output.txt");
			var printWriter = new PrintWriter(outFile);
			
			System.out.println("Data       Reverse");
			System.out.println("------------------");
			printWriter.println("Data       Reverse");
			printWriter.println("------------------");
			for (var cnt = 0; cnt < data.size(); cnt ++)
			{
				System.out.printf("%-11s  %-11s\n", data.get(cnt), retList.get(cnt));
				printWriter.printf("%-11s  %-11s\n", data.get(cnt), retList.get(cnt));
			}
			
			printWriter.close();
			scanner.close();
		}
		
		catch (FileNotFoundException ex)
		{
		}
	}

}

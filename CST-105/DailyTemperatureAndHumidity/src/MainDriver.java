import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args)
	{
		try
		{
			//
			//  Weather.txt file can be down loaded from:
			//			http://liveexample.pearsoncmg.com/data/Weather.txt
			//
			var inFile = new File("src/Weather.txt");
			var scanner = new Scanner(inFile);
			var weatherObj = new Weather();
			while (scanner.hasNext())
			{
				var line = scanner.nextLine();
				var parts = line.split(" ");
				weatherObj.Add(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]),
						Double.parseDouble(parts[2]), Double.parseDouble(parts[3]));
			}
			
			var data = weatherObj.GetAverages();
			for (var cnt = 0; cnt < Weather.NumberOfDays; cnt ++)
			{
				System.out.printf("Day %d's average temperature is %.2f\n", (cnt + 1), data[cnt][0]);
				System.out.printf("Day %d's average humidity is %.2f\n", (cnt + 1), data[cnt][1]);
			}
		}

		catch (FileNotFoundException ex)
		{
			System.out.println("Could not open Weather.txt");
		}
	}

}

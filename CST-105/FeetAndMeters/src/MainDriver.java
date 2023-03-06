import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args)
	{
		var scanner = new Scanner(System.in);
		System.out.print("Enter number of feet to convert: ");
		var userInput = scanner.nextDouble();
		var answer = userInput / 3.2808;
		System.out.printf("Meters: %f\n", answer);

		System.out.print("Enter number of meters to convert: ");
		userInput = scanner.nextDouble();
		answer = userInput * 3.2808;
		System.out.printf("Feet: %f\n", answer);
	}

}

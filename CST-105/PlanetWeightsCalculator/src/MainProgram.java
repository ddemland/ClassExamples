import java.util.Scanner;

public class MainProgram
{

	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter a weight on Earth: ");
		double weight = scnr.nextDouble();
		WeightCalculator calculator = new WeightCalculator(weight);
		
		System.out.printf("Sun: %f\n", calculator.OnSun());
		System.out.printf("Mercury: %f\n", calculator.OnMercury());
		System.out.printf("Venus: %f\n", calculator.OnVenus());
		System.out.printf("Earth: %f\n", calculator.OnEarth());
		System.out.printf("Moon: %f\n", calculator.OnMoon());
		System.out.printf("Mars: %f\n", calculator.OnMars());
		System.out.printf("Jupiter: %f\n", calculator.OnJupiter());
		System.out.printf("Saturn: %f\n", calculator.OnSaturn());
		System.out.printf("Uranus: %f\n", calculator.OnUranus());
		System.out.printf("Neptune: %f\n", calculator.OnNeptune());
		System.out.printf("Pluto: %f\n", calculator.OnPluto());
	}

}

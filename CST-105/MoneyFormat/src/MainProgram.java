import java.text.NumberFormat;
import java.util.Locale;

public class MainProgram
{
	public static void main(String[] args)
	{
		Locale locale = new Locale("en", "US");      
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
		long money1 = 1000000;
		int money2 = 3400;
		float money3 = 2325.25f;
		
		System.out.println("Money output looks like:");
		System.out.printf("    Money1: %s\n", currencyFormatter.format(money1));
		System.out.printf("    Money2: %s\n", currencyFormatter.format(money2));
		System.out.printf("    Money3: %s\n", currencyFormatter.format(money3));
	}

}

import java.io.PrintWriter;
import java.io.StringWriter;

public class MainProgram
{
	public static void main(String[] args)
	{
		try
		{
			ExceptionsDemo.DivideByZero();
		}
		
		catch (ArithmeticException ex)
		{
			System.out.println(ex);
			System.out.println();
			System.out.println(ex.getMessage());
			System.out.println();

			StringWriter writer = new StringWriter();
			PrintWriter printWriter = new PrintWriter(writer);
			ex.printStackTrace( printWriter );
			printWriter.flush();
			System.out.println(writer.toString());
		}

		System.out.println();
		
		try
		{
			ExceptionsDemo.NullPointer();
		}

		catch (NullPointerException ex)
		{
			StringWriter writer = new StringWriter();
			PrintWriter printWriter = new PrintWriter(writer);
			ex.printStackTrace( printWriter );
			printWriter.flush();
			System.out.println(writer.toString());
		}

		System.out.println();

		try
		{
			ExceptionsDemo.NumberFormat();
		}

		catch (NullPointerException ex)
		{
			StringWriter writer = new StringWriter();
			PrintWriter printWriter = new PrintWriter(writer);
			ex.printStackTrace( printWriter );
			printWriter.flush();
			System.out.println(writer.toString());
		}

		System.out.println();

		try
		{
			ExceptionsDemo.ArrayIndexOutOfBounds();
		}

		catch (ArrayIndexOutOfBoundsException ex)
		{
			StringWriter writer = new StringWriter();
			PrintWriter printWriter = new PrintWriter(writer);
			ex.printStackTrace( printWriter );
			printWriter.flush();
			System.out.println(writer.toString());
		}
	}
}


public class ExceptionsDemo
{
	public static void DivideByZero()
			throws ArithmeticException
	{
		int x =  100 / 0;
	}
	
	public static void NullPointer()
	{
		String s = null;
		System.out.println(s.length());
	}

	public static void NumberFormat()
	{
		String s="abc";  
		int i=Integer.parseInt(s);
	}
	
	public static void ArrayIndexOutOfBounds()
	{
		int a[]=new int[5];  
		a[10]=50; 
	}
}

import java.util.ArrayList;
import java.util.List;

public class MainProgram
{

	public static void main(String[] args)
	{
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		System.out.print("The list status is: ");
		System.out.println(list1.isEmpty());

		list1.add(0, 1);
		list1.add(1, 2);
		System.out.print("list1: ");
		System.out.println(list1);

		list2.add(1);
		list2.add(2);
		list2.add(3);
		System.out.print("list2: ");
		System.out.println(list2);

		// Will add list2 from 1 index to list1
		list1.addAll(1, list2);
		System.out.print("Combined list: ");
		System.out.println(list1);

		System.out.print("Third item in list1 is: ");
		System.out.println(list1.get(3)); // will be 3

		System.out.print("Size of list1 is: ");
		System.out.println(list1.size());

		list1.remove(1);
		list1.remove(1);
		list1.remove(1);
		System.out.print("list2 removed from list1: ");
		System.out.println(list1);

		list1.set(0, 5);
		System.out.print("list1 after first item replaced: ");
		System.out.println(list1);

		String output;
		int num1 = 6, num2 = 12;
		if (num1 == num2)
		{
			System.out.println("The nunbers are equal.");
		}
		else
		{
			System.out.println("The numbers are not equal.");
		}
		
		output = num1 != num2 ? "Not Equal" : "Are Equal";
		System.out.printf("The value of output is %s\n", output);
	}

}

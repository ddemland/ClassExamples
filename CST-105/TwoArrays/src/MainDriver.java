import java.util.Scanner;

public class MainDriver
{

    public static void main(String[] args)
    {
        var scanner = new Scanner(System.in);
        System.out.print("Please enter a few words: ");
        var line = scanner.nextLine();
        var createArrays = new Create2Arrays();
        createArrays.CreateArraysFromString(line);
        var array1 = createArrays.GetStringData();
        var array2 = createArrays.GetStringDataLengths();
        var maxItems = createArrays.GetMaxItems();
        
        for (var cnt = 0; cnt < maxItems; cnt ++)
        {
            System.out.printf("%s       %d\n", array1[cnt], array2[cnt]);
        }
    }

}

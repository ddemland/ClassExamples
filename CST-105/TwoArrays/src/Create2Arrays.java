
public class Create2Arrays
{
    private final int MaxArrayItems = 5;
    private String StringData[] = new String[MaxArrayItems];
    private int StringDataLength[] = new int[MaxArrayItems];
    private int MaxItems;

    public void CreateArraysFromString(String str)
    {
        var parts = str.split(" ");
        MaxItems = parts.length < MaxArrayItems ? parts.length : MaxArrayItems;
        for (var cnt = 0; cnt < MaxItems; cnt ++)
        {
            StringData[cnt] = parts[cnt];
            StringDataLength[cnt] = parts[cnt].length();
        }
    }
    
    public String[] GetStringData()
    {
        return StringData;
    }
    
    public int[] GetStringDataLengths()
    {
        return StringDataLength;
    }
    
    public int GetMaxItems()
    {
        return MaxItems;
    }
}

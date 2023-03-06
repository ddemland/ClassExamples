import java.util.ArrayList;

public class MainProgram
{
	public static void main(String[] args)
	{
		Receipt receipt = new Receipt(12345, 1);
		ArrayList<SaleItem> items = receipt.Items;
		items.add(new SaleItem(1, "Cookie", 2.00F));
		items.add(new SaleItem(1, "Apple Pie", 13.45F));
		items.add(new SaleItem(1, "Lava Cake", 5.80F));
		System.out.print(receipt.GetReceiptPrintout());
	}

}

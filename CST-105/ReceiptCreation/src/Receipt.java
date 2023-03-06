import java.util.ArrayList;

public class Receipt
{
	private int TransactionNumber;
	private int RegisterNumber;
	ArrayList<SaleItem> Items;
	
	public Receipt(int transNum, int register)
	{
		TransactionNumber = transNum;
		RegisterNumber = register;
		Items = new ArrayList<SaleItem>();
	}
	
	public int GetTransactionNUmber()
	{
		return TransactionNumber;
	}
	
	public int GetRegisterNumber()
	{
		return RegisterNumber;
	}
	
	public String GetReceiptPrintout()
	{
		double total = TotalItems();
		double tax = total * 0.081f;
		String itemList = "";
		for (int cnt = 0; cnt < Items.size(); cnt ++)
		{
			SaleItem currItem = Items.get(cnt);
			itemList = String.format("%s%d   %s    $%.2f\n", itemList, currItem.GetQuantity(),
					currItem.GetDesciption(), currItem.GetAmount());
		}
		
		String str;
		str = String.format("Trans No: %d\nRegister: %d\n\n%s\nSub Total: $%.2f\nTax: $%.2f\nTotal: $%.2f\n",
				TransactionNumber, RegisterNumber, itemList, total, tax, total + tax);
		
		return str;
	}
	
	private double TotalItems()
	{
		double total = 0.0f;
		for (int cnt = 0; cnt < Items.size(); cnt ++)
		{
			SaleItem currItem = Items.get(cnt);
			total += currItem.GetAmount();
		}
		
		return total;
	}
}

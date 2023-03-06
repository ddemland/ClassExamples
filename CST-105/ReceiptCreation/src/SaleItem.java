
public class SaleItem
{
	private int Quantity;
	private String Description;
	private double Amount;
	
	public SaleItem(int quantity, String description, double amount)
	{
		Quantity = quantity;
		Description = description;
		Amount = amount;
	}
	
	public int GetQuantity()
	{
		return Quantity;
	}
	
	public String GetDesciption()
	{
		return Description;
	}
	
	public double GetAmount()
	{
		return Amount;
	}
}


public class BankAccount
{
	private double Balance;
	
	public double GetBalance()
	{
		return Balance;
	}
	
	public BankAccount(double initialBalance)
	{
		Balance = initialBalance;
	}
	
	public void Deposit(double amount)
	{
		Balance += amount;
	}
	
	public void Withdraw(double amount)
	{
		Balance -= amount;
	}
}

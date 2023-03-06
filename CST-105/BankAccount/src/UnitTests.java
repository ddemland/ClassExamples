import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTests
{
	@Test
	void test()
	{
		BankAccount account = new BankAccount(100.00);
		assertEquals(100.00, account.GetBalance());
		
		account.Deposit(20.00);
		assertEquals(120.00, account.GetBalance());
		
		account.Withdraw(20.00);
		assertEquals(100.00, account.GetBalance());
	}

}

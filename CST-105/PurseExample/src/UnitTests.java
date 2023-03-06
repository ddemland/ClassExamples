import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTests
{

	@Test
	void testSimplePurse()
	{
		SimplePurse purse = new SimplePurse();
		assertEquals(0, purse.GetTotal());

		purse.AddNickels(2);
		assertEquals(0.1, purse.GetTotal());

		purse.AddDimes(3);
		assertEquals(0.4, purse.GetTotal());

		purse.AddQuaters(1);
		assertEquals(0.65, purse.GetTotal());
	}

	@Test
	void testPolyPurse()
	{
		PolyPurse purse = new PolyPurse();
		Nickel nickle = new Nickel();
		Dime dime = new Dime();
		Quarter quarter = new Quarter();
		
		assertEquals(0, purse.GetTotal());
		
		purse.AddCoin(nickle);
		purse.AddCoin(nickle);
		assertEquals(0.1, purse.GetTotal());

		purse.AddCoin(dime);
		purse.AddCoin(dime);
		purse.AddCoin(dime);
		assertEquals(0.4, purse.GetTotal());

		purse.AddCoin(quarter);
		assertEquals(0.65, purse.GetTotal());
	}
}

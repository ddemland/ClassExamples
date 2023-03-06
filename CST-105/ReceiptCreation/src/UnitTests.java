import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class UnitTests
{

	@Test
	void test()
	{
		Receipt receipt = new Receipt(12345, 1);
		ArrayList<SaleItem> items = receipt.Items;
		items.add(new SaleItem(1, "Cookie", 2.00F));
		items.add(new SaleItem(1, "Apple Pie", 13.45F));
		items.add(new SaleItem(1, "Lava Cake", 5.80F));
		String checkStr = "Trans No: 12345\n"
				+ "Register: 1\n"
				+ "\n"
				+ "1   Cookie    $2.00\n"
				+ "1   Apple Pie    $13.45\n"
				+ "1   Lava Cake    $5.80\n"
				+ "\n"
				+ "Sub Total: $21.25\n"
				+ "Tax: $1.72\n"
				+ "Total: $22.97\n";
		assertEquals(checkStr, receipt.GetReceiptPrintout());
	}

}

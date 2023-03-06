#include "pch.h"
#include "CppUnitTest.h"

#include <sstream>

#include "Item.cpp"
#include "Soap.cpp"
#include "Meat.cpp"
#include "Fruit.cpp"
#include "Customer.cpp"
#include "Cart.cpp"
#include "DataAccess.cpp"

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace ShoppingCartTests
{
	TEST_CLASS(ShoppingCartTests)
	{
	public:
		
		TEST_METHOD(TestSoap)
		{
			Soap soap(3, 3.0F, "Soap 1", 3.00F);

			Assert::AreEqual(SoapItemID, soap.GetTypeID());
			Assert::AreEqual((double)3.000F, soap.GetPrice());
			Assert::AreEqual((string)"Soap 1", soap.GetDescription());
			Assert::AreEqual((double)3.000F, soap.GetPrice());
			Assert::AreEqual((double)3.0F, soap.GetTotalPrice());
		}

		TEST_METHOD(TestMeat)
		{
			Meat meat(3, 3.0F, "Soap 1", 3.00F);
			Assert::AreEqual(MeatItemID, meat.GetTypeID());
		}

		TEST_METHOD(TestFruit)
		{
			Fruit fruit(3, 3.0F, "Soap 1", 3.00F);
			Assert::AreEqual(FruitItemID, fruit.GetTypeID());
		}

		TEST_METHOD(TestCustomer)
		{
			Customer customer(1, 2345);
			Assert::AreEqual(1, customer.GetId());
			Assert::AreEqual(2345, customer.GetOrderNumber());

			auto soap = new Soap(3, 3.0F, "Soap 1", 3.00F);
			customer.Add(soap);

			auto meat = new Meat(3, 3.0F, "Meat 1", 3.00F);
			customer.Add(meat);

			auto fruit = new Fruit(3, 3.0F, "Fruit 1", 3.00F);
			customer.Add(fruit);

			auto items = customer.GetItems();
			Assert::AreEqual(3, (int)items.size());
			auto soapItem = (Soap *)items[0];
			Assert::AreEqual(SoapItemID, soapItem->GetTypeID());
			Assert::AreEqual((double)3.000F, soapItem->GetPrice());
			Assert::AreEqual((string)"Soap 1", soapItem->GetDescription());
			Assert::AreEqual((double)3.000F, soapItem->GetPrice());
			Assert::AreEqual((double)3.0F, soapItem->GetTotalPrice());

			auto meatItem = (Meat *)items[1];
			Assert::AreEqual(MeatItemID, meatItem->GetTypeID());

			auto fruitItem = (Fruit *)items[2];
			Assert::AreEqual(FruitItemID, fruitItem->GetTypeID());
		}

		TEST_METHOD(TestCart)
		{
			Customer customer(1, 2345);
			auto soap = new Soap(3, 3.0F, "Soap 1", 3.0F);
			customer.Add(soap);
			auto meat = new Meat(3, 3.0F, "Meat 1", 3.00F);
			customer.Add(meat);
			auto fruit = new Fruit(3, 3.0F, "Fruit 1", 3.00F);
			customer.Add(fruit);

			Cart cart(1234, &customer);

			auto checkCustomer = cart.GetCustomer();
			auto checkCartNum = cart.GetCartNumber();
			Assert::AreEqual(1234, checkCartNum);
			Assert::AreEqual((string)"1234,1", cart.FormatForCSV());

			Assert::AreEqual(1, checkCustomer->GetId());
			Assert::AreEqual(2345, checkCustomer->GetOrderNumber());
			Assert::AreEqual((string)"1,2345", checkCustomer->FormatForCSV());

			auto items = checkCustomer->GetItems();
			Assert::AreEqual(3, (int)items.size());
			auto soapItem = (Soap *)items[0];
			Assert::AreEqual(SoapItemID, soapItem->GetTypeID());
			Assert::AreEqual(3, soapItem->GetQuantity());
			Assert::AreEqual((string)"Soap 1", soapItem->GetDescription());
			Assert::AreEqual((double)3.000F, soapItem->GetPrice());
			Assert::AreEqual((double)3.0F, soapItem->GetTotalPrice());
			Assert::AreEqual((string)"1,3,3.00,3.00,Soap 1", soapItem->FormatForCSV());

			auto meatItem = (Meat *)items[1];
			Assert::AreEqual(MeatItemID, meatItem->GetTypeID());
			Assert::AreEqual((string)"2,3,3.00,3.00,Meat 1", meatItem->FormatForCSV());

			auto fruitItem = (Fruit *)items[2];
			Assert::AreEqual(FruitItemID, fruitItem->GetTypeID());
			Assert::AreEqual((string)"3,3,3.00,3.00,Fruit 1", fruitItem->FormatForCSV());
		}

		TEST_METHOD(TestSaveData)
		{
			Customer customer(1, 2345);
			auto soap = new Soap(3, 3.0F, "Soap 1", 3.0F);
			customer.Add(soap);
			auto meat = new Meat(3, 3.0F, "Meat 1", 3.00F);
			customer.Add(meat);
			auto fruit = new Fruit(3, 3.0F, "Fruit 1", 3.00F);
			customer.Add(fruit);
			Cart cart(1234, &customer);

			DataAccess dataAccess("testing.txt");
			dataAccess.SaveData(cart);

			ifstream inFile;
			inFile.open("testing.txt");
			stringstream strStream;
			strStream << inFile.rdbuf();
			string str = strStream.str();

			string fileDataCheck = "1,1234,1\n2,1,2345\n3,2345,1,3,3.00,3.00,Soap 1\n3,2345,2,3,3.00,3.00,Meat 1\n3,2345,3,3,3.00,3.00,Fruit 1\n";
			Assert::AreEqual(fileDataCheck, str);
		}

		TEST_METHOD(TestLoadData)
		{
			string fileData = "1,1234,1\n2,1,2345\n3,2345,1,3,3.00,3.00,Soap 1\n3,2345,2,3,3.00,3.00,Meat 1\n3,2345,3,3,3.00,3.00,Fruit 1\n";
			ofstream outFile("testing2.txt");
			outFile << fileData;
			outFile.close();

			DataAccess dataAccess("testing2.txt");
			auto cart = dataAccess.LoadData();

			auto checkCustomer = cart.GetCustomer();
			auto checkCartNum = cart.GetCartNumber();
			Assert::AreEqual(1234, checkCartNum);

			Assert::AreEqual(1, checkCustomer->GetId());
			Assert::AreEqual(2345, checkCustomer->GetOrderNumber());

			auto items = checkCustomer->GetItems();
			Assert::AreEqual(3, (int)items.size());
			auto soapItem = dynamic_cast<Soap *>(items[0]);
			Assert::AreEqual(SoapItemID, soapItem->GetTypeID());
			Assert::AreEqual(3, soapItem->GetQuantity());
			Assert::AreEqual((string)"Soap 1", soapItem->GetDescription());
			Assert::AreEqual((double)3.000F, soapItem->GetPrice());
			Assert::AreEqual((double)3.0F, soapItem->GetTotalPrice());

			auto meatItem = (Meat *)items[1];
			Assert::AreEqual(MeatItemID, meatItem->GetTypeID());

			auto fruitItem = dynamic_cast<Fruit *>(items[2]);
			Assert::AreEqual(FruitItemID, fruitItem->GetTypeID());
		}
	};
}

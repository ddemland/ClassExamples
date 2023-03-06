#include "pch.h"
#include "CppUnitTest.h"

#include "TheSeven.cpp"

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace Lucky7Tests
{
	TEST_CLASS(Lucky7Tests)
	{
	public:
		
		TEST_METHOD(TestHighestLowest)
		{
			vector<int> list = 
			{
				24,
				10,
				50,
				7,
				40
			};
			int highest, lowest;

			TheSeven::GetHighestAndLowest(list, highest, lowest);

			Assert::AreEqual(50, highest);
			Assert::AreEqual(7, lowest);
		}

		TEST_METHOD(TestCalc50FirstSevens)
		{
			int total = TheSeven::Calc50FirstSevens();;

			Assert::AreEqual(8925, total);
		}

		TEST_METHOD(TestFactorialLimit10)
		{
			int total;
			
			TheSeven::First10Factorial(5, total);;
			Assert::AreEqual(120, total);

			TheSeven::First10Factorial(10, total);;
			Assert::AreEqual(3628800, total);

			TheSeven::First10Factorial(11, total);;
			Assert::AreEqual(3628800, total);
		}

		TEST_METHOD(TestPalindrome)
		{
			string str;

			str = "radar";
			Assert::IsTrue(TheSeven::IsPalindrome(str));

			str = "madam";
			Assert::IsTrue(TheSeven::IsPalindrome(str));

			str = "Test";
			Assert::IsFalse(TheSeven::IsPalindrome(str));

			str = "Testing";
			Assert::IsFalse(TheSeven::IsPalindrome(str));

			str = "mom";
			Assert::IsTrue(TheSeven::IsPalindrome(str));

			str = "noon";
			Assert::IsTrue(TheSeven::IsPalindrome(str));
		}

		TEST_METHOD(TestIsPrime)
		{
			Assert::IsTrue(TheSeven::IsPrime(11));
			Assert::IsTrue(TheSeven::IsPrime(179));
			Assert::IsFalse(TheSeven::IsPrime(50));
			Assert::IsFalse(TheSeven::IsPrime(180));
		}
	};
}

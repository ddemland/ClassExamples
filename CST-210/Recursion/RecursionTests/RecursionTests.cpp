#include "pch.h"
#include "CppUnitTest.h"

#include "RecursionCalls.cpp"

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace RecursionTests
{
	TEST_CLASS(RecursionTests)
	{
	public:
		
		TEST_METHOD(TestFactorial)
		{
			Assert::AreEqual(120, RecursionCalls::Factorial(5));
			Assert::AreEqual(3628800, RecursionCalls::Factorial(10));
			Assert::AreEqual(39916800, RecursionCalls::Factorial(11));
		}

		TEST_METHOD(TestFibonacci)
		{
			Assert::AreEqual(13, RecursionCalls::Fibonacci(7));
			Assert::AreEqual(34, RecursionCalls::Fibonacci(9));
			Assert::AreEqual(55, RecursionCalls::Fibonacci(10));
		}

		TEST_METHOD(TestIsPalindrome)
		{
			Assert::IsTrue(RecursionCalls::IsPalindrome("radar"));
			Assert::IsTrue(RecursionCalls::IsPalindrome("madam"));
			Assert::IsFalse(RecursionCalls::IsPalindrome("Test"));
			Assert::IsFalse(RecursionCalls::IsPalindrome("Testing"));
			Assert::IsTrue(RecursionCalls::IsPalindrome("mom"));
			Assert::IsTrue(RecursionCalls::IsPalindrome("noon"));
		}

		TEST_METHOD(TestIsPalindrome2)
		{
			string str = "radar";
			Assert::IsTrue(RecursionCalls::IsPalindrome(str, 0, str.size() - 1));
			str = "madam";
			Assert::IsTrue(RecursionCalls::IsPalindrome(str, 0, str.size() - 1));
			str = "Test";
			Assert::IsFalse(RecursionCalls::IsPalindrome(str, 0, str.size() - 1));
			str = "Testing";
			Assert::IsFalse(RecursionCalls::IsPalindrome(str, 0, str.size() - 1));
			str = "mom";
			Assert::IsTrue(RecursionCalls::IsPalindrome(str, 0, str.size() - 1));
			str = "noon";
			Assert::IsTrue(RecursionCalls::IsPalindrome(str, 0, str.size() - 1));
		}
	};
}

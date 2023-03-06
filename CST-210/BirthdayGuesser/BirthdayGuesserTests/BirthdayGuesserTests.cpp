#include "pch.h"
#include "CppUnitTest.h"

#include "BirthdaySolver.cpp"

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace BirthdayGuesserTests
{
	TEST_CLASS(BirthdayGuesserTests)
	{
	public:
		
		TEST_METHOD(TestBirthdaySolver)
		{
			BirthdaySolver guesser;
			Assert::AreEqual(1, guesser.GetAddDays());
			guesser.NextGrid();
			Assert::AreEqual(2, guesser.GetAddDays());
			guesser.NextGrid();
			Assert::AreEqual(4, guesser.GetAddDays());
			guesser.NextGrid();
			Assert::AreEqual(8, guesser.GetAddDays());
			guesser.NextGrid();
			Assert::AreEqual(16, guesser.GetAddDays());
		}
	};
}

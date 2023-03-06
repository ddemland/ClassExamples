#include "pch.h"
#include "CppUnitTest.h"

#include "TacoAndDrink.cpp"

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace ZybooksExampleTests
{
	TEST_CLASS(ZybooksExampleTests)
	{
	public:
		
		TEST_METHOD(TestTotalCalc)
		{
			int answer = TacoAndDrink::CalculateCost(2, 3);
			Assert::AreEqual(13, answer);
		}
	};
}

#include "pch.h"
#include "CppUnitTest.h"

#include "StructuralExample.cpp"

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace StructuralExampleTests
{
	TEST_CLASS(StructuralExampleTests)
	{
	public:
		
		TEST_METHOD(TestMultiply)
		{
			int answer = Multiply(2, 10);
			Assert::AreEqual(20, answer);
		}

		TEST_METHOD(TestFactorial)
		{
			int answer = Factorial(5);
			Assert::AreEqual(120, answer);
		}

		TEST_METHOD(TestPower)
		{
			int answer = Power(3, 2);
			Assert::AreEqual(9, answer);
		}
	};
}

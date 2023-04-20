#include "pch.h"
#include "CppUnitTest.h"

#include "QuickSortObj.cpp"

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace QuickSortTests
{
	TEST_CLASS(QuickSortTests)
	{
	public:
		
		TEST_METHOD(TestMethod1)
		{
			const int SIZE = 9;
			int list[] = { 1, 7, 3, 4, 9, 3, 3, 1, 2 };
			QuickSortObj quickSortObj;
			quickSortObj.QuickSort(list, SIZE);
			Assert::AreEqual(1, list[0]);
			Assert::AreEqual(1, list[1]);
			Assert::AreEqual(2, list[2]);
			Assert::AreEqual(3, list[3]);
			Assert::AreEqual(3, list[4]);
			Assert::AreEqual(3, list[5]);
			Assert::AreEqual(4, list[6]);
			Assert::AreEqual(7, list[7]);
			Assert::AreEqual(9, list[8]);
		}
	};
}

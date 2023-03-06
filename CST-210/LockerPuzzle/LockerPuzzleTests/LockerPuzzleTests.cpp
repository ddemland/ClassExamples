#include "pch.h"
#include "CppUnitTest.h"

#include "LockerSolver.cpp"

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace LockerPuzzleTests
{
	TEST_CLASS(LockerPuzzleTests)
	{
	public:
		
		TEST_METHOD(TestStudent1)
		{
			LockerSolver lockerSolver(10);
			lockerSolver.StudentLockerChange(1);
			auto lockerStatus = lockerSolver.GetLockerStatus();
			for (auto cnt = 0; cnt < 10; cnt ++)
			{
				Assert::IsTrue(lockerStatus[cnt]);
			}
		}

		TEST_METHOD(TestStudent2)
		{
			LockerSolver lockerSolver(10);
			lockerSolver.StudentLockerChange(1);
			lockerSolver.StudentLockerChange(2);
			auto lockerStatus = lockerSolver.GetLockerStatus();
			Assert::IsTrue(lockerStatus[0]);
			Assert::IsFalse(lockerStatus[1]);
			Assert::IsTrue(lockerStatus[2]);
			Assert::IsFalse(lockerStatus[3]);
			Assert::IsTrue(lockerStatus[4]);
			Assert::IsFalse(lockerStatus[5]);
			Assert::IsTrue(lockerStatus[6]);
			Assert::IsFalse(lockerStatus[7]);
			Assert::IsTrue(lockerStatus[8]);
			Assert::IsFalse(lockerStatus[9]);
		}

		TEST_METHOD(TestStudent3)
		{
			LockerSolver lockerSolver(10);
			lockerSolver.StudentLockerChange(1);
			lockerSolver.StudentLockerChange(2);
			lockerSolver.StudentLockerChange(3);
			auto lockerStatus = lockerSolver.GetLockerStatus();
			Assert::IsTrue(lockerStatus[0]);
			Assert::IsFalse(lockerStatus[1]);
			Assert::IsFalse(lockerStatus[2]);
			Assert::IsFalse(lockerStatus[3]);
			Assert::IsTrue(lockerStatus[4]);
			Assert::IsTrue(lockerStatus[5]);
			Assert::IsTrue(lockerStatus[6]);
			Assert::IsFalse(lockerStatus[7]);
			Assert::IsFalse(lockerStatus[8]);
			Assert::IsFalse(lockerStatus[9]);
		}

		TEST_METHOD(TestStudent4)
		{
			LockerSolver lockerSolver(10);
			lockerSolver.StudentLockerChange(1);
			lockerSolver.StudentLockerChange(2);
			lockerSolver.StudentLockerChange(3);
			lockerSolver.StudentLockerChange(4);
			auto lockerStatus = lockerSolver.GetLockerStatus();
			Assert::IsTrue(lockerStatus[0]);
			Assert::IsFalse(lockerStatus[1]);
			Assert::IsFalse(lockerStatus[2]);
			Assert::IsTrue(lockerStatus[3]);
			Assert::IsTrue(lockerStatus[4]);
			Assert::IsTrue(lockerStatus[5]);
			Assert::IsTrue(lockerStatus[6]);
			Assert::IsTrue(lockerStatus[7]);
			Assert::IsFalse(lockerStatus[8]);
			Assert::IsFalse(lockerStatus[9]);
		}

		TEST_METHOD(TestStudent5)
		{
			LockerSolver lockerSolver(10);
			lockerSolver.StudentLockerChange(1);
			lockerSolver.StudentLockerChange(2);
			lockerSolver.StudentLockerChange(3);
			lockerSolver.StudentLockerChange(4);
			lockerSolver.StudentLockerChange(5);
			auto lockerStatus = lockerSolver.GetLockerStatus();
			Assert::IsTrue(lockerStatus[0]);
			Assert::IsFalse(lockerStatus[1]);
			Assert::IsFalse(lockerStatus[2]);
			Assert::IsTrue(lockerStatus[3]);
			Assert::IsFalse(lockerStatus[4]);
			Assert::IsTrue(lockerStatus[5]);
			Assert::IsTrue(lockerStatus[6]);
			Assert::IsTrue(lockerStatus[7]);
			Assert::IsFalse(lockerStatus[8]);
			Assert::IsTrue(lockerStatus[9]);
		}

		TEST_METHOD(TestStudent6)
		{
			LockerSolver lockerSolver(10);
			lockerSolver.StudentLockerChange(1);
			lockerSolver.StudentLockerChange(2);
			lockerSolver.StudentLockerChange(3);
			lockerSolver.StudentLockerChange(4);
			lockerSolver.StudentLockerChange(5);
			lockerSolver.StudentLockerChange(6);
			auto lockerStatus = lockerSolver.GetLockerStatus();
			Assert::IsTrue(lockerStatus[0]);
			Assert::IsFalse(lockerStatus[1]);
			Assert::IsFalse(lockerStatus[2]);
			Assert::IsTrue(lockerStatus[3]);
			Assert::IsFalse(lockerStatus[4]);
			Assert::IsFalse(lockerStatus[5]);
			Assert::IsTrue(lockerStatus[6]);
			Assert::IsTrue(lockerStatus[7]);
			Assert::IsFalse(lockerStatus[8]);
			Assert::IsTrue(lockerStatus[9]);
		}

		TEST_METHOD(TestStudent7)
		{
			LockerSolver lockerSolver(10);
			lockerSolver.StudentLockerChange(1);
			lockerSolver.StudentLockerChange(2);
			lockerSolver.StudentLockerChange(3);
			lockerSolver.StudentLockerChange(4);
			lockerSolver.StudentLockerChange(5);
			lockerSolver.StudentLockerChange(6);
			lockerSolver.StudentLockerChange(7);
			auto lockerStatus = lockerSolver.GetLockerStatus();
			Assert::IsTrue(lockerStatus[0]);
			Assert::IsFalse(lockerStatus[1]);
			Assert::IsFalse(lockerStatus[2]);
			Assert::IsTrue(lockerStatus[3]);
			Assert::IsFalse(lockerStatus[4]);
			Assert::IsFalse(lockerStatus[5]);
			Assert::IsFalse(lockerStatus[6]);
			Assert::IsTrue(lockerStatus[7]);
			Assert::IsFalse(lockerStatus[8]);
			Assert::IsTrue(lockerStatus[9]);
		}

		TEST_METHOD(TestStudent8)
		{
			LockerSolver lockerSolver(10);
			lockerSolver.StudentLockerChange(1);
			lockerSolver.StudentLockerChange(2);
			lockerSolver.StudentLockerChange(3);
			lockerSolver.StudentLockerChange(4);
			lockerSolver.StudentLockerChange(5);
			lockerSolver.StudentLockerChange(6);
			lockerSolver.StudentLockerChange(7);
			lockerSolver.StudentLockerChange(8);
			auto lockerStatus = lockerSolver.GetLockerStatus();
			Assert::IsTrue(lockerStatus[0]);
			Assert::IsFalse(lockerStatus[1]);
			Assert::IsFalse(lockerStatus[2]);
			Assert::IsTrue(lockerStatus[3]);
			Assert::IsFalse(lockerStatus[4]);
			Assert::IsFalse(lockerStatus[5]);
			Assert::IsFalse(lockerStatus[6]);
			Assert::IsFalse(lockerStatus[7]);
			Assert::IsFalse(lockerStatus[8]);
			Assert::IsTrue(lockerStatus[9]);
		}

		TEST_METHOD(TestStudent9)
		{
			LockerSolver lockerSolver(10);
			lockerSolver.StudentLockerChange(1);
			lockerSolver.StudentLockerChange(2);
			lockerSolver.StudentLockerChange(3);
			lockerSolver.StudentLockerChange(4);
			lockerSolver.StudentLockerChange(5);
			lockerSolver.StudentLockerChange(6);
			lockerSolver.StudentLockerChange(7);
			lockerSolver.StudentLockerChange(8);
			lockerSolver.StudentLockerChange(9);
			auto lockerStatus = lockerSolver.GetLockerStatus();
			Assert::IsTrue(lockerStatus[0]);
			Assert::IsFalse(lockerStatus[1]);
			Assert::IsFalse(lockerStatus[2]);
			Assert::IsTrue(lockerStatus[3]);
			Assert::IsFalse(lockerStatus[4]);
			Assert::IsFalse(lockerStatus[5]);
			Assert::IsFalse(lockerStatus[6]);
			Assert::IsFalse(lockerStatus[7]);
			Assert::IsTrue(lockerStatus[8]);
			Assert::IsTrue(lockerStatus[9]);
		}

		TEST_METHOD(TestStudent10)
		{
			LockerSolver lockerSolver(10);
			lockerSolver.StudentLockerChange(1);
			lockerSolver.StudentLockerChange(2);
			lockerSolver.StudentLockerChange(3);
			lockerSolver.StudentLockerChange(4);
			lockerSolver.StudentLockerChange(5);
			lockerSolver.StudentLockerChange(6);
			lockerSolver.StudentLockerChange(7);
			lockerSolver.StudentLockerChange(8);
			lockerSolver.StudentLockerChange(9);
			lockerSolver.StudentLockerChange(10);
			auto lockerStatus = lockerSolver.GetLockerStatus();
			Assert::IsTrue(lockerStatus[0]);
			Assert::IsFalse(lockerStatus[1]);
			Assert::IsFalse(lockerStatus[2]);
			Assert::IsTrue(lockerStatus[3]);
			Assert::IsFalse(lockerStatus[4]);
			Assert::IsFalse(lockerStatus[5]);
			Assert::IsFalse(lockerStatus[6]);
			Assert::IsFalse(lockerStatus[7]);
			Assert::IsTrue(lockerStatus[8]);
			Assert::IsFalse(lockerStatus[9]);
		}
	};
}

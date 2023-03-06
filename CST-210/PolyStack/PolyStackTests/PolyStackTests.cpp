#include "pch.h"
#include "CppUnitTest.h"

#include "StackableObject.cpp"
#include "StackableInt.cpp"
#include "StackableString.cpp"
#include "StackableFloat.cpp"
#include "Stack.cpp"

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace PolyStackTests
{
	TEST_CLASS(PolyStackTests)
	{
	public:
		
		TEST_METHOD(TestStackableInt)
		{
			auto obj = StackableInt(5);
			Assert::AreEqual((string)"5", obj.GetData());
			Assert::IsTrue(obj.HasData());
		}

		TEST_METHOD(TestStackableString)
		{
			auto obj = StackableString("Testing");
			Assert::AreEqual((string)"Testing", obj.GetData());
			Assert::IsTrue(obj.HasData());
		}

		TEST_METHOD(TestStackableFloat)
		{
			auto obj = StackableFloat(34.78F);
			Assert::AreEqual((string)"34.780000", obj.GetData());
			Assert::IsTrue(obj.HasData());
		}

		TEST_METHOD(TestStackEmpty)
		{
			Stack stack;
			auto obj = stack.Pop();
			Assert::IsNull(obj);
		}

		TEST_METHOD(TestPushStackFull)
		{
			Stack stack;
			StackableInt obj(3);
			Assert::IsTrue(stack.Push(&obj));
			Assert::IsTrue(stack.Push(&obj));
			Assert::IsTrue(stack.Push(&obj));
			Assert::IsTrue(stack.Push(&obj));
			Assert::IsTrue(stack.Push(&obj));
			Assert::IsFalse(stack.Push(&obj));
		}

		TEST_METHOD(TestPushItem)
		{
			Stack stack;
			StackableInt obj(3);
			Assert::IsTrue(stack.Push(&obj));
			auto retVal = stack.Pop();
			Assert::AreEqual((string)"3", retVal->GetData());
		}

		TEST_METHOD(TestPushLastItem)
		{
			Stack stack;
			StackableInt obj1(3);
			StackableInt obj2(10);
			Assert::IsTrue(stack.Push(&obj1));
			Assert::IsTrue(stack.Push(&obj1));
			Assert::IsTrue(stack.Push(&obj1));
			Assert::IsTrue(stack.Push(&obj1));
			Assert::IsTrue(stack.Push(&obj2));
			auto retVal = stack.Pop();
			Assert::AreEqual((string)"10", retVal->GetData());
		}

		TEST_METHOD(TestAllDataTypes)
		{
			Stack stack;
			StackableInt obj1(3);
			StackableString obj2("Testing");
			StackableFloat obj3(34.78F);
			Assert::IsTrue(stack.Push(&obj1));
			Assert::IsTrue(stack.Push(&obj2));
			Assert::IsTrue(stack.Push(&obj3));
			auto retVal = stack.Pop();
			Assert::AreEqual((string)"34.780000", retVal->GetData());
			retVal = stack.Pop();
			Assert::AreEqual((string)"Testing", retVal->GetData());
			retVal = stack.Pop();
			Assert::AreEqual((string)"3", retVal->GetData());
		}
	};
}

#include "pch.h"
#include "CppUnitTest.h"

#include "RPSObj.cpp"

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace RockPaperScissorsTests
{
	TEST_CLASS(RockPaperScissorsTests)
	{
	public:
		
		TEST_METHOD(TestCompare)
		{
			RPSObj obj(ComputerRock);
			Assert::AreEqual(Tie, obj.Compare(UserRock));
			Assert::AreEqual(PlayerWins, obj.Compare(UserPaper));
			Assert::AreEqual(ComputerWins, obj.Compare(UserScissors));

			RPSObj obj1(ComputerPaper);
			Assert::AreEqual(ComputerWins, obj1.Compare(UserRock));
			Assert::AreEqual(Tie, obj1.Compare(UserPaper));
			Assert::AreEqual(PlayerWins, obj1.Compare(UserScissors));

			RPSObj obj2(ComputerScissors);
			Assert::AreEqual(PlayerWins, obj2.Compare(UserRock));
			Assert::AreEqual(ComputerWins, obj2.Compare(UserPaper));
			Assert::AreEqual(Tie, obj2.Compare(UserScissors));
		}
	};
}

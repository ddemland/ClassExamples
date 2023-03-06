#include "pch.h"
#include "CppUnitTest.h"

//#include <chrono>
//#include <thread>

#include "Hand.cpp"
#include "Game.cpp"

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace MasterMindTests
{
	TEST_CLASS(MasterMindTests)
	{
	public:
		
		TEST_METHOD(TestCreateHand)
		{
			Hand hand;
			auto colorList = hand.GetColors();
			for (auto cnt = 0; cnt < MaxHand; cnt ++)
			{
				Assert::AreEqual(NoColor, colorList[cnt]);
			}
		}

		TEST_METHOD(TestSetColors)
		{
			int colors[] = {Red, Blue, Green, Yellow };
			Hand hand;
			hand.SetColors(colors);
			const auto colorList = hand.GetColors();
			for (auto cnt = 0; cnt < MaxHand; cnt ++)
			{
				Assert::AreEqual(colors[cnt], colorList[cnt]);
			}
		}

		TEST_METHOD(TestHandCompareNoMatch)
		{
			int colors[] = { Red, Blue, Green, Yellow };
			Hand hand1;
			hand1.SetColors(colors);
			Hand hand2;
			int colors2[] = { Orange, Orange, Orange, Orange };
			hand2.SetColors(colors2);
			const auto colorList = hand1.CompareHands(hand2);
			for (auto cnt = 0; cnt < MaxHand; cnt ++)
			{
				Assert::AreEqual(NoColor, colorList[cnt]);
			}
		}

		TEST_METHOD(TestHandCompareOneWrongPlace)
		{
			int colors[] = { Red, Blue, Green, Yellow };
			Hand hand1;
			hand1.SetColors(colors);
			Hand hand2;
			int colors2[] = { Yellow, Purple, Purple, Purple };
			hand2.SetColors(colors2);
			const auto colorList = hand1.CompareHands(hand2);

			Assert::AreEqual(White, colorList[0]);
			Assert::AreEqual(NoColor, colorList[1]);
			Assert::AreEqual(NoColor, colorList[2]);
			Assert::AreEqual(NoColor, colorList[3]);
		}

		TEST_METHOD(TestHandCompareOneRightPlace)
		{
			int colors[] = { Red, Blue, Green, Yellow };
			Hand hand1;
			hand1.SetColors(colors);
			Hand hand2;
			int colors2[] = { Red, Purple, Purple, Purple };
			hand2.SetColors(colors2);
			const auto colorList = hand1.CompareHands(hand2);

			Assert::AreEqual(Black, colorList[0]);
			Assert::AreEqual(NoColor, colorList[1]);
			Assert::AreEqual(NoColor, colorList[2]);
			Assert::AreEqual(NoColor, colorList[3]);
		}

		TEST_METHOD(TestHandCompareTwoRightTwoRightPlace)
		{
			int colors[] = { Red, Blue, Green, Yellow };
			Hand hand1;
			hand1.SetColors(colors);
			Hand hand2;
			int colors2[] = { Red, Green, Blue, Yellow };
			hand2.SetColors(colors2);
			const auto colorList = hand1.CompareHands(hand2);

			Assert::AreEqual(Black, colorList[0]);
			Assert::AreEqual(Black, colorList[1]);
			Assert::AreEqual(White, colorList[2]);
			Assert::AreEqual(White, colorList[3]);
		}

		TEST_METHOD(TestHandCompareOneRightPlaceOneRight)
		{
			int colors[] = { Red, Green, Green, Yellow };
			Hand hand1;
			hand1.SetColors(colors);
			Hand hand2;
			int colors2[] = { Purple, Green, Purple, Green };
			hand2.SetColors(colors2);
			const auto colorList = hand1.CompareHands(hand2);

			Assert::AreEqual(Black, colorList[0]);
			Assert::AreEqual(White, colorList[1]);
			Assert::AreEqual(NoColor, colorList[2]);
			Assert::AreEqual(NoColor, colorList[3]);
		}

		TEST_METHOD(TestHandCompareTwoRightPlace)
		{
			int colors[] = { Green, Red, Orange, Yellow };
			Hand hand1;
			hand1.SetColors(colors);
			Hand hand2;
			int colors2[] = { Red, Red, Yellow, Yellow };
			hand2.SetColors(colors2);
			const auto colorList = hand1.CompareHands(hand2);

			Assert::AreEqual(Black, colorList[0]);
			Assert::AreEqual(Black, colorList[1]);
			Assert::AreEqual(NoColor, colorList[2]);
			Assert::AreEqual(NoColor, colorList[3]);
		}

		TEST_METHOD(TestHandCompareTwoRightOneExtraWrongPlace)
		{
			int colors[] = { Purple, Yellow, Orange, Orange };
			Hand hand1;
			hand1.SetColors(colors);
			Hand hand2;
			int colors2[] = { Purple, Red, Orange, Green };
			hand2.SetColors(colors2);
			const auto colorList = hand1.CompareHands(hand2);

			Assert::AreEqual(Black, colorList[0]);
			Assert::AreEqual(Black, colorList[1]);
			Assert::AreEqual(NoColor, colorList[2]);
			Assert::AreEqual(NoColor, colorList[3]);
		}

		TEST_METHOD(TestHandCompareThreeRightOneWrong)
		{
			int colors[] = { Green, Orange, Red, Green };
			Hand hand1;
			hand1.SetColors(colors);
			Hand hand2;
			int colors2[] = { Yellow, Orange, Red, Green };
			hand2.SetColors(colors2);
			const auto colorList = hand1.CompareHands(hand2);

			Assert::AreEqual(Black, colorList[0]);
			Assert::AreEqual(Black, colorList[1]);
			Assert::AreEqual(Black, colorList[2]);
			Assert::AreEqual(NoColor, colorList[3]);
		}

		TEST_METHOD(TestHandSameMismatched)
		{
			int colors[] = { Red, Blue, Green, Yellow };
			Hand hand1;
			hand1.SetColors(colors);
			Hand hand2;
			int colors2[] = { Yellow, Purple, Purple, Purple };
			hand2.SetColors(colors2);

			Assert::IsFalse(hand1.HandsSame(hand2));
		}

		TEST_METHOD(TestHandSameMatched)
		{
			int colors[] = { Red, Blue, Green, Yellow };
			Hand hand1;
			hand1.SetColors(colors);
			Hand hand2;
			int colors2[] = { Red, Blue, Green, Yellow };
			hand2.SetColors(colors2);

			Assert::IsTrue(hand1.HandsSame(hand2));
		}

		//TEST_METHOD(TestGame)
		//{
		//	auto sameHandCnt = 0;
		//	for (auto testCnt = 0; testCnt < 300; testCnt ++)
		//	{
		//		for (auto cnt = 0; cnt < MaxHand; cnt ++)
		//		{
		//			Game game1;
		//			//this_thread::sleep_for(std::chrono::milliseconds(800));
		//			Game game2;
		//			auto hand1 = game1.GetComputerHand();
		//			auto hand2 = game2.GetComputerHand();

		//			if (hand1.HandsSame(hand2))
		//			{
		//				sameHandCnt ++;
		//			}
		//		}

		//		Assert::IsTrue(sameHandCnt < 5);
		//	}

		TEST_METHOD(TestGameGuessedHand)
		{
			Game game;
			Hand guessHand;
			guessHand.SetColors(game.GetComputerHand().GetColors());
			Assert::IsTrue(game.CorrectGuess(guessHand));

			int wrongGuess[] = {0, 0, 0, 0 };
			guessHand.SetColors(wrongGuess);
			Assert::IsFalse(game.CorrectGuess(guessHand));
		}

		TEST_METHOD(TestGameCompareHands)
		{
			Game game;
			Hand guessHand;
			int setGuessColors[] = { 0, 0, 0, 0 };
			auto gamesHandColors = game.GetComputerHand().GetColors();

			setGuessColors[0] = gamesHandColors[0] + 1;
			setGuessColors[1] = gamesHandColors[1];
			setGuessColors[2] = gamesHandColors[2] + 1;
			setGuessColors[3] = gamesHandColors[2];
			guessHand.SetColors(setGuessColors);

			const auto colorList = game.CompareHands(guessHand);

			Assert::AreEqual(Black, colorList[0]);
			Assert::AreEqual(White, colorList[1]);
			Assert::AreEqual(NoColor, colorList[2]);
			Assert::AreEqual(NoColor, colorList[3]);
		}
	};
}

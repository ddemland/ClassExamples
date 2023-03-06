#include "pch.h"
#include "CppUnitTest.h"

#include "Card.cpp"
#include "Deck.cpp"
#include "Hand.cpp""

using namespace Microsoft::VisualStudio::CppUnitTestFramework;

namespace BasicCardsTests
{
	TEST_CLASS(BasicCardsTests)
	{
	public:
		
		TEST_METHOD(TestCard)
		{
			Card card(2, 3);
			Assert::AreEqual(2, card.GetSuite());
			Assert::AreEqual(3, card.GetValue());
		}

		TEST_METHOD(TestDeckCreation)
		{
			Deck deck;
			for (auto suit = 0; suit < 4; suit ++)
			{
				for (auto value = 1; value <= 13; value ++)
				{
					Card card = deck.GetNextCard();
					Assert::AreEqual(suit, card.GetSuite());
					Assert::AreEqual(value, card.GetValue());
				}
			}

			auto card = deck.GetNextCard();
			Assert::AreEqual(-1, card.GetSuite());
			Assert::AreEqual(-1, card.GetValue());
		}

		TEST_METHOD(TestDeckShuffle)
		{
			int total = 0;
			Deck deck;
			deck.Shuffle();
			for (auto cnt = 0; cnt < MaxDeck; cnt ++)
			{
				auto card1 = deck.GetNextCard();
				auto card2 = deck.GetNextCard();
				if (card1.GetSuite() == card2.GetSuite())
				{
					auto value1 = card1.GetValue();
					auto value2 = card2.GetValue();

					if (
						(
							((value1 + 1) == value2) ||
							((value1 - 1) == value2) ||
							((value2 + 1) == value1) ||
							((value2 - 1) == value1)
						)
					   )
					{
						total ++;
					}
				}
			}

			Assert::IsTrue(total < 2);
		}

		TEST_METHOD(TestHand)
		{
			Deck deck;
			Hand hand;

			auto card = deck.GetNextCard();
			hand.AddCard(card);
			auto cards = hand.GetHand();
			Assert::AreEqual(1, (int)cards.size());

			card = deck.GetNextCard();
			hand.AddCard(card);
			cards = hand.GetHand();
			Assert::AreEqual(2, (int)cards.size());
		}
	};
}

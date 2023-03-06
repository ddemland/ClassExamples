
#include <ctime>

#include "Deck.h"

Deck::Deck(void)
{
	const int MaxSuits = 4;
	const int MaxValues = 13;
	m_topOfDeck = 0;
	for (auto suit = 0; suit < MaxSuits; suit ++)
	{
		for (auto value = 1; value <= MaxValues; value ++)
		{
			Card card(suit, value);
			m_deck.push_back(card);
		}
	}
}

Card Deck::GetNextCard(void)
{
	if (m_topOfDeck >= MaxDeck)
	{
		return Card(-1, -1);
	}

	return m_deck[m_topOfDeck++];
}

void Deck::Shuffle(void)
{
	const int MaxShuffle = 2000;
	srand(time(NULL));
	for (auto cnt = 0; cnt < MaxShuffle; cnt ++)
	{
		int idx1, idx2;
		while (true)
		{
			idx1 = rand() % MaxDeck;
			idx2 = rand() % MaxDeck;
			if (idx1 != idx2)
			{
				break;
			}
		}

		auto holdCard = m_deck[idx1];
		m_deck[idx1] = m_deck[idx2];
		m_deck[idx2] = holdCard;
	}

	m_topOfDeck = 0;
}

#pragma once

#include <vector>

using namespace std;

#include "Deck.h"

class Hand
{
private:
	vector<Card> m_cards;

public:
	void AddCard(Card card);
	vector<Card> GetHand(void);
};


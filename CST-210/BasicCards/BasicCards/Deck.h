#pragma once

#include <vector>

using namespace std;

#include "Card.h"

#define MaxDeck		52

class Deck
{
private:
	vector<Card> m_deck;
	int m_topOfDeck;

public:
	Deck(void);
	Card GetNextCard(void);
	void Shuffle(void);
};

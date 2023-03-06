#include "Hand.h"

void Hand::AddCard(Card card)
{
	m_cards.push_back(card);
}

vector<Card> Hand::GetHand(void)
{
	return m_cards;
}

#include "Card.h"

Card::Card(int suit, int value)
{
	m_suit = suit;
	m_value = value;
}

int Card::GetSuite(void)
{
	return m_suit;
}

int Card::GetValue(void)
{
	return m_value;
}

#pragma once
class Card
{
public:
	enum Suits { Hearts = 0, Clubs = 1, Dimons = 2, Spades = 3 };
	enum SpeicalCard { Ace = 1, Jack = 11, Queen = 12, King = 13 };

private:
	int m_suit;
	int m_value;

public:
	Card(int suit, int value);
	int GetSuite(void);
	int GetValue(void);
};

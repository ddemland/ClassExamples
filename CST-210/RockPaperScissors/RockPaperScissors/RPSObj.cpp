#include "RPSObj.h"

#include <xmemory>
#include <ctime>

RPSObj::RPSObj()
{
}

RPSObj::RPSObj(int compSetting)
{
	ComputerSelection = compSetting;
}

void RPSObj::ComputerGuess(void)
{
	srand(time(NULL));
	ComputerSelection = (rand() % 3) + 4;
}

int RPSObj::Compare(int userSelection)
{
	auto outcome = userSelection * ComputerSelection;
	switch (outcome)
	{
		case 6:
		case 8:
		case 15:
			return PlayerWins;

		case 5:
		case 12:
			return ComputerWins;

		default:
			return Tie;
	}
}

int RPSObj::GetComputerSelection(void)
{
	return ComputerSelection;
}

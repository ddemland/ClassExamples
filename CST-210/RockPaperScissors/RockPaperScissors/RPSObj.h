#pragma once

#define UserRock			1
#define UserPaper			2
#define UserScissors		3
#define ComputerRock		4
#define ComputerPaper		5
#define ComputerScissors	6

#define PlayerWins		1
#define ComputerWins	2
#define Tie				3

class RPSObj
{
private:
	int ComputerSelection;

public:
	RPSObj();
	RPSObj(int compSetting);
	void ComputerGuess(void);
	int Compare(int userSelection);
	int GetComputerSelection(void);
};


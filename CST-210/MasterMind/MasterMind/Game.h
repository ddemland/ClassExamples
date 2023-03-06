#pragma once

#include "Hand.h"

#define MaxHands    8

class Game
{
private:
    Hand m_computerHand;

public:
    Game();
    bool CorrectGuess(Hand hand);
    int *CompareHands(Hand hand);
    Hand GetComputerHand(void) const;
};

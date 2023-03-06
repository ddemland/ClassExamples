
#include <ctime>
#include <cstdlib>

using namespace std;

#include "Game.h"

Game::Game()
{
    int colors[MaxHand];
    srand(time(NULL));
    for (auto cnt = 0; cnt < MaxHand; cnt ++)
    {
        colors[cnt] = (rand() % 6) + 1;
    }

    m_computerHand.SetColors(colors);
}

bool Game::CorrectGuess(Hand hand)
{
    return m_computerHand.HandsSame(hand);
}

int *Game::CompareHands(Hand hand)
{
    return m_computerHand.CompareHands(hand);
}

Hand Game::GetComputerHand(void) const
{
    return m_computerHand;
}

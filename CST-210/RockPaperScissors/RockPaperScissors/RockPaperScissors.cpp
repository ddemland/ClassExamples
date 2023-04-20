// RockPaperScissors.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>

#include "RPSObj.h"

using namespace std;

int main()
{
    cout << "Welcome to Rock, Paper, Scissors." << endl;
    string answer;
    int choice;

    do
    {
        while (true)
        {
            cout << "Please Select: 1 - Rock, 2 - Paper, 3 - Scossors: ";
            cin >> choice;
            if ((choice >= 1) && (choice <= 3))
            {
                break;
            }

            cout << "Please enter 1, 2 or 3." << endl;
        }

        RPSObj rpsObj;
        rpsObj.ComputerGuess();

        string compSelectStr;
        switch(rpsObj.GetComputerSelection())
        {
            case ComputerRock:
                compSelectStr = "Rock";
                break;

            case ComputerPaper:
                compSelectStr = "Paper";
                break;

            default:
                compSelectStr = "Scissors";
                break;
        }

        switch (rpsObj.Compare(choice))
        {
            case PlayerWins:
                cout << "Computer selected " << compSelectStr << " you win!!!" << endl;
                break;

            case ComputerWins:
                cout << "Computer selected " << compSelectStr << " you lost." << endl;
                break;

            default:
                cout << "Computer selected " << compSelectStr << " you tied." << endl;
                break;
        }

        cout << "Do you want to play again? ";
        cin >> answer;

    } while (tolower(answer[0]) != 'n');
}

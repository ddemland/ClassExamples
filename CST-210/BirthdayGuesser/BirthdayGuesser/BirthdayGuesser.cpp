// BirthdayGuesser.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <iomanip>
#include <string>

using namespace std;

#include "BirthdaySolver.h"

int main()
{
    BirthdaySolver guesser;
    int day = 0;

    do
    {
        auto currGrid = guesser.GetCurrentDayGrid();
        for (auto row = 0; row < GridSize; row ++)
        {
            for (auto column = 0; column < GridSize; column ++)
            {
                cout << setw(4) << currGrid[row][column];
            }

            cout << endl;
        }

        cout << endl;
        cout << "Is your birthday in this set? (y/n) ";
        string answer;
        getline(cin, answer);
        if (tolower(answer[0]) == 'y')
        {
            day += guesser.GetAddDays();
        }
    } while (guesser.NextGrid());

    cout << "Your birthday is " << day << endl;
}

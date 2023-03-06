// GameOfLife.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <chrono>
#include <thread>

using namespace std;

#include "GOLObj.h"

void DisplayBoard(bool **board);

int main()
{
    auto golObj = new GOLObj();
    auto cnt = 0;
    while (cnt < 20)
    {
        auto board = golObj->GetBoard();
        golObj->UpdateBoard();
        DisplayBoard(golObj->GetBoard());
        this_thread::sleep_for(chrono::milliseconds(1000));
        cnt ++;
    }

    delete golObj;
}

void DisplayBoard(bool **board)
{
    system("cls");
    for (auto row = 0; row < MaxRow; row ++)
    {
        for (auto column = 0; column < MaxColumn; column ++)
        {
            auto ch = board[row][column] ? "**" : "||";
            cout << ch;
        }

        cout << endl;
    }
}

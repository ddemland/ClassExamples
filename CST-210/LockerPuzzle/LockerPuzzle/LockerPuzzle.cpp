// LockerPuzzle.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <string>

using namespace std;

#include "LockerSolver.h"

void OutputStats(LockerSolver solver);

int main()
{
    LockerSolver lockerSolver(100);
    for (auto cnt = 0; cnt < lockerSolver.GetNumberOfLockers(); cnt ++)
    {
        lockerSolver.StudentLockerChange(cnt + 1);
    }

    OutputStats(lockerSolver);

    LockerSolver lockerSolver2(50);
    for (auto cnt = 0; cnt < lockerSolver.GetNumberOfLockers(); cnt ++)
    {
        lockerSolver2.StudentLockerChange(cnt + 1);
    }

    OutputStats(lockerSolver2);
}

void OutputStats(LockerSolver solver)
{
    auto lockerStatus = solver.GetLockerStatus();
    auto totalLockers = solver.GetNumberOfLockers();
    cout << "Doing " << totalLockers << " lockers:" << endl;
    cout << "Lockers that are still open:" << endl;
    string outputList = "";
    for (auto cnt = 0; cnt < totalLockers; cnt ++)
    {
        if (lockerStatus[cnt])
        {
            if (!outputList.empty())
            {
                outputList += ", ";
            }

            outputList += to_string(cnt + 1);
        }
    }

    cout << "     " << outputList << endl << endl;
}

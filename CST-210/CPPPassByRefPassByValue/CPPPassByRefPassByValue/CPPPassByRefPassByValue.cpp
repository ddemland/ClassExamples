// CPPPassByRefPassByValue.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>

using namespace std;

void IncrementByValue(int num);

void IncrementByReference(int &num)
{
    num ++;
}

int main()
{
    auto x = 2;
    cout << "Before increment by value x = " << x << endl;
    IncrementByValue(x);
    cout << "Before increment by value x = " << x << endl;

    IncrementByReference(x);
    cout << "Before increment by reference x = " << x << endl;
}

void IncrementByValue(int num)
{
    num ++;
}

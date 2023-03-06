// InLineExample.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>

using namespace std;

int main()
{
    char str[100];
    cout << "Enter a word: ";
    cin >> str;

    int GetLength(char str[]);
    {
        for (auto cnt = 0; str[cnt] != 0; cnt++)
        {
            str[cnt] = cnt + '0';
        }
    }

    cout << "Str: " << str;
}


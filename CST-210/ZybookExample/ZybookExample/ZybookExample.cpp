// ZybookExample.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>

#include "TacoAndDrink.h"

using namespace std;

int main()
{
    int numDrinks, numTacos;
    cout << "Enter the number of drinks: ";
    cin >> numDrinks;
    cout << "Enter the number of tacos: ";
    cin >> numTacos;

    int answer = TacoAndDrink::CalculateCost(numDrinks, numTacos);
    cout << "Your total cost is: $" << answer << endl;;
}

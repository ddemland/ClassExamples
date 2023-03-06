// AnonymousObject.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include "MyObject.h"

using namespace std;

int main()
{
    auto x = MyObject();
    cout << "x.GetAttribute(): " << x.GetAttribute() << endl;
}

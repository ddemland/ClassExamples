#pragma once

#include <vector>
#include <string>
using namespace std;

class TheSeven
{
public:
    void static GetHighestAndLowest(vector<int> list, int &highest, int &lowest);
    int static Calc50FirstSevens();
    void static First10Factorial(int factorialNum, int &total);
    bool static IsPalindrome(string str);
    bool static IsPrime(int num);
};


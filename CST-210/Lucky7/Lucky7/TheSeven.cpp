
#include <algorithm>
#include "TheSeven.h"

void TheSeven::GetHighestAndLowest(vector<int> list, int& highest, int& lowest)
{
    int len = list.size();
    sort(list.begin(), list.end());
    lowest = list[0];
    highest = list[len - 1];
}

int TheSeven::Calc50FirstSevens()
{
    int total = 0;
    for (int cnt = 0; cnt < 50; cnt ++)
    {
        total += (cnt + 1) * 7;
    }

    return total;
}

void TheSeven::First10Factorial(int factorialNum, int &total)
{
    int maxLoop = factorialNum > 10 ? 10 : factorialNum;
    total = 1;
    for (int cnt = 1; cnt <= maxLoop; cnt ++)
    {
        total *= cnt;
    }
}

bool TheSeven::IsPalindrome(string str)
{
    int lowEndIdx = 0, highEndIdx = str.size() - 1;
    int loopCnt = str.size() / 2;
    for (int cnt = 0; cnt < loopCnt; cnt++)
    {
        if (str[lowEndIdx] != str[highEndIdx])
        {
            return false;
        }
    }

    return true;
}

bool TheSeven::IsPrime(int num)
{
    int maxLoop = num / 2;
    for (int i = 2; i < maxLoop; i ++)
    {
        if (num % i == 0)
        {
            return false;
        }
    }

    return true;
}

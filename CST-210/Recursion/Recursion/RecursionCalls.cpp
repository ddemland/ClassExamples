#include "RecursionCalls.h"

int RecursionCalls::Factorial(int num)
{
    if (num == 0)
    {
        return 1;
    }

    return num * Factorial(num - 1);
}

//
//   Starts with 0 and 1 with each subsequent number being the sum
//      of the previous two numbers. Example:
// 
//   Series:   0  1  1  2  3  5  8  13  21  34  55  89
//   Indices:  0  1  2  3  4  5  6  7   8   9   10  11
//

int RecursionCalls::Fibonacci(int index)
{
    if (index == 0)
    {
        return 0;
    }

    if (index == 1)
    {
        return 1;
    }

    return Fibonacci(index - 1) + Fibonacci(index - 2);
}

bool RecursionCalls::IsPalindrome(const string &str)
{
    if (str.size() <= 1)
    {
        return true;
    }

    if (str[0] != str[str.size() - 1])
    {
        return false;
    }

    return IsPalindrome(str.substr(1, str.size() - 2));
}

bool RecursionCalls::IsPalindrome(const string &str, int low, int high)
{
    if (high <= low)
    {
        return true;
    }

    if (str[low] != str[high])
    {
        return false;
    }

    return IsPalindrome(str, low + 1, high -1);
}

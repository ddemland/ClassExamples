#pragma once

#include <string>

using namespace std;

class RecursionCalls
{
public:
    int static Factorial(int num);
    int static Fibonacci(int index);
    bool static IsPalindrome(const string &str);
    bool static IsPalindrome(const string &str, int low, int high);
};

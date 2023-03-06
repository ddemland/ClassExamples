// StructuralExample.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>

using namespace std;

int Multiply(int num1, int num2);
int Factorial(int num);
long Power(int base, int power);

int main()
{
	//  Multiply
	int num1, num2;
	cout << "Enter first number: ";
	cin >> num1;
	cout << "Enter second number: ";
	cin >> num2;
	int answer = Multiply(num1, num2);
	cout << "Product: " << answer << endl;

	//  Factorial
	cout << "Enter factorial number: ";
	cin >> num1;

	answer = Factorial(num1);
	cout << "Product: " << answer << endl;

	//  Power
	cout << "Enter base number: ";
	cin >> num1;
	cout << "Enter power number: ";
	cin >> num2;

	auto answer2 = Power(num1, num2);
	cout << "Product: " << answer2 << endl;
}

int Multiply(int num1, int num2)
{
	int product = num1 * num2;
	return product;
}

int Factorial(int num)
{
	int total = 1;
	for (int cnt = num; cnt > 0; cnt--)
	{
		total *= cnt;
	}

	return total;
}

long Power(int base, int power)
{
	long total = base;

	for (int cnt = 1; cnt < power; cnt++)
	{
		total *= base;
	}

	return total;
}

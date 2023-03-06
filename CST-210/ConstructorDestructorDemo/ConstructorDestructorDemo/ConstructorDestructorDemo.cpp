// ConstructorDestructorDemo.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>

using namespace std;

class Person
{
public:
    Person()
    {
        cout << "Performs tasks for Person's Constructor" << endl;
    }
    ~Person()
    {
        cout << "Performs tasks for Person's Destructor" << endl;
    }
};

class Employee : public Person
{
public:
    Employee()
    {
        cout << "Performs tasks for Employee's Constructor" << endl;
    }
    ~Employee()
    {
        cout << "Performs tasks for Employee's Destructor" << endl;
    }
};

class Faculty : Employee
{
public:
    Faculty()
    {
        cout << "Performs tasks for Faculty's Constructor" << endl;
    }
    ~Faculty()
    {
        cout << "Performs tasks for Faculty's Destructor" << endl;
    }
};

int main()
{
    auto faculty = new Faculty();
    delete faculty;
}

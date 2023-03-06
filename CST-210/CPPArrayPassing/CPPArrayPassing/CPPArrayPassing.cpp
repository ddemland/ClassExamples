// CPPArrayPassing.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <thread>

using namespace std;

void DisplayArray(int array[], int length);
void ShuffleArrayByValue(int array[], int length);
void ShuffleArrayByReference(int array[], int length);
void ShuffleArrayByPointer(int *array, int length);

int main()
{
    int array1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    ShuffleArrayByValue(array1, 10);
    cout << "Array after value shuffle:" << endl;
    DisplayArray(array1, 10);

    this_thread::sleep_for(1s);

    int array2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    ShuffleArrayByReference(array2, 10);
    cout << "Array after reference shuffle:" << endl;
    DisplayArray(array2, 10);

    this_thread::sleep_for(1s);

    int array3[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    ShuffleArrayByPointer(array3, 10);
    cout << "Array after pointer shuffle:" << endl;
    DisplayArray(array3, 10);
}

void DisplayArray(int array[], int length)
{
    for (auto idx = 0; idx < length; idx++)
    {
        cout << array[idx] << endl;
    }
}

void ShuffleArrayByValue(int array[], int length)
{
    srand(time(0));
    for (auto cnt = 0; cnt < 10000; cnt ++)
    {
        auto idx1 = rand() % length;
        auto idx2 = rand() % length;
        int hold;
        hold = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = hold;
    }
}

void ShuffleArrayByReference(int array[], int length)
{
    srand(time(0));
    for (auto cnt = 0; cnt < 10000; cnt++)
    {
        auto idx1 = rand() % length;
        auto idx2 = rand() % length;
        int hold;
        hold = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = hold;
    }
}

void ShuffleArrayByPointer(int *array, int length)
{
    srand(time(0));
    for (auto cnt = 0; cnt < 10000; cnt++)
    {
        auto idx1 = rand() % length;
        auto idx2 = rand() % length;
        int hold;
        hold = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = hold;
    }
}
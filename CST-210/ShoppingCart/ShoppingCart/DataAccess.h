#pragma once

#include <string>
#include <format>
#include <iostream>
#include <fstream>

using namespace std;

#define CartRecord      1
#define CustomerRecord  2
#define ItemRecord      3

#include "Cart.h"

class DataAccess
{
private:
    string m_fileName;
    string CreateCartRecord(Cart &cart);
    string CreateCustomerRecord(Customer *customer);
    string CreateItemRecord(Item &item, int orderNum);
    vector<string> Split(string str, string token);

public:
    DataAccess(string fileName);
    void SaveData(Cart &cart);
    Cart LoadData(void);
};

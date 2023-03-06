#pragma once

#include <vector>
#include <format>

#include "Item.h"

using namespace std;

class Customer
{
private:
    vector<Item *>m_items;
    int m_id;
    int m_orderNumber;

public:
    Customer();
    Customer(int id, int orderNum);
    void SetID(int id);
    void SetOrderNumber(int num);
    void Add(Item *item);
    vector<Item *> GetItems(void);
    int GetId(void);
    int GetOrderNumber(void);
    string FormatForCSV(void);
};

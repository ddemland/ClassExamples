#pragma once

#include <string>

using namespace std;

#define SoapItemID      1
#define MeatItemID      2
#define FruitItemID     3

class Item
{
private:
    int m_typeID;

protected:
    int m_quantity;
    double m_price;
    string m_description;
    double m_totalPrice;

public:
    Item(int id);
    int GetTypeID(void);
    int GetQuantity(void);
    double GetPrice(void);
    string GetDescription(void);
    double GetTotalPrice(void);
    virtual string FormatForCSV(void) = 0;
};


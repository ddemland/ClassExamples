
#include "Customer.h"

Customer::Customer()
{
    m_id = -1;
    m_orderNumber = -1;
}

Customer::Customer(int id, int orderNum) :
        m_id(id), m_orderNumber(orderNum)
{
}

void Customer::SetID(int id)
{
    m_id = id;
}

void Customer::SetOrderNumber(int num)
{
    m_orderNumber = num;
}

void Customer::Add(Item *item)
{
    m_items.push_back(item);
}

vector<Item *> Customer::GetItems(void)
{
    return m_items;
}

int Customer::GetId(void)
{
    return m_id;
}

int Customer::GetOrderNumber(void)
{
    return m_orderNumber;
}

string Customer::FormatForCSV(void)
{
    return format("{},{}", m_id, m_orderNumber);
}

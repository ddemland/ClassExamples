#pragma once

#include <format>

#include "Customer.h"

class Cart
{
private:
    Customer *m_customer;
    int m_cartNumber;

public:
    Cart();
    Cart(int cartNum, Customer *customer);
    void SetCartNumber(int num);
    void SetCustomer(Customer *customer);
    int GetCartNumber(void);
    Customer *GetCustomer(void);
    string FormatForCSV(void);
};

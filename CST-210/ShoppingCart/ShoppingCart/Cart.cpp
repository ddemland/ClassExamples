
#include "Cart.h"

Cart::Cart()
{
    m_cartNumber = 0;
    m_customer = nullptr;
}

Cart::Cart(int cartNum, Customer *customer)
{
    m_cartNumber = cartNum;
    m_customer = customer;
}

void Cart::SetCartNumber(int num)
{
    m_cartNumber = num;
}

void Cart::SetCustomer(Customer *customer)
{
    m_customer = customer;
}

int Cart::GetCartNumber(void)
{
    return m_cartNumber;
}

Customer *Cart::GetCustomer(void)
{
    return m_customer;
}

string Cart::FormatForCSV(void)
{
    return format("{},{}", m_cartNumber, m_customer->GetId());
}


#include "Soap.h"

Soap::Soap(int quantity, double price, string description, double totalPrice) : Item(SoapItemID)
{
    m_quantity = quantity;
    m_price = price;
    m_description = description;
    m_totalPrice = totalPrice;
}

string Soap::FormatForCSV(void)
{
    return format("{},{},{:.02f},{:.02f},{}", GetTypeID(), m_quantity, m_price, m_totalPrice, m_description);
}

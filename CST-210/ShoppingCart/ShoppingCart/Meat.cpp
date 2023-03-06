
#include "Meat.h"

Meat::Meat(int quantity, double price, string description, double totalPrice) : Item(MeatItemID)
{
    m_quantity = quantity;
    m_price = price;
    m_description = description;
    m_totalPrice = totalPrice;
}

string Meat::FormatForCSV(void)
{
    return format("{},{},{:.02f},{:.02f},{}", GetTypeID(), m_quantity, m_price, m_totalPrice, m_description);
}


#include "Fruit.h"

Fruit::Fruit(int quantity, double price, string description, double totalPrice) : Item(FruitItemID)
{
    m_quantity = quantity;
    m_price = price;
    m_description = description;
    m_totalPrice = totalPrice;
}

string Fruit::FormatForCSV(void)
{
    return format("{},{},{:.02f},{:.02f},{}", GetTypeID(), m_quantity, m_price, m_totalPrice, m_description);
}

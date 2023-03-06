#include "Item.h"

Item::Item(int id)
{
    m_typeID = id;
    m_quantity = 0;
    m_price = 0.0F;
    m_description = "";
    m_totalPrice = 0.0F;
}

int Item::GetTypeID(void)
{
    return m_typeID;
}

int Item::GetQuantity(void)
{
    return m_quantity;
}

double Item::GetPrice(void)
{
    return m_price;
}

string Item::GetDescription(void)
{
    return m_description;
}

double Item::GetTotalPrice(void)
{
    return m_totalPrice;
}

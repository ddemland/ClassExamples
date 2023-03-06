#pragma once

#include <format>

#include "Item.h"

class Meat : public Item
{
public:
    Meat(int quantity, double price, string description, double totalPrice);
    string FormatForCSV(void);
};


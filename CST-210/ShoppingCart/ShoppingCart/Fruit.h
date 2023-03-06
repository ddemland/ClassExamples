#pragma once

#include <format>

#include "Item.h"

class Fruit : public Item
{
public:
    Fruit(int quantity, double price, string description, double totalPrice);
    string FormatForCSV(void);
};


#pragma once

#include <format>

#include "Item.h"

class Soap : public Item
{
public:
    Soap(int quantity, double price, string description, double totalPrice);
    string FormatForCSV(void);
};


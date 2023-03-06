#pragma once

#include "StackableObject.h"
class StackableInt : public StackableObject
{
private:
    int m_data;

public:
    StackableInt(int data);
    string GetData(void) override;
    bool HasData(void) override;
};


#pragma once

#include <string>

using namespace std;

#include "StackableObject.h"


class StackableFloat : public StackableObject
{
private:
    float m_data;

public:
    StackableFloat(float data);
    string GetData(void) override;
    bool HasData(void) override;
};


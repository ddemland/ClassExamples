#pragma once

#include <string>

using namespace std;

#include "StackableObject.h"

class StackableString : public StackableObject
{
private:
    string m_data;

public:
    StackableString(string str);
    string GetData(void) override;
    bool HasData(void) override;
};


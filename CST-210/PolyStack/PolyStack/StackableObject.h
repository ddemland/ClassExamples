#pragma once

#include <string>

using namespace std;

class StackableObject
{
public:
    virtual ~StackableObject() = default;
    virtual string GetData(void) = 0;
    virtual bool HasData(void);
};


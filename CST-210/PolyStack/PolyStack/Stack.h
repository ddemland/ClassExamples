#pragma once

#include "StackableObject.h"

#define StackSize 5

class Stack
{
private:
    StackableObject *m_stack[StackSize];
    int m_index;

public:
    Stack();
    bool Push(StackableObject *obj);
    StackableObject *Pop(void);
};


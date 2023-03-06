#include "Stack.h"

Stack::Stack()
{
    m_index = -1;
}

bool Stack::Push(StackableObject* obj)
{
    if (m_index >= (StackSize - 1))
    {
        return false;
    }

    m_stack[++ m_index] = obj;
    return true;
}

StackableObject* Stack::Pop(void)
{
    if (m_index < 0)
    {
        return nullptr;
    }

    return m_stack[m_index --];
}

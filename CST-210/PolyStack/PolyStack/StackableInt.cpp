#include "StackableInt.h"

StackableInt::StackableInt(int data)
{
    m_data = data;
}

string StackableInt::GetData(void)
{
    return to_string(m_data);
}

bool StackableInt::HasData(void)
{
    return true;
}

#include "StackableString.h"

StackableString::StackableString(string str)
{
    m_data = str;
}

string StackableString::GetData(void)
{
    return m_data;
}

bool StackableString::HasData(void)
{
    return true;
}

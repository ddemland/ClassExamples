#include "StackableFloat.h"


StackableFloat::StackableFloat(float data)
{
    m_data = data;
}

string StackableFloat::GetData(void)
{
    return to_string(round(m_data * 100.0) / 100.0);
}

bool StackableFloat::HasData(void)
{
    return true;
}

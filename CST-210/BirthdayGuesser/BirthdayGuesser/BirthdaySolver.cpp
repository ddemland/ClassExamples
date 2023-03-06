#include "BirthdaySolver.h"

BirthdaySolver::BirthdaySolver()
{
    m_currDayGrid = 0;
}

array<array<int, GridSize>, GridSize> BirthdaySolver::GetCurrentDayGrid(void)
{
    return m_dates[m_currDayGrid];
}

int BirthdaySolver::GetAddDays(void)
{
    return m_dates[m_currDayGrid][0][0];
}

bool BirthdaySolver::NextGrid(void)
{
    if (m_currDayGrid < MaxGuesses - 1)
    {
        m_currDayGrid ++;
        return true;
    }

    return false;
}

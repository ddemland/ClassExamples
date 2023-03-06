#include "LockerSolver.h"

LockerSolver::LockerSolver(int numLockers)
{
    m_numberOfLockers = numLockers;
    m_lockerStatus = new bool[m_numberOfLockers];
    InitLockers();
}

void LockerSolver::InitLockers(void)
{
    for (auto lockerCnt = 0; lockerCnt < m_numberOfLockers; lockerCnt ++)
    {
        m_lockerStatus[lockerCnt] = false;
    }
}

int LockerSolver::GetNumberOfLockers(void)
{
    return m_numberOfLockers;
}

void LockerSolver::StudentLockerChange(int studentNum)
{
    auto lockerNum = studentNum - 1;
    while (lockerNum < m_numberOfLockers)
    {
        m_lockerStatus[lockerNum] = !m_lockerStatus[lockerNum];
        lockerNum += studentNum;
    }
}

bool *LockerSolver::GetLockerStatus(void)
{
    return m_lockerStatus;
}

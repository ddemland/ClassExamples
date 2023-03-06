#pragma once
class LockerSolver
{
private:
    int m_numberOfLockers;
    bool *m_lockerStatus;
    void InitLockers(void);

public:
    LockerSolver(int numLockers);
    int GetNumberOfLockers(void);
    void StudentLockerChange(int studentNum);
    bool *GetLockerStatus(void);
};


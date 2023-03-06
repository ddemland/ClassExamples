#pragma once

#define MaxRow      12
#define MaxColumn   12

class GOLObj
{
private:
    bool **m_board;
    bool **CreateBoard(void);
    bool static ValidRowIndex(int index);
    bool static ValidColumnIndex(int index);
    void CreateStartLiveCells(void);
    void DeleteBoard(bool **board);

public:
    GOLObj();
    ~GOLObj();
    bool **GetBoard(void);
    void UpdateBoard(void);
};


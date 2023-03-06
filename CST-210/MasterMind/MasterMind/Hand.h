#pragma once

#define MaxHand     4

#define NoColor     0
#define Red         1
#define Orange      2
#define Yellow      3
#define Green       4
#define Blue        5
#define Purple      6
#define Black       7
#define White       8

#define MacSelectColors 6

class Hand
{
private:
    int m_color[MaxHand];
    bool m_checked[MaxHand];

public:
    Hand();
    int *GetColors(void);
    void SetColors(int *colorList);
    int *CompareHands(Hand hand);
    bool HandsSame(Hand hand);

private:
    void ClearCheckStatus(void);
    bool RightColorWrongSpot(int color, int lookForIdx, bool *checkList);
};


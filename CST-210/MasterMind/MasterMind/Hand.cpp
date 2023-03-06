#include "Hand.h"


Hand::Hand()
{
    for (auto cnt = 0; cnt < MaxHand; cnt ++)
    {
        m_color[cnt] = NoColor;
        m_checked[cnt] = false;
    }
}

int* Hand::GetColors(void)
{
    return m_color;
}

void Hand::SetColors(int* colorList)
{
    for (auto cnt = 0; cnt < MaxHand; cnt ++)
    {
        m_color[cnt] = colorList[cnt];
    }
}

int* Hand::CompareHands(Hand hand)
{
    static int answerSet[MaxHand];
    bool correctItem[MaxHand] = { false, false, false, false };
    const auto colorList = hand.GetColors();
    auto blackCnt = 0;
    auto whiteCnt = 0;

    for (auto cnt = 0; cnt < MaxHand; cnt ++)
    {
        if (m_color[cnt] == colorList[cnt])
        {
            correctItem[cnt] = true;
            blackCnt ++;
        }
    }

    for (auto cnt = 0; cnt < MaxHand; cnt ++)
    {
        if (correctItem[cnt])
        {
            continue;
        }

        if (RightColorWrongSpot(colorList[cnt], cnt, correctItem))
        {
            whiteCnt ++;
        }
    }

    int idx;
    for (idx = 0; idx < blackCnt; idx ++)
    {
        answerSet[idx] = Black;
    }

    for (; idx < blackCnt + whiteCnt; idx ++)
    {
        answerSet[idx] = White;
    }

    for (; idx < MaxHand; idx ++)
    {
        answerSet[idx] = NoColor;
    }

    return answerSet;
}

bool Hand::HandsSame(Hand hand)
{
    auto colorList = hand.GetColors();
    for (auto cnt = 0; cnt < MaxHand; cnt ++)
    {
        if (m_color[cnt] != colorList[cnt])
        {
            return false;
        }
    }

    return true;
}

void Hand::ClearCheckStatus(void)
{
    for (auto cnt = 0; cnt < MaxHand; cnt ++)
    {
        m_checked[cnt] = false;
    }
}

bool Hand::RightColorWrongSpot(int color, int lookForIdx, bool *checkList)
{
    bool rightColorFlag = false;

    if (checkList[lookForIdx])
    {
        return false;
    }

    for (auto cnt = 0; cnt < MaxHand; cnt ++)
    {
        if (cnt == lookForIdx)
        {
            if (m_color[cnt] == color)
            {
                break;
            }

            continue;
        }

        if (checkList[cnt])
        {
            continue;
        }

        if (m_color[cnt] == color)
        {
            rightColorFlag = true;
            break;
        }
    }

    return rightColorFlag;
}

#include "GOLObj.h"

GOLObj::GOLObj()
{
    m_board = CreateBoard();
    CreateStartLiveCells();
}

GOLObj::~GOLObj()
{
    DeleteBoard(m_board);
}

bool **GOLObj::CreateBoard(void)
{
    auto newBoard = new bool *[MaxRow];
    for (auto row = 0; row < MaxRow; row ++)
    {
        newBoard[row] = new bool[MaxColumn];
        for (auto column = 0; column < MaxColumn; column ++)
        {
            newBoard[row][column] = false;
        }
    }

    return newBoard;
}

bool GOLObj::ValidRowIndex(int index)
{
    return((index >= 0) && (index < MaxRow));
}

bool GOLObj::ValidColumnIndex(int index)
{
    return ((index >= 0) && (index < MaxColumn));
}

void GOLObj::CreateStartLiveCells(void)
{
    m_board[1][2] = true;
    m_board[2][3] = true;
    m_board[2][7] = true;
    m_board[2][8] = true;
    m_board[2][9] = true;
    m_board[3][1] = true;
    m_board[3][2] = true;
    m_board[3][3] = true;
    m_board[8][2] = true;
    m_board[9][1] = true;
    m_board[9][2] = true;
    m_board[10][2] = true;
}

void GOLObj::DeleteBoard(bool **board)
{
    for (auto row = 0; row < MaxRow; row ++)
    {
        delete[] board[row];
    }

    delete[] board;
}

void GOLObj::UpdateBoard(void)
{
    auto newBoard = CreateBoard();
    for (auto row = 0; row < MaxRow; row ++)
    {
        for (auto column = 0; column < MaxColumn; column ++)
        {
            auto neighbors = 0;
            if (ValidRowIndex(row) && ValidColumnIndex(column + 1))
            {
                neighbors += m_board[row][column + 1] ? 1 : 0;
            }
            if (ValidRowIndex(row) && ValidColumnIndex(column - 1))
            {
                neighbors += m_board[row][column - 1] ? 1 : 0;
            }

            if (ValidRowIndex(row + 1) && ValidColumnIndex(column))
            {
                neighbors += m_board[row + 1][column] ? 1 : 0;
            }

            if (ValidRowIndex(row - 1) && ValidColumnIndex(column))
            {
                neighbors += m_board[row - 1][column] ? 1 : 0;
            }

            if (ValidRowIndex(row + 1) && ValidColumnIndex(column + 1))
            {
                neighbors += m_board[row + 1][column + 1] ? 1 : 0;
            }

            if (ValidRowIndex(row - 1) && ValidColumnIndex(column - 1))
            {
                neighbors += m_board[row - 1][column - 1] ? 1 : 0;
            }

            if (ValidRowIndex(row + 1) && ValidColumnIndex(column - 1))
            {
                neighbors += m_board[row + 1][column - 1] ? 1 : 0;
            }

            if (ValidRowIndex(row - 1) && ValidColumnIndex(column + 1))
            {
                neighbors += m_board[row - 1][column + 1] ? 1 : 0;
            }

            if (neighbors < 2)
            {
                newBoard[row][column] = false; // underpopulation, dies
            }

            if (neighbors > 3)
            {
                newBoard[row][column] = false; // overpopulation, dies
            }

            if (!m_board[row][column] && neighbors == 3)
            {
                newBoard[row][column] = true; // a cell is born!
            }

            if (neighbors >= 2 && neighbors <= 3 && m_board[row][column])
            {
                newBoard[row][column] = true; // else same as given
            }
        }
    }

    DeleteBoard(m_board);
    m_board = newBoard;
}

bool **GOLObj::GetBoard(void)
{
    return reinterpret_cast<bool **>(m_board);
}

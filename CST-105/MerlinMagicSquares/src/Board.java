import java.util.Random;

public class Board
{
	final int BoardSize = 3;
	final Boolean[][] Toggle0_0 =
    {
        {true, true, false},
        {true, true, false},
        {false, false, false}
    };
    final Boolean[][] Toggle0_1 =
    {
        {true, true, true},
        {false, false, false},
        {false, false, false}
    };
    final Boolean[][] Toggle0_2 =
    {
        {false, true, true},
        {false, true, true},
        {false, false, false}
    };
    final Boolean[][] Toggle1_0 =
    {
        {true, false, false},
        {true, false, false},
        {true, false, false}
    };
    final Boolean[][] Toggle1_1 =
    {
        {false, true, false},
        {true, true, true},
        {false, true, false}
    };
    final Boolean[][] Toggle1_2 =
    {
        {false, false, true},
        {false, false, true},
        {false, false, true}
    };
    final Boolean[][] Toggle2_0 =
    {
        {false, false, false},
        {true, true, false},
        {true, true, false}
    };
    final Boolean[][] Toggle2_1 =
    {
        {false, false, false},
        {false, false, false},
        {true, true, true}
    };
    final Boolean[][] Toggle2_2 =
    {
        {false, false, false},
        {false, true, true},
        {false, true, true}
    };
    public final Boolean[][] WinPattern =
    {
        {true, true, true},
        {true, true, true},
        {true, true, true}
    };
    
    private Boolean[][] m_board = new Boolean[BoardSize][BoardSize];

    public Board()
    {
        for (int row = 0; row < BoardSize; row++)
        {
            for (int column = 0; column < BoardSize; column++)
            {
                m_board[row][column] = false;
            }
        }
    }

    public void InitBoard()
    {
    	Random rand = new Random();
        for (int row = 0; row < BoardSize; row++)
        {
            for (int column = 0; column < BoardSize; column++)
            {
                Boolean state = rand.nextInt(2) == 1;
                m_board[row][column] = state;
            }
        }
    }

    public Boolean BoardMatch(Boolean[][] matchList)
    {
        for (int row = 0; row < BoardSize; row++)
        {
            for (int column = 0; column < BoardSize; column++)
            {
                if (matchList[row][column] != m_board[row][column])
                {
                    return false;
                }
            }
        }

        return true;
    }

    public void ToggleBoard(Boolean[][] toggleList)
    {
        for (var row = 0; row < BoardSize; row++)
        {
            for (var column = 0; column < BoardSize; column++)
            {
                m_board[row][column] ^= toggleList[row][column];
            }
        }
    }

    public Boolean GetCellState(int row, int column)
    {
        if (((row >= BoardSize) || (row < 0)) ||
            ((column >= BoardSize) || (column < 0)))
        {
            return false;
        }

        return m_board[row][column];
    }

    public Boolean Win()
    {
        return BoardMatch(WinPattern);
    }
}

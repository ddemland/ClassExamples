import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTests
{
	final Boolean[][] m_startPattern =
	    {
	        {false, false, false},
	        {false, false, false},
	        {false, false, false}
	    };

	@Test
	void testMatch()
	{
        Board board = new Board();
        assertFalse(board.BoardMatch(board.WinPattern));
        assertTrue(board.BoardMatch(m_startPattern));
	}

	@Test
	void testInit()
	{
        Board board = new Board();
        board.InitBoard();
        assertFalse(board.BoardMatch(m_startPattern));
	}

	@Test
	void testToggle()
	{
        Board board = new Board();
        board.ToggleBoard(board.Toggle0_0);
        assertTrue(board.BoardMatch(board.Toggle0_0));

        board = new Board();
        board.ToggleBoard(board.Toggle0_1);
        assertTrue(board.BoardMatch(board.Toggle0_1));

        board = new Board();
        board.ToggleBoard(board.Toggle0_2);
        assertTrue(board.BoardMatch(board.Toggle0_2));

        board = new Board();
        board.ToggleBoard(board.Toggle1_0);
        assertTrue(board.BoardMatch(board.Toggle1_0));

        board = new Board();
        board.ToggleBoard(board.Toggle1_1);
        assertTrue(board.BoardMatch(board.Toggle1_1));

        board = new Board();
        board.ToggleBoard(board.Toggle1_2);
        assertTrue(board.BoardMatch(board.Toggle1_2));

        board = new Board();
        board.ToggleBoard(board.Toggle2_0);
        assertTrue(board.BoardMatch(board.Toggle2_0));

        board = new Board();
        board.ToggleBoard(board.Toggle2_1);
        assertTrue(board.BoardMatch(board.Toggle2_1));

        board = new Board();
        board.ToggleBoard(board.Toggle2_2);
        assertTrue(board.BoardMatch(board.Toggle2_2));
	}

	@Test
	void testCellState()
	{
        Board board = new Board();
        board.ToggleBoard(board.Toggle0_0);

        assertTrue(board.GetCellState(0, 0));
        assertTrue(board.GetCellState(0, 1));
        assertFalse(board.GetCellState(0, 2));
        assertTrue(board.GetCellState(1, 0));
        assertTrue(board.GetCellState(1, 1));
        assertFalse(board.GetCellState(1, 2));
        assertFalse(board.GetCellState(2, 0));
        assertFalse(board.GetCellState(2, 1));
        assertFalse(board.GetCellState(2, 2));
	}

	@Test
	void testWin()
	{
        Board board = new Board();
        board.ToggleBoard(board.Toggle0_0);
        board.ToggleBoard(board.Toggle2_2);
        board.ToggleBoard(board.Toggle0_2);
        board.ToggleBoard(board.Toggle2_0);
        board.ToggleBoard(board.Toggle1_1);
        assertTrue(board.Win());
	}
}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LockerPuzzleTests {

	@Test
	void testStudent1()
	{
		var lockerSolver = new LockerSolver(10);
		lockerSolver.StudentLockerChange(1);
		var lockerStatus = lockerSolver.GetLockerStatus();
		for (var cnt = 0; cnt < 10; cnt ++)
		{
			assertTrue(lockerStatus[cnt]);
		}
	}

	@Test
	void testStudent2()
	{
		var lockerSolver = new LockerSolver(10);
		lockerSolver.StudentLockerChange(1);
		lockerSolver.StudentLockerChange(2);
		var lockerStatus = lockerSolver.GetLockerStatus();

		assertTrue(lockerStatus[0]);
		assertFalse(lockerStatus[1]);
		assertTrue(lockerStatus[2]);
		assertFalse(lockerStatus[3]);
		assertTrue(lockerStatus[4]);
		assertFalse(lockerStatus[5]);
		assertTrue(lockerStatus[6]);
		assertFalse(lockerStatus[7]);
		assertTrue(lockerStatus[8]);
		assertFalse(lockerStatus[9]);
	}

	@Test
	void testStudent3()
	{
		var lockerSolver = new LockerSolver(10);
		lockerSolver.StudentLockerChange(1);
		lockerSolver.StudentLockerChange(2);
		lockerSolver.StudentLockerChange(3);
		var lockerStatus = lockerSolver.GetLockerStatus();

		assertTrue(lockerStatus[0]);
		assertFalse(lockerStatus[1]);
		assertFalse(lockerStatus[2]);
		assertFalse(lockerStatus[3]);
		assertTrue(lockerStatus[4]);
		assertTrue(lockerStatus[5]);
		assertTrue(lockerStatus[6]);
		assertFalse(lockerStatus[7]);
		assertFalse(lockerStatus[8]);
		assertFalse(lockerStatus[9]);
	}

	@Test
	void testStudent4()
	{
		var lockerSolver = new LockerSolver(10);
		lockerSolver.StudentLockerChange(1);
		lockerSolver.StudentLockerChange(2);
		lockerSolver.StudentLockerChange(3);
		lockerSolver.StudentLockerChange(4);
		var lockerStatus = lockerSolver.GetLockerStatus();

		assertTrue(lockerStatus[0]);
		assertFalse(lockerStatus[1]);
		assertFalse(lockerStatus[2]);
		assertTrue(lockerStatus[3]);
		assertTrue(lockerStatus[4]);
		assertTrue(lockerStatus[5]);
		assertTrue(lockerStatus[6]);
		assertTrue(lockerStatus[7]);
		assertFalse(lockerStatus[8]);
		assertFalse(lockerStatus[9]);
	}

	@Test
	void testStudent5()
	{
		var lockerSolver = new LockerSolver(10);
		lockerSolver.StudentLockerChange(1);
		lockerSolver.StudentLockerChange(2);
		lockerSolver.StudentLockerChange(3);
		lockerSolver.StudentLockerChange(4);
		lockerSolver.StudentLockerChange(5);
		var lockerStatus = lockerSolver.GetLockerStatus();

		assertTrue(lockerStatus[0]);
		assertFalse(lockerStatus[1]);
		assertFalse(lockerStatus[2]);
		assertTrue(lockerStatus[3]);
		assertFalse(lockerStatus[4]);
		assertTrue(lockerStatus[5]);
		assertTrue(lockerStatus[6]);
		assertTrue(lockerStatus[7]);
		assertFalse(lockerStatus[8]);
		assertTrue(lockerStatus[9]);
	}

	@Test
	void testStudent6()
	{
		var lockerSolver = new LockerSolver(10);
		lockerSolver.StudentLockerChange(1);
		lockerSolver.StudentLockerChange(2);
		lockerSolver.StudentLockerChange(3);
		lockerSolver.StudentLockerChange(4);
		lockerSolver.StudentLockerChange(5);
		lockerSolver.StudentLockerChange(6);
		var lockerStatus = lockerSolver.GetLockerStatus();

		assertTrue(lockerStatus[0]);
		assertFalse(lockerStatus[1]);
		assertFalse(lockerStatus[2]);
		assertTrue(lockerStatus[3]);
		assertFalse(lockerStatus[4]);
		assertFalse(lockerStatus[5]);
		assertTrue(lockerStatus[6]);
		assertTrue(lockerStatus[7]);
		assertFalse(lockerStatus[8]);
		assertTrue(lockerStatus[9]);
	}

	@Test
	void testStudent7()
	{
		var lockerSolver = new LockerSolver(10);
		lockerSolver.StudentLockerChange(1);
		lockerSolver.StudentLockerChange(2);
		lockerSolver.StudentLockerChange(3);
		lockerSolver.StudentLockerChange(4);
		lockerSolver.StudentLockerChange(5);
		lockerSolver.StudentLockerChange(6);
		lockerSolver.StudentLockerChange(7);
		var lockerStatus = lockerSolver.GetLockerStatus();

		assertTrue(lockerStatus[0]);
		assertFalse(lockerStatus[1]);
		assertFalse(lockerStatus[2]);
		assertTrue(lockerStatus[3]);
		assertFalse(lockerStatus[4]);
		assertFalse(lockerStatus[5]);
		assertFalse(lockerStatus[6]);
		assertTrue(lockerStatus[7]);
		assertFalse(lockerStatus[8]);
		assertTrue(lockerStatus[9]);
	}

	@Test
	void testStudent8()
	{
		var lockerSolver = new LockerSolver(10);
		lockerSolver.StudentLockerChange(1);
		lockerSolver.StudentLockerChange(2);
		lockerSolver.StudentLockerChange(3);
		lockerSolver.StudentLockerChange(4);
		lockerSolver.StudentLockerChange(5);
		lockerSolver.StudentLockerChange(6);
		lockerSolver.StudentLockerChange(7);
		lockerSolver.StudentLockerChange(8);
		var lockerStatus = lockerSolver.GetLockerStatus();

		assertTrue(lockerStatus[0]);
		assertFalse(lockerStatus[1]);
		assertFalse(lockerStatus[2]);
		assertTrue(lockerStatus[3]);
		assertFalse(lockerStatus[4]);
		assertFalse(lockerStatus[5]);
		assertFalse(lockerStatus[6]);
		assertFalse(lockerStatus[7]);
		assertFalse(lockerStatus[8]);
		assertTrue(lockerStatus[9]);
	}

	@Test
	void testStudent9()
	{
		var lockerSolver = new LockerSolver(10);
		lockerSolver.StudentLockerChange(1);
		lockerSolver.StudentLockerChange(2);
		lockerSolver.StudentLockerChange(3);
		lockerSolver.StudentLockerChange(4);
		lockerSolver.StudentLockerChange(5);
		lockerSolver.StudentLockerChange(6);
		lockerSolver.StudentLockerChange(7);
		lockerSolver.StudentLockerChange(8);
		lockerSolver.StudentLockerChange(9);
		var lockerStatus = lockerSolver.GetLockerStatus();

		assertTrue(lockerStatus[0]);
		assertFalse(lockerStatus[1]);
		assertFalse(lockerStatus[2]);
		assertTrue(lockerStatus[3]);
		assertFalse(lockerStatus[4]);
		assertFalse(lockerStatus[5]);
		assertFalse(lockerStatus[6]);
		assertFalse(lockerStatus[7]);
		assertTrue(lockerStatus[8]);
		assertTrue(lockerStatus[9]);
	}

	@Test
	void testStudent10()
	{
		var lockerSolver = new LockerSolver(10);
		lockerSolver.StudentLockerChange(1);
		lockerSolver.StudentLockerChange(2);
		lockerSolver.StudentLockerChange(3);
		lockerSolver.StudentLockerChange(4);
		lockerSolver.StudentLockerChange(5);
		lockerSolver.StudentLockerChange(6);
		lockerSolver.StudentLockerChange(7);
		lockerSolver.StudentLockerChange(8);
		lockerSolver.StudentLockerChange(9);
		lockerSolver.StudentLockerChange(10);
		var lockerStatus = lockerSolver.GetLockerStatus();

		assertTrue(lockerStatus[0]);
		assertFalse(lockerStatus[1]);
		assertFalse(lockerStatus[2]);
		assertTrue(lockerStatus[3]);
		assertFalse(lockerStatus[4]);
		assertFalse(lockerStatus[5]);
		assertFalse(lockerStatus[6]);
		assertFalse(lockerStatus[7]);
		assertTrue(lockerStatus[8]);
		assertFalse(lockerStatus[9]);
	}
}

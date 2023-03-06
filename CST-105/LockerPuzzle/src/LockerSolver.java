
//
//  How to do the process:
//
//		for (lockerNumber form 1 to 100)  inclusive
//		{
//			locker = closed
//		}
//
//		for (studentNumber 1 to 100)  inclusive
//		{
//			start at locker corresponding to student
//			lockerNumber = studentNumber
//			while (locakerNumber < 100)
//			{
//				toggle locker status
//				add studentNumber to lockerNumber
//			}
//		}
//
//		find all the open lockers
//		for (lockNumber form 1 to 100) inclusive
//		{
//			if (lockerNumber is opened)
//			{
//				print lockerNumber
//			}
//		}
//

public class LockerSolver
{
	private int NumberOfLockers;
	private boolean[] LockerStatus;
	
	public LockerSolver(int numLockers)
	{
		NumberOfLockers = numLockers;
		LockerStatus = new boolean[NumberOfLockers];
	}
	
	public int GetNumberOfLockers()
	{
		return NumberOfLockers;
	}
	
	public void InitLockers()
	{
		for (var lockerCnt = 0; lockerCnt < NumberOfLockers; lockerCnt ++)
		{
			LockerStatus[lockerCnt] = false;
		}
	}
	
	public void StudentLockerChange(int studentNum)
	{
		var lockerNum = studentNum - 1;
		while (lockerNum < NumberOfLockers)
		{
			LockerStatus[lockerNum] = !LockerStatus[lockerNum];
			lockerNum += studentNum;
		}
	}
	
	public boolean[] GetLockerStatus()
	{
		return LockerStatus;
	}
}

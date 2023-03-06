
public class MainDriver {

	public static void main(String[] args)
	{
		var lockerSolver = new LockerSolver(100);
		for (var cnt = 0; cnt < lockerSolver.GetNumberOfLockers(); cnt ++)
		{
			lockerSolver.StudentLockerChange(cnt + 1);
		}

		OutputStats(lockerSolver);

		lockerSolver = new LockerSolver(50);
		for (var cnt = 0; cnt < lockerSolver.GetNumberOfLockers(); cnt ++)
		{
			lockerSolver.StudentLockerChange(cnt + 1);
		}

		OutputStats(lockerSolver);

		lockerSolver = new LockerSolver(1000);
		for (var cnt = 0; cnt < lockerSolver.GetNumberOfLockers(); cnt ++)
		{
			lockerSolver.StudentLockerChange(cnt + 1);
		}

		OutputStats(lockerSolver);
	}
	
	private static void OutputStats(LockerSolver solver)
	{
		var lockerStatus = solver.GetLockerStatus();
		int totalLockers = solver.GetNumberOfLockers();
		System.out.println("Doing " + totalLockers + " lockers:");
		System.out.println("Lockers that are still open:");
		String outputList = "";
		for (var cnt = 0; cnt < totalLockers; cnt ++)
		{
			if (lockerStatus[cnt])
			{
				if (!outputList.isEmpty())
				{
					outputList +=  ", ";
				}

				outputList += Integer.toString(cnt + 1);
			}
		}
		
		System.out.println("    " + outputList);
		System.out.println();
	
	}
}

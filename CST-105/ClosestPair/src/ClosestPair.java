
public class ClosestPair
{
	public static double[][] FindClosestPair(double[][] points)
	{
		int p1 = 0, p2 = 1;
		double shortestDistance = Distance(points[p1][0], points[p1][1],
				points[p2][0], points[p2][1]);
		
		for (var row = 0; row < points.length; row ++)
		{
			for (var column = row + 1; column < points.length; column ++)
			{
				var distance = Distance(points[row][0], points[row][1],
						points[column][0], points[column][1]);
				
				if (shortestDistance > distance)
				{
					p1 = row;
					p2 = column;
					shortestDistance = distance;
				}
			}
		}
		
		double[][] retList = new double[2][2];
		retList[0][0] = points[p1][0];
		retList[0][1] = points[p1][1];
		retList[1][0] = points[p2][0];
		retList[1][1] = points[p2][1];
		return retList;
	}
	
	public static double Distance(double x1, double y1, double x2, double y2)
	{
		return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
	}
}
